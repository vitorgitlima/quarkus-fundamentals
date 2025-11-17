# rest-book

## Curso AGoncal: Começando com Quarkus

Código do curso "Starting with Quarkus" (Começando com Quarkus).

Este curso é para desenvolvedores Java que desejam descobrir o Quarkus. É uma mistura de slides e código para que você possa "Entender e Praticar" ao mesmo tempo. Dessa forma, você aprende a teoria e depois a coloca em prática desenvolvendo uma aplicação passo a passo.

Neste curso, você passará por um ciclo completo de desenvolvimento. Após introduzir o Quarkus, você garantirá que seu ambiente de desenvolvimento esteja configurado e irá desde o bootstrap de uma aplicação Quarkus até executá-la como um container Docker. As diferentes etapas pelas quais você passará são:

- Entender o Quarkus
- Verificar seu ambiente de desenvolvimento
- Colocar a mão na massa com Quarkus
- Expor um endpoint REST usando JAX-RS
- Injetar beans com CDI
- Testar o endpoint REST com JUnit e RESTAssured
- Configurar a aplicação com MicroProfile Configuration
- Configurar o Quarkus
- Adicionar profiles à configuração
- Construir JARs executáveis
- Construir um executável nativo e um executável Linux com GraalVM
- Verificar o desempenho de uma aplicação Quarkus
- Containerizar a aplicação com Docker e executá-la

Ao final do curso, você terá uma boa compreensão do Quarkus. Você será capaz de fazer bootstrap, desenvolver, empacotar e executar uma aplicação REST, mas o mais importante, levar o Quarkus para seu próximo projeto.

---

Este projeto usa Quarkus, o Framework Java Supersônico e Subatômico.

Se você quiser aprender mais sobre Quarkus, visite o site: <https://quarkus.io/>.

## Executando a aplicação em modo de desenvolvimento

Você pode executar sua aplicação em modo de desenvolvimento que habilita live coding usando:

```shell script
./mvnw quarkus:dev
```

> **_NOTA:_**  O Quarkus agora vem com uma Dev UI, que está disponível apenas em modo de desenvolvimento em <http://localhost:8080/q/dev/>.

## Empacotando e executando a aplicação

A aplicação pode ser empacotada usando:

```shell script
./mvnw package
```

Isso produz o arquivo `quarkus-run.jar` no diretório `target/quarkus-app/`.
Esteja ciente de que não é um _über-jar_, pois as dependências são copiadas para o diretório `target/quarkus-app/lib/`.

A aplicação agora pode ser executada usando `java -jar target/quarkus-app/quarkus-run.jar`.

Se você quiser construir um _über-jar_, execute o seguinte comando:

```shell script
./mvnw package -Dquarkus.package.jar.type=uber-jar
```

A aplicação, empacotada como um _über-jar_, agora pode ser executada usando `java -jar target/*-runner.jar`.

## Criando um executável nativo

Você pode criar um executável nativo usando:

```shell script
./mvnw package -Dnative
```

Ou, se você não tiver o GraalVM instalado, pode executar a construção do executável nativo em um container usando:

```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

Você pode então executar seu executável nativo com: `./target/rest-book-1.0.0-SNAPSHOT-runner`

Se você quiser aprender mais sobre construção de executáveis nativos, consulte <https://quarkus.io/guides/maven-tooling>.

## Guias Relacionados

- REST JSON-B ([guia](https://quarkus.io/guides/rest#json-serialisation)): Suporte de serialização JSON-B para Quarkus REST. Esta extensão não é compatível com a extensão quarkus-resteasy, ou qualquer uma das extensões que dependem dela.

## Código Fornecido

### REST

Inicie facilmente seus Web Services REST

[Seção do guia relacionado...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)
