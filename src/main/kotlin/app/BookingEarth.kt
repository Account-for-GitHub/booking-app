package app

class BookingEarth : Booking() {
    override val bookingServiceType: String = "Earth Booking"

    override fun createRoom(type: RoomTypesEnum): Room {
        return when (type) {
            RoomTypesEnum.SINGLE_BED -> EarthSingleBedRoom()
            RoomTypesEnum.SEMI_DOUBLE_BED -> EarthSemiDoubleBedRoom()
            RoomTypesEnum.DOUBLE_BED -> EarthDoubleBedRoom()
        }
    }
}