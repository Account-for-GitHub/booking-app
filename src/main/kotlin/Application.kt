import app.BookingEarth
import app.BookingMoon
import app.RoomTypesEnum

fun main(){
    BookingEarth().bookRoom(RoomTypesEnum.SEMI_DOUBLE_BED).showBookingInfo()
    BookingMoon().bookRoom(RoomTypesEnum.SEMI_DOUBLE_BED).showBookingInfo()
}