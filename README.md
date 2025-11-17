# rest-book

## Fundamentos do Quarkus

Este projeto foi desenvolvido durante meu aprendizado dos fundamentos do Quarkus, baseado no curso "Starting with Quarkus" do AGoncal. O objetivo é consolidar o conhecimento sobre este framework moderno e ter um overview prático de suas principais funcionalidades.

### O que é Quarkus?

Quarkus é um framework Java Supersônico e Subatômico, projetado para GraalVM e OpenJDK HotSpot. Ele foi criado pensando em containers, Kubernetes e arquiteturas nativas da nuvem, oferecendo tempos de inicialização extremamente rápidos e baixo consumo de memória.

### O que foi aprendido

Durante o desenvolvimento deste projeto, explorei um ciclo completo de desenvolvimento com Quarkus, desde o bootstrap da aplicação até sua execução em containers. Os principais conceitos e práticas abordados foram:

#### **Fundamentos**
- Configuração do ambiente de desenvolvimento
- Bootstrap de uma aplicação Quarkus
- Compreensão da arquitetura e filosofia do framework

#### **Desenvolvimento**
- Criação de endpoints REST com JAX-RS
- Injeção de dependências com CDI (Contexts and Dependency Injection)
- Configuração de aplicação usando MicroProfile Configuration
- Gestão de profiles de configuração (dev, test, prod)

#### **Testes**
- Testes de endpoints REST com JUnit 5
- Integração com RESTAssured para testes de API

#### **Build e Deploy**
- Geração de JARs executáveis
- Construção de executáveis nativos com GraalVM
- Análise de performance e otimizações
- Containerização com Docker

### Tecnologias Utilizadas

- **Quarkus 3.29.2** - Framework principal
- **Java 21** - Linguagem de programação
- **Maven** - Gerenciador de dependências e build
- **JAX-RS** - API REST
- **CDI** - Injeção de dependências
- **JSON-B** - Serialização JSON
- **JUnit 5** - Testes unitários
- **RESTAssured** - Testes de API

---

## Como Executar

### Modo de Desenvolvimento (Dev Mode)

O modo de desenvolvimento habilita live coding (hot reload) e a Dev UI:

```shell script
./mvnw quarkus:dev
```

> **Dev UI disponível em:** <http://localhost:8080/q/dev/>

### Build e Empacotamento

**Build padrão (JAR com dependências separadas):**
```shell script
./mvnw clean package
```
Gera: `target/quarkus-app/quarkus-run.jar` (dependências em `target/quarkus-app/lib/`)

**Executar:**
```shell script
java -jar target/quarkus-app/quarkus-run.jar
```

**Build Über-JAR (tudo em um único arquivo):**
```shell script
./mvnw package -Dquarkus.package.jar.type=uber-jar
```

**Executar:**
```shell script
java -jar target/*-runner.jar
```

### Executável Nativo (GraalVM)

Um dos grandes diferenciais do Quarkus é a capacidade de gerar executáveis nativos com GraalVM, resultando em inicialização ultra-rápida e consumo mínimo de memória.

**Com GraalVM instalado localmente:**
```shell script
./mvnw package -Dnative
```

**Sem GraalVM (build em container):**
```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

**Executar o binário nativo:**
```shell script
./target/rest-book-1.0.0-SNAPSHOT-runner
```

> **Nota:** Executáveis nativos inicializam em milissegundos e consomem uma fração da memória comparado à JVM tradicional.

---

## Recursos e Referências

### Extensões Utilizadas
- **Quarkus REST (JAX-RS)** - Endpoints REST reativos
- **Quarkus REST JSON-B** - Serialização JSON
- **Quarkus CDI (Arc)** - Injeção de dependências
- **Quarkus JUnit 5** - Framework de testes
- **REST Assured** - Testes de API REST

### Links Úteis
- [Documentação Oficial do Quarkus](https://quarkus.io/)
- [Guia: REST com Quarkus](https://quarkus.io/guides/rest)
- [Guia: Serialização JSON](https://quarkus.io/guides/rest#json-serialisation)
- [Guia: Testes](https://quarkus.io/guides/getting-started-testing)
- [Guia: Executáveis Nativos](https://quarkus.io/guides/maven-tooling)

---

**Curso base:** [Starting with Quarkus - Antonio Goncalves](https://github.com/agoncal/agoncal-course-quarkus-starting)
