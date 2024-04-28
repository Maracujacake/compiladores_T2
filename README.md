# Trabalho 2 _ Compiladores 2024/1

**Aluno:** Christian Coronel da Silva Polli
**RA:** 798083

## Pré-requisitos

- Java 
```java
sudo apt install openjdk-8-jdk (ou versões mais recentes)
```
- Maven
```python
sudo apt install maven
```
- **Recomendação: Apache NetBeans**
```
disponível no package manager da sua distribuição linux ou no site: https://netbeans.apache.org/front/main/download/index.html
```
- Antlr4
```
deve-se adicionar a dependência no arquivo pom.xml, foi utilizada uma versão antiga devido à segurança e confiança na compatibilidade
```

## Instruções de instalação

Após instalar o Java e Maven na sua máquina (checar com ```java -version``` e ```mvn -version```), deve-se iniciar um projeto com o Maven no NetBeans (ou editor de código/texto de sua escolha).

No arquivo pom.xml deve-se incluir a dependência e plugin do antlr4, assim como o plugin do maven-assembly (pode-se verificar no código presente neste repositório).

Após isso, deve-se criar uma estrutura de pastas identica à criada para guardar a classe principal do projeto, visto que o funcionamento do ANTLR exige que seja desta maneira.
Cria-se, então, um arquivo .g4 que abrigará as regras da linguagem a ser criada e, ao executar o build do projeto, será criado um código Java equivalente àquela linguagem.
Após a criação correta da linguagem no arquivo .g4, pode-se executar o build do projeto.

## Instruções de execução:

O arquivo executável está localizado no caminho:
<br>
```alguma-lexico/target/alguma-lexico-1.0-SNAPSHOT-jar-with-dependencies.jar```
<br>


Para executá-lo, é necessário um arquivo de entrada (.txt) contendo texto (algoritmo na linguagem em questão) e um arquivo de saída (.txt) para verificar possíveis erros sintáticos no algoritmo de entrada.

para clonar o repositório, basta ter o git instalado (``` https://git-scm.com/downloads ```) e utilizar o comando: 
```python
 git clone <url http do repositorio>
``` 
(possível usar ssh e outros métodos que achar melhor)

## <a href="https://docs.google.com/document/d/1nrkkAb3aJWtS2nYpo8nh5Piao0-aO4m55ABC8mVXCgU/edit?usp=sharing"> Mais informações (Documentação) </a>
