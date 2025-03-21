package templatecallback

fun interface PlayStrategy {
    fun play()
}

class ConcretePlayStrategy:PlayStrategy {
    override fun play(){
        println("PLAY 놀아보자")
    }
}

class Player {
    fun play(strategy: PlayStrategy){
        return strategy.play()
    }
}

fun main() {
    val player = Player()
    val strategy = ConcretePlayStrategy()

    player.play(strategy)

    val strategy2 = PlayStrategy { println("두번째로 놀자") }
    player.play(strategy2)

    player.play { println("세번째로 놀자") }
}
