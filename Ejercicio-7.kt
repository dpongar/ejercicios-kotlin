fun main() {
    // Número a descomponer en factores primos
    val numero = 84
    val factores = descomponerEnPrimos(numero)
    println(factores.joinToString(", ")) // Imprime: 2, 2, 3, 7
}

// Función que devuelve un array de factores primos de un número
fun descomponerEnPrimos(n: Int): Array<Int> {
    var numero = n
    val factores = mutableListOf<Int>() // Lista temporal para almacenar los factores
    var divisor = 2 // Comenzamos con el menor número primo

    // Mientras el número sea mayor que 1
    while (numero > 1) {
        if (numero % divisor == 0) { // Si el número es divisible por el divisor
            factores.add(divisor) // Agregamos el divisor a la lista de factores
            numero /= divisor // Dividimos el número por el divisor
        } else {
            divisor++ // Probamos con el siguiente número
        }
    }

    return factores.toTypedArray() // Convertimos la lista a array y la devolvemos
}
