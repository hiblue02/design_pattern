package singleton

class Calculator1 private constructor() {

    companion object {
        private var instance: Calculator1? = null
        private var per = 100

        fun getInstance(): Calculator1 {
            if (instance == null) {
                instance = Calculator1()
            }
            return instance!!
        }
    }

    fun calculatePercent(target: Int):Double{
        return (target/per).toDouble()
    }
}
