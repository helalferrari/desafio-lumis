# Desafio Técnico Lumis

Este projeto contém a resolução dos desafios técnicos propostos, implementados em Java. O sistema consiste em uma aplicação de linha de comando (CLI) com um menu interativo para navegar entre as diferentes questões.

## Pré-requisitos

- **Java Development Kit (JDK)**: Versão 8 ou superior.
- **Git**: Para clonar o repositório.

## Instalação e Execução

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/helalferrari/desafio-lumis.git
    ```

2.  **Navegue até a pasta do projeto:**
    É fundamental estar na pasta `desafios` (onde estão as pastas `src` e `.idea`) para que os comandos funcionem corretamente.
    ```bash
    cd desafio-lumis/desafios
    ```

3.  **Compile o código:**
    Execute o comando abaixo para compilar todos os arquivos Java.
    ```bash
    javac -d bin src/Main.java src/questions/*.java src/logic/*.java src/interfaces/*.java
    ```
    *Isso criará uma pasta `bin` com os arquivos compilados.*

4.  **Execute a aplicação:**
    Utilize a flag `-cp` (classpath) apontando para a pasta `bin`:
    ```bash
    java -cp bin Main
    ```

## Funcionalidades do Menu

O menu principal oferece as seguintes opções correspondentes aos desafios:

1.  **Cálculo de Fatorial**
    - Calcula o fatorial de um número inteiro fornecido pelo usuário (entre 1 e 12) utilizando um método recursivo.

2.  **Verificação de Palíndromo**
    - Verifica se uma palavra fornecida pelo usuário é um palíndromo (lê-se da mesma forma de trás para frente).

3.  **Análise de Bloco de Código**
    - Exibe uma análise explicativa sobre um trecho de código específico (questão teórica).

4.  **Filtragem de Carros (Cor Preta)**
    - Demonstração de manipulação de listas e Streams. Cria uma lista de objetos `Carro` e filtra para exibir apenas os carros da cor "Preto".

5.  **Por que String é Imutável?**
    - Apresenta os principais motivos pelos quais a classe `String` é imutável em Java (Segurança, Thread Safety, String Pool, Caching de HashCode).

6.  **Aspecto Favorito do Java**
    - Breve relato sobre o aspecto favorito da linguagem Java na visão do desenvolvedor.

0.  **Sair**
    - Encerra a aplicação.
