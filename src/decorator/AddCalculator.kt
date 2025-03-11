package decorator

class AddCalculator:Calculator {
    override fun increment(int: Int): Int {
      return int + 1
    }
}
