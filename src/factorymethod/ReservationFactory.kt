package factorymethod

abstract class Accommodation(
    private val name:String,
    private val phone:String
){
    abstract fun reservate(date:String)
    fun calling(){
        println("phone number:${phone}")
    }
}

class Hotel(
    val name: String,
    val phone: String,
    val availabilityOfBreakfast:Boolean,

): Accommodation(name, phone) {
    override fun reservate(date: String) {
        println("${name} Hotel, phone:${phone}, availability Of Breakfast:${availabilityOfBreakfast}")
        println("Your accommodation has been booked for ${date}")
    }
}

class GuestHouse(
    val name: String,
    val phone: String,
    val availabilityOfBreakfast:Boolean,
    val manyOfGuest:Number,
    ): Accommodation(name, phone) {
    override fun reservate(date: String) {
        println("${name} Guest House, phone:${phone}, availability Of Breakfast:${availabilityOfBreakfast}")
        println("You reserved a room for ${manyOfGuest} on ${date}")
    }
}

interface ReservationFactory {
    fun makeAccommodation(name: String, phone: String):Accommodation
}

class HotelFactory:ReservationFactory{
    override fun makeAccommodation(name: String, phone: String):Hotel {
        return Hotel(name, phone, true)
    }
}

class GuestHouseFactory:ReservationFactory {
    override fun makeAccommodation(name: String, phone: String): Accommodation {
        return GuestHouse(name, phone, true, 8)
    }
}

fun main() {
    val hotelFactory = HotelFactory()
    val guestHouseFactory = GuestHouseFactory()

    val hotel = hotelFactory.makeAccommodation("H", "031-000-0000")
    hotel.reservate("2025.03.31")

    val guestHouse = guestHouseFactory.makeAccommodation("G", "031-000-0000")
    guestHouse.reservate("2025.03.31")

}
