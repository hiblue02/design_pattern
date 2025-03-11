package decorator

class OneCalculatorDecorator(calculator: Calculator): CalculatorDecorator(calculator) {
    override fun substract(int: Int): Int {
        return int - 1
    }
}
