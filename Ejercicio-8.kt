fun main() {
    val numero = 153
    val esArmstrong = esNumeroArmstrong(numero)
    println("$numero es Armstrong? $esArmstrong") // Imprime: 153 es Armstrong? true
}

// Función que verifica si un número es igual a la suma de sus dígitos elevados a la cantidad de dígitos
fun esNumeroArmstrong(n: Int): Boolean {
    val digitos = n.toString().map { it.toString().toInt() } // Convertimos el número a lista de dígitos
    val cantidadDigitos = digitos.size // Obtenemos la cantidad de dígitos

    // Calculamos la suma de cada dígito elevado a la cantidad de dígitos
    val suma = digitos.sumOf { it.toDouble().pow(cantidadDigitos).toInt() }

    return n == suma // Comparamos el número original con la suma calculada
}
