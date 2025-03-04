package singleton

class Calculator2 private constructor() {

    companion object {

        private var instance: Calculator2? = null
        private var per = 100

        fun getInstance(): Calculator2 {
            if (instance == null) {
                synchronized(this) {
                    if (instance == null) {
                        instance = Calculator2()
                    }
                }
            }
            return instance!!
        }
    }

    fun calculatePercent(target: Int): Double {
        return (target / per).toDouble()
    }
}
