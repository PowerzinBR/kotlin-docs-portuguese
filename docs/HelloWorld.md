# Hello World em Kotlin

No Kotlin:
o `fun()` é usada pra declarar uma função,
a função `main()` é onde o programa começa,
o corpo de uma função é escrito em `{}`,
o `println()` e `print()` é usado para imprimir os argumentos para o output padrão.

Uma função em Kotlin seria:

```kotlin
fun main() {
    println("Hello, World!")
    // Hello, World em Kotlin
}
```

# Variáveis

`val` é usado para declarar valores imutáveis, ou seja uma vez que o valor é atribuido, não poderá ser retribuido um novo valor.
`var` é usado para declarar variáveis mutáveis. Significa que você pode reatribuir um novo valor

E isso ficaria assim:

```kotlin
// Variável imutável
val Idade: Int = 25

// Variável mutável
var nome: String = "Kotlin"
nome = "Java"

```

# Padrões de string

É útil saber como imprimir o conteúdo de uma variável para um output padrão. Você pode usar padrões de expressão para acessar dados armazenados em variáveis e outros objetos. Um valor string é uma sequência de caractéres em aspas `"`. Padrões de expressão sempre começam com um sinal de dólar `$`

Um exemplo seria assim:
```kotlin
val clientes = 10

// Tem 10 clientes
println("Tem ${clientes} clientes.")

// Tem 11 clientes
println("tem ${clientes + 1} clientes.")
```