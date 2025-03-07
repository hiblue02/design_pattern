package strategy

interface CalculatorStrategy {
    fun process(int:Int):Int
}

class IncrementCalculator:CalculatorStrategy{
    override fun process(int: Int): Int {
       return int + 1
    }
}

class SquareCalculator:CalculatorStrategy {
    override fun process(int: Int): Int {
        return int * int
    }
}
