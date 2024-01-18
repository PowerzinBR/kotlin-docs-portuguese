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

fun main() {
    inferTypes()
}