fun main() {
val numero = 5
    println("El factorial de $numero es ${factorial(numero)}")
}
/**
 * (n:Int) Indica que recibe un parametro n entero
 * : Int indica que duevuelve un valor entero -> factorial de 5 
 * */
fun factorial(n: Int): Int{  
    //Se crea una variable mutable resultado de tipo Int inicializada en 1.
    var resultado = 1
    //for (i in 1..n) significa: "para cada número i desde 1 hasta n inclusive".
    for (i in 1..n) {
        resultado *= i
    }
    return resultado
}
