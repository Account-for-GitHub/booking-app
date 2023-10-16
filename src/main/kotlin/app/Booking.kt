package app

abstract class Booking {
    abstract val bookingServiceType: String

    fun bookRoom(type: RoomTypesEnum): Room {
        line()
        println(bookingServiceType)
        line()
        return createRoom(type)
    }

    protected abstract fun createRoom(type: RoomTypesEnum): Room
}
