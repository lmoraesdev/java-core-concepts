# 🔐 CI/CD Security Guide

## Visão Geral

Este documento descreve as medidas de segurança implementadas no pipeline CI/CD do projeto **java-core-concepts**.

---

## 📋 Arquitetura de Segurança

```
┌─────────────────────────────────────────────────────────────┐
│                    GitHub Repository                         │
├─────────────────────────────────────────────────────────────┤
│  ↓ Push/PR                                                   │
│  ├─→ [1] Security Check (Trivy)                             │
│  │   └─→ Scans filesystem para CVEs                         │
│  ├─→ [2] Build & Test (Maven)                               │
│  │   └─→ Compila com Java 25                                │
│  │   └─→ Roda 89 testes                                     │
│  │   └─→ Publica resultados                                 │
│  └─→ [3] Dependency Check                                   │
│      └─→ Verifica vulnerabilidades de dependências          │
└─────────────────────────────────────────────────────────────┘
```

---

## 🔒 Componentes de Segurança

### 1️⃣ Trivy Filesystem Scanner
**O que faz**: Escaneia o código-fonte e dependências em busca de vulnerabilidades conhecidas

**Resultados**: Reportados no GitHub Security tab como SARIF

**Frequência**: A cada push/PR

```yaml
- name: Run Trivy vulnerability scanner
  uses: aquasecurity/trivy-action@0.24.0
  with:
    scan-type: 'fs'
    format: 'sarif'
```

### 2️⃣ Maven Build Verification
**O que faz**:
- Compila código (main + test)
- Executa 89 testes
- Verifica cobertura de testes
- Valida dependências Maven

**Modo Strict**:
- `-B` = Batch mode (sem interatividade)
- `-DskipTests=false` = Força execução de testes
- `-Dspotbugs.skip=false` = Ativa análise de bugs

### 3️⃣ Dependency Security Check
**O que faz**:
- Lista árvore de dependências
- Detecta desatualizações
- Avisa sobre vulnerabilidades conhecidas

---

## 🎯 Permissões Minimizadas (Least Privilege)

Cada job tem apenas as permissões necessárias:

```yaml
permissions:
  contents: read              # ✅ Lê código
  checks: write               # ✅ Publica resultados de testes
  pull-requests: write        # ✅ Comenta em PRs
  security-events: write      # ✅ Reporta vulnerabilidades
```

**O que NÃO pode fazer**:
- ❌ Não pode fazer push de código
- ❌ Não pode deletar branches
- ❌ Não pode criar releases
- ❌ Não pode acessar secrets diretamente

---

## 🔑 Secrets & Variáveis

### Variáveis de Ambiente
```yaml
env:
  JAVA_VERSION: '25'
  MAVEN_OPTS: '-Dorg.slf4j.simpleLogger.defaultLogLevel=warn'
```

✅ **Seguro**: Públicas, configuráveis, sem dados sensíveis

### Secrets (Se precisar adicionar)
```yaml
# Nunca use em logs!
- name: Example
  run: echo ${{ secrets.MY_SECRET }}
  # ✅ GitHub automaticamente mascara em logs
```

---

## 📈 Fluxo de Segurança para PRs

```
1. Você faz um Push/PR
   ↓
2. GitHub Actions inicia
   ├─ Security Check roda (Trivy)
   ├─ Build & Test roda (Maven)
   └─ Dependency Check roda
   ↓
3. Resultados aparecem em:
   └─ PR Checks ✅/❌
   └─ Security tab
   └─ Comentário automático no PR
   ↓
4. Antes de fazer Merge:
   ├─ Todos os checks devem passar ✅
   ├─ Sem vulnerabilidades críticas
   └─ Pelo menos 1 aprovação
```

---

## 📊 Branch Protection Rules

**Recomendado para `main` e `develop`:**

```
✅ Require status checks to pass before merging
   ├─ Security Checks
   ├─ Build & Test
   └─ Dependency Check

✅ Require code reviews before merging
   └─ Dismiss stale review approvals
   └─ Require review from code owners

✅ Require branches to be up to date before merging

✅ Include administrators
   └─ Admins também precisam seguir as rules
```

**Como configurar** (GitHub CLI):
```bash
gh repo rule create \
  --branch main \
  --type pull_request_required \
  --type require_status_checks \
  --type require_approvals
```

---

## 🚀 Boas Práticas Locais

### Antes de fazer Push

1. **Verificar localmente**:
```bash
mvn clean verify -DskipTests=false
```

2. **Verificar dependências**:
```bash
mvn dependency:tree
mvn dependency:check
```

3. **Usar git hooks** (opcional):
```bash
cp scripts/git-hooks/pre-commit .git/hooks/pre-commit
chmod +x .git/hooks/pre-commit
```

### Durante o PR

1. **Revisar GitHub Actions logs**
   - Testes devem passar ✅
   - Nenhuma vulnerabilidade detectada ✅
   - Build sucesso ✅

2. **Revisar comentário automático**
   - Mostra quantidade de testes
   - Mostra status de build
   - Mostra versão do Java

---

## 🔄 Atualizações Automáticas (Dependabot)

### Como funciona
- **Semanal**: Scans por atualizações
- **Automático**: Cria PRs com updates
- **Seguro**: Roda CI/CD em cada PR

### Exemplos de PRs Automáticas

```
📦 deps: bump junit-jupiter from 5.10.0 to 5.10.1
   ├─ Tipo: Patch update
   ├─ Segurança: Scan-dependent
   └─ Auto-merge: (opcional) Só patches seguras
```

---

## 📋 Checklist de Segurança

**Antes de fazer Merge:**

- [ ] CI/CD passou ✅
- [ ] Nenhuma vulnerabilidade no Trivy ✅
- [ ] Todos os 89 testes rodaram ✅
- [ ] Dependências revisadas ✅
- [ ] Código revisado por outro dev ✅
- [ ] Branch atualizado com `develop` ✅

**Antes de Deploy:**

- [ ] Tag de release criada ✅
- [ ] CHANGELOG atualizado ✅
- [ ] Versão em pom.xml atualizada ✅
- [ ] Release notes documentadas ✅

---

## 🆘 Troubleshooting

### ❌ Build falha com "dependency not found"
```bash
mvn clean install -U  # -U força download de snapshots
```

### ❌ Trivy reporta vulnerabilidade falsa
- Adicione em `trivy-results.sarif`: `severity: LOW`
- Ou ignore com comentário no código

### ❌ Testes falhando no GitHub mas passando localmente
```bash
# Reproduza o ambiente exato
JAVA_HOME=/path/to/java-25 mvn clean verify
```

### ❌ PR não consegue fazer merge
- Verifique se branch está atualizado
- Rebase: `git rebase develop`
- Push: `git push --force-with-lease`

---

## 📞 Contato & Suporte

**Segurança**:
- Email: lbc_m@your-domain.com
- GitHub: @lbc_m
- Issues: Marque com `security` label

**Documentação**:
- [GitHub Security Advisories](https://github.com/advisories)
- [Maven Security Tips](https://maven.apache.org/security-tips.html)
- [Java Security](https://docs.oracle.com/en/java/javase/25/security/)

---

**Última atualização**: 22 de Abril de 2026
**Status**: ✅ Todos os controles ativos
