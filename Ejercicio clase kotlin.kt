// Clase que representa un punto en el plano cartesiano 2D
class Punto(var x: Double, var y: Double) {

    // Constructor que inicializa el punto en el origen (0,0)
    constructor() : this(0.0, 0.0)

    // Metodo para mover el punto a una nueva posicion
    fun mover(nuevaX: Double, nuevaY: Double) {
        x = nuevaX
        y = nuevaY
    }

    // Metodo que calcula la distancia entre este punto y otro punto
    fun distanciaA(otro: Punto): Double {
        val dx = otro.x - x
        val dy = otro.y - y
        return Math.sqrt(dx * dx + dy * dy) // formula de distancia euclidiana
    }

    // Sobrecarga del operador + para sumar dos puntos
    operator fun plus(otro: Punto): Punto {
        return Punto(x + otro.x, y + otro.y)
    }

    // Sobrecarga del operador - para restar dos puntos
    operator fun minus(otro: Punto): Punto {
        return Punto(x - otro.x, y - otro.y)
    }

    // Implementacion del metodo equals para comparar dos puntos
    override fun equals(other: Any?): Boolean {
        // Verifica si el otro objeto es un Punto
        if (other !is Punto) return false
        // Compara las coordenadas (usando ==, adecuado para Double en este caso simple)
        return x == other.x && y == other.y
    }

    // Sobreescribo toString() para imprimir el punto 
    override fun toString(): String {
        return "Punto(x=$x, y=$y)"
    }
}

// Programa principal 
fun main() {
    val p1 = Punto(3.0, 4.0)
    val p2 = Punto(1.0, 2.0)
    val p3 = Punto() // usa un constructor 

    println("P1: $p1")
    println("P2: $p2")
    println("P3 (origen): $p3")

    // Mover un punto
    p3.mover(5.0, 7.0)
    println("P3 movido a: $p3")

    // Calcular distancia
    println("Distancia entre P1 y P2: ${p1.distanciaA(p2)}")

    // Sumar y restar puntos
    println("P1 + P2 = ${p1 + p2}")
    println("P1 - P2 = ${p1 - p2}")

    // Comparar puntos
    println("¿P1 == P2? ${p1 == p2}")
    println("¿P1 == Punto(3.0, 4.0)? ${p1 == Punto(3.0, 4.0)}")
}


