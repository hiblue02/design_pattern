package singleton

class Calculator5 private constructor() {

    private object Holder {
        val INSTANCE: Calculator5 = Calculator5()

    }

    companion object {

        private var per = 100

        fun getInstance(): Calculator5 {
            return Holder.INSTANCE
        }
    }

    fun calculatePercent(target: Int): Double {
        return (target / per).toDouble()
    }
}
