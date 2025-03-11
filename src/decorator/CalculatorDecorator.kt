package decorator

abstract class CalculatorDecorator(private val calculator: Calculator): Calculator{

    override fun increment(int: Int): Int {
        return calculator.increment(int)
    }

    abstract fun substract(int: Int):Int
}
