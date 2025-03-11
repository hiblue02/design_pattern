package decorator

class TwoCalculatorDecorator(calculator: Calculator) : CalculatorDecorator(calculator) {
    override fun substract(int: Int): Int {
        return int - 2
    }

}
