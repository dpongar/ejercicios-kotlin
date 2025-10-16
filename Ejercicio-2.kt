fun main() {
    val a = 36
    val b = 60
    println("El MCD de $a y $b es ${mcd(a, b)}")
}

fun mcd(x: Int, y: Int): Int {
    var a = x
    var b = y

    // Aseguro que los numeros sean positivos
    if (a < 0) a = -a
    if (b < 0) b = -b


    while (b != 0) {
        val temp = b
        b = a % b
        a = temp
    }

    return a
}
