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


   
