# 🔒 Security Policy

## Reporting Security Vulnerabilities

Se você descobrir uma vulnerabilidade de segurança, **não abra uma issue pública**. Em vez disso:

1. **Envie um MR** :
   - Descrição da vulnerabilidade
   - Passos para reproduzir
   - Impacto potencial
   - Versão afetada

2. **Aguarde resposta** dentro de 48 horas
3. **Aguarde patch** antes de divulgar publicamente

---

## 🛡️ Segurança do CI/CD

Este projeto implementa as seguintes medidas de segurança:

### ✅ Controles de Acesso
- **Permissões Mínimas**: Cada job tem apenas as permissões necessárias
- **Read-Only by Default**: Conteúdo é apenas lido durante builds
- **No Secrets in Logs**: Variáveis sensíveis nunca aparecem nos logs

### ✅ Verificações de Segurança
- **Trivy Scanning**: Análise de vulnerabilidades no filesystem
- **Dependency Check**: Verificação automática de dependências
- **SBOM Generation**: Bill of Materials para auditoria

### ✅ Proteção de Branches
- **Branch Protection**: `main` e `develop` requerem PR review
- **Status Checks**: Todos os testes devem passar
- **Signed Commits**: Recomendado para produção

### ✅ Auditoria
- **GitHub Security Advisories**: Vulnerabilidades reportadas no GitHub
- **Dependabot Updates**: Atualizações automáticas de dependências
- **Action Pinning**: Ações do GitHub fixadas por versão

---

## 📋 Checklist para MRs Seguros

Antes de fazer um Merge Request, verifique:

- [ ] **Testes passando**: `mvn clean verify` ✅
- [ ] **Sem vulnerabilidades**: Nenhum erro do Trivy
- [ ] **Dependências atualizadas**: `mvn dependency:tree`
- [ ] **Código revisado**: Pelo menos 1 aprovação
- [ ] **Branch atualizado**: Sem conflitos com `develop`
- [ ] **Mensagem clara**: Descrição do que foi alterado

---

## 🔐 Java Security

### Versão
- **Java**: 25 LTS (suporte até 2031)
- **Maven**: 3.8.7+
- **JUnit**: 5.10.0

### Dependências
- **0 CVEs Críticas**: Verificadas automaticamente
- **Scan semanal**: Dependabot atualiza automaticamente

### Boas Práticas
```bash
# Verifica vulnerabilidades
mvn org.apache.maven.plugins:maven-dependency-plugin:3.6.0:tree

# Atualiza para versões mais novas
mvn versions:display-dependency-updates

# Testa localmente antes de fazer push
mvn clean verify -DskipTests=false
```

---

## 🚀 Deploy Seguro

Quando estiver pronto para deploy:

1. **Merge para `main`** (requer aprovação)
2. **CI/CD roda automaticamente**
3. **Artifacts assinados** (GitHub Actions)
4. **Release notes** documentados

---

## 📚 Referências

- [GitHub Security Advisories](https://github.com/advisories)
- [OWASP Top 10](https://owasp.org/Top10/)
- [Java Security Coding Guidelines](https://www.securecoding.cert.org/)
- [Maven Security](https://maven.apache.org/security-tips.html)

---

**Última atualização**: 22 de Abril de 2026
**Versão do Projeto**: java-core-concepts v1.0
