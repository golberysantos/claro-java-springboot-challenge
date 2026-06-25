# Desafio Controle de Fluxo

Projeto desenvolvido como parte do **Bootcamp Claro - Java com Spring Boot** na plataforma [DIO](https://www.dio.me/).
Desafio: https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/controle-fluxo
---

## Descrição

O programa recebe dois números inteiros via terminal e imprime uma sequência de mensagens numeradas com base na diferença entre eles.  
Se o primeiro parâmetro for maior que o segundo, o sistema lança uma exceção customizada de negócio.

---

## Estrutura do Projeto

```
DesafioControleFluxo/
├── src/
│   └── br/
│       └── com/
│           └── desafiocontrolefluxo/
│               ├── Contador.java
│               └── ParametrosInvalidosException.java
└── README.md
```

---

## Classes

### `Contador.java`

Classe principal. Responsável por:
- Ler os dois parâmetros via `Scanner`
- Chamar o método `contar()`
- Capturar a `ParametrosInvalidosException` e exibir a mensagem de erro

### `ParametrosInvalidosException.java`

Exceção customizada de negócio. Estende `Exception` (Checked Exception), o que obriga quem chama o método `contar()` a tratar explicitamente via `try-catch` ou declarar `throws` na assinatura.

```java
public class ParametrosInvalidosException extends Exception {
    private static final long serialVersionUID = 1L;

    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}
```

---

## Como Executar

**Pré-requisito:** JDK 17 ou superior instalado.

**1. Compilar:**
```bash
javac -d bin src/br/com/desafiocontrolefluxo/*.java
```

**2. Executar:**
```bash
java -cp bin br.com.desafiocontrolefluxo.Contador
```

**3. Informar os parâmetros quando solicitado:**
```
Digite o primeiro parâmetro
12
Digite o segundo parâmetro
30
```

---

## Exemplos

### Cenário válido — segundo parâmetro maior

**Entrada:**
```
parametroUm  = 12
parametroDois = 30
```

**Saída:**
```
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
...
Imprimindo o número 18
```

> A diferença entre 30 e 12 é 18 — logo o `for` executa 18 iterações.

---

### Cenário inválido — primeiro parâmetro maior

**Entrada:**
```
parametroUm  = 30
parametroDois = 12
```

**Saída:**
```
O segundo parâmetro deve ser maior que o primeiro
```

---

## Por que `ParametrosInvalidosException` é Checked?

Em Java, a escolha entre Checked e Unchecked Exception segue uma regra de responsabilidade:

| Tipo | Quando usar |
|---|---|
| **Unchecked** (`extends RuntimeException`) | Erro de lógica interna — o programador deveria ter prevenido |
| **Checked** (`extends Exception`) | Condição de negócio que quem chama precisa conhecer e tratar |

Neste caso, passar parâmetros fora de ordem é uma **regra de negócio do sistema**, não um bug de programação. Por isso a exceção é Checked — o compilador garante que quem chamar `contar()` saiba que esse cenário pode ocorrer e trate explicitamente.

---

## Tecnologias

- Java 17+
- Scanner (java.util)
- Exceções customizadas (Checked Exception)
- Estruturas de controle de fluxo (`if`, `for`, `try-catch`)

---

## Autor

Desenvolvido durante o **Bootcamp Claro - Java com Spring Boot**  
Plataforma: [DIO — Digital Innovation One](https://www.dio.me/)
Desafio: https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/controle-fluxo
