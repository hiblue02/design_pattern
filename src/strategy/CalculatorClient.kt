package strategy

class CalculatorClient {
    fun increment(int:Int): Int {
        val context = CalculatorContext(IncrementCalculator())
        return context.process(int)
    }

    fun square(int: Int): Int{
        val context = CalculatorContext(SquareCalculator())
        return context.process(int)
    }
}
