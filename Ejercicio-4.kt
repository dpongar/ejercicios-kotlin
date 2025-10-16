fun main() {
    val numero = 29
    if (esPrimo(numero)) {
        println("$numero es un número primo")
    } else {
        println("$numero no es un número primo")
    }
}

fun esPrimo(n: Int): Boolean {
    if (n <= 1) return false          // 0 y 1 no son primos
    if (n == 2) return true           // 2 es primo
    if (n % 2 == 0) return false      // múltiplos de 2 no son primos

    // Revisamos divisores impares hasta la raíz cuadrada de n
    for (i in 3..Math.sqrt(n.toDouble()).toInt() step 2) {
        if (n % i == 0) return false
    }
    return true
}
