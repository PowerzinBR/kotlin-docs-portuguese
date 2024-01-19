fun inferTypes() {
    var clientes: Int

    clientes = 125
    clientes = clientes + 3 // Exemplo de adição: 133
    clientes += 7 // Exemplo de adição: 137
    clientes -= 3 // Exemplo de subtração: 127
    clientes *= 2 // Exemplo de multiplicação: 260
    clientes /= 3 // Exemplo de divisão: 43

    println(clientes)
}

fun example() {
    val a: Int = 1000 // Int
    val b: String = "power" // String
    val c: Double = 3.14 // Double
    val d: Long = 100_000_000_000_000 // Long
    val e: Boolean = false // Boolean
    val f: Char = '\n' // Char

    println("$a | $b | $c | $d | $e | $f")
}

fun main() {
    example()
    inferTypes()
}