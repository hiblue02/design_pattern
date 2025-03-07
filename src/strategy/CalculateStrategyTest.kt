package strategy

fun main() {
    val calculator = CalculatorClient()
    println("square 10: "+calculator.square(10))
    println("increment 10: "+calculator.increment(10))
}
