package singleton

class Calculator3 private constructor() {

    companion object {
        private var instance: Calculator3 = Calculator3()
        private var per = 100

        fun getInstance(): Calculator3 {
            return instance
        }
    }

    fun calculatePercent(target: Int):Double{
        return (target/per).toDouble()
    }
}
