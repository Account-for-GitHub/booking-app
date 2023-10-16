package app

class BookingMoon : Booking() {
    override val bookingServiceType: String = "Moon Booking"

    override fun createRoom(type: RoomTypesEnum): Room {
        return when (type) {
            RoomTypesEnum.SINGLE_BED -> MoonSingleBedRoom()
            RoomTypesEnum.SEMI_DOUBLE_BED -> MoonSemiDoubleBedRoom()
            RoomTypesEnum.DOUBLE_BED -> MoonDoubleBedRoom()
        }
    }
}