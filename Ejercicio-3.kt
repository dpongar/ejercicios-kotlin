fun main() {
    val a = 36
    val b = 60

    println("El MCM de $a y $b es ${mcmDirecto(a, b)}")
}

fun mcmDirecto(a: Int, b: Int): Int {
    if (a == 0 || b == 0) return 0  // Si alguno es 0, el MCM es 0

    var multiplo = maxOf(a, b) // Empezamos desde el mayor de los dos
    while (true) {
        if (multiplo % a == 0 && multiplo % b == 0) {
            return multiplo // Encontramos el primer múltiplo común
        }
        multiplo++
    }
}
