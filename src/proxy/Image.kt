package proxy

interface Image {
    fun display()
}

class JpgImage(fileName: String) : Image {

    init {
        loadFromDisk()
    }

    override fun display() {
        println("JPG IMAGE")
    }

    private fun loadFromDisk() {
        println("LOAD FROM DISK")
    }
}

class ProxyImage(
    private val fileName: String
) : Image {
    private var jpgImage: JpgImage? = null
    override fun display() {
        if (jpgImage == null) {
            jpgImage = JpgImage(fileName)
        }
        jpgImage?.display()
    }
}

fun main() {
    val image = ProxyImage("example.jpg")
    image.display()
    image.display()
}
