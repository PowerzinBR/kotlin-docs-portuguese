# Tipos Básicos

Toda variável e estrutura de dados no Kotlin tem um tipo de **dado**. Tipos de dado (Data Types) são importantes porque dizem o compilador oque você está permitido a fazer com aquela variável ou estrutura de dados. Resumidamente, quais as propriedades que funções e variáveis tem.

No capítulo **Hello World**, Kotlin foi capaz de dizer que no exemplo de clientes tem um tipo `Int` a habilidade de Kotlin de inferir o tipo de dado é chamado de **Tipos de Inferência** (Type Inference). `clientes` foi atríbuido um valor inteiro. Por isso que o Kotlin infere que a variável `clientes` tem um tipo de dado númerico: `Int`. O resultado é que o compilador (`kotlinc`) sabe que você pode performar operações aritiméticas com a variável `clientes`.

```kotlin

var clientes = 130

clientes = 125

clientes = clientes + 3 // Exemplo de adição: 133
clientes += 7 // Exemplo de adição: 137
clientes -= 3 // Exemplo de subtração: 127
clientes *= 2 // Exemplo de multiplicação: 260
clientes /= 3 // Exemplo de divisão: 43

println(clientes)

```

No total, o Kotlin tem os seguintes tipos básicos:
| Categoria | Tipos Básicos |
|-------------|-------------|
| Inteiros    | `Byte, Short, Int, Long`    | 
| Inteiros não-assinados   | `UByte, UShort, UInt, ULong`    | 
| Números de ponto flutuante   | `Float, Double` |
| Booleans | `Boolean` |
| Caractéres | `Char` |
| Strings | `String` |


# Prática
```kotlin
fun main() {
    val a = 1000 // Int
    val b = "power" // String
    val c = 3.14 // Double
    val d = 100_000_000_000_000 // Long
    val e = false // Boolean
    val f = '\n' // Char


```

Então, quando rodei o arquivo...
```bash
InferTypes.kt:15:16: error: unexpected tokens (use ';' to separate expressions on the same line)
    val a = Int: 1000 // Int
               ^
InferTypes.kt:16:19: error: unexpected tokens (use ';' to separate expressions on the same line)
    val b = String: "power" // String
                  ^
InferTypes.kt:17:19: error: unexpected tokens (use ';' to separate expressions on the same line)
    val c = Double: 3.14 // Double
                  ^
InferTypes.kt:18:17: error: unexpected tokens (use ';' to separate expressions on the same line)
    val d = Long: 100_000_000_000_000 // Long
                ^
InferTypes.kt:19:20: error: unexpected tokens (use ';' to separate expressions on the same line)
    val e = Boolean: false // Boolean
                   ^
InferTypes.kt:20:17: error: unexpected tokens (use ';' to separate expressions on the same line)
    val f = Char: '\n' // Char
```

Então vamos resolver isso de forma rápida,<br />
ah, eu entendo o erro agora.
Eu botei defini as variáveis **imutáveis** (expliquei no capítulo anterior) desse jeito aqui:

```kotlin
fun example() {
    val a = Int: 1000 // Int
    val b = String: "power" // String
    val c = Double: 3.14 // Double
    val d = Long: 100_000_000_000_000 // Long
    val e = Boolean: false // Boolean
    val f = Char: '\n' // Char

    println("${a + b} | ${c + d} | ${d + e + f} ")
}
```
E isso está muito errado!
O correto seria:
```kotlin
    val a: Int = 1000 // Int
    val b: String = "power" // String
    val c: Double = 3.14 // Double
    val d: Long = 100_000_000_000_000 // Long
    val e: Boolean = false // Boolean
    val f: Char = '\n' // Char

    println("$a | $b | $c | $d | $e | $f")
```

Ah, e se você está perguntando qual foi o resultado:
<img src="./img/CompilerKotlin.png">