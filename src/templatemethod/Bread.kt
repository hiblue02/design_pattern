package templatemethod

interface Bread {
    fun make() {
        prepareIngredient()
        knead()
        ferment()
        bake()
        serve()
    }

    fun prepareIngredient()
    fun knead()
    fun ferment()
    fun bake()
    fun serve() {
        println("접시에 담아낸다.")
    }
}

class Baguette:Bread {
    override fun prepareIngredient() {
        println("밀가루, 물, 소금, 이스트를 준비한다.")
    }

    override fun knead() {
        println("밀가루, 물, 소금, 이스트를 섞어 반죽한다")
    }

    override fun ferment() {
        println("30분 동안 발효한다.")
    }

    override fun bake() {
        println("오븐에 넣어 180도에서 30분간 굽는다.")
    }
}

class Ciabatta:Bread {
    override fun prepareIngredient() {
        println("밀가루, 물, 소금, 이스트, 올리브오일을 준비한다.")
    }

    override fun knead() {
        println("밀가루, 물, 소금, 이스트, 올리브오일을 섞어 반죽한다")
    }

    override fun ferment() {
        println("2시간 동안 발효한다.")
    }

    override fun bake() {
        println("오븐에 넣어 220도에서 20분간 굽는다.")
    }
}

fun main() {
    val ciabatta = Ciabatta()
    ciabatta.make()
}
