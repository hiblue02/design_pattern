package adaptor

object UmsUtil{
    fun send(messge: String):Boolean{
        println("UMS::${messge}")
        return true
    }
}

object SlackUtil{
    fun send(messge: String):Boolean{
        println("SLACK::${messge}")
        return true
    }
}

interface Alert {
    fun send(messge: String)
    fun sendUms(messge: String)
    fun sendSlack(messge: String)

}

object AlertUtil : Alert {

    override fun send(messge:String){
       val success = SlackUtil.send(messge)

        if(!success) {
            UmsUtil.send(messge)
        }
    }

    override fun sendUms(messge: String){
        UmsUtil.send(messge)
    }

    override fun sendSlack(messge: String){
        SlackUtil.send(messge)
    }
}

fun main() {
    AlertUtil.send("MESSAGE")
    AlertUtil.sendUms("MESSAGE")
    AlertUtil.sendSlack("MESSAGE")
}


