fun main() {
    // Llamamos a la función para obtener los primeros 5 números primos
    val primeros5Primos = obtenerPrimos(5)
    println(primeros5Primos) // Imprime la lista de números primos
}

// Función que devuelve una lista con 'cantidad' números primos
fun obtenerPrimos(cantidad: Int): List<Int> {
    val primos = mutableListOf<Int>() // Creamos una lista mutable para almacenar los primos
    var numero = 2 // Comenzamos a verificar desde el número 2, el primer número primo

    // Mientras no tengamos la cantidad deseada de primos
    while (primos.size < cantidad) {
        if (esPrimo(numero)) { // Verificamos si el número actual es primo
            primos.add(numero) // Si es primo, lo agregamos a la lista
        }
        numero++ // Pasamos al siguiente número
    }

    return primos // Devolvemos la lista de números primos
}

// Función que verifica si un número es primo
fun esPrimo(n: Int): Boolean {
    if (n < 2) return false // Los números menores que 2 no son primos

    // Verificamos si el número tiene divisores distintos de 1 y él mismo
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) {
            return false // Si encontramos un divisor, no es primo
        }
    }

    return true // Si no encontramos divisores, es primo
}
