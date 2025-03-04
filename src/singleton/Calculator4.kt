package singleton

class Calculator4 private constructor() {

    companion object {
        @Volatile
        private var instance: Calculator4? = null
        private var per = 100

        fun getInstance(): Calculator4 {
            if(instance == null) {
                synchronized(this) {
                    if (instance == null) {
                        instance = Calculator4()
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
