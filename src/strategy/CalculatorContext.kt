package strategy

class CalculatorContext(private val calculatorStrategy: CalculatorStrategy) {
    fun process(int: Int) = calculatorStrategy.process(int)
}
