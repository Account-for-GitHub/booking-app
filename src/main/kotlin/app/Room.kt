package app

abstract class Room {
    protected abstract val roomLocation: String
    protected abstract val roomInfo: RoomTypesEnum

    private var transferTo: AdditionalService? = null
    private var baggageDeliveryTo: AdditionalService? = null
    private var nutrition: AdditionalService? = null
    private var sightseeing: AdditionalService? = null
    private var transferFrom: AdditionalService? = null
    private var baggageDeliveryFrom: AdditionalService? = null

    protected fun addServices(servicesFactory: ServicesFactory) {
        transferTo = servicesFactory.createTransferTo()
        baggageDeliveryTo = servicesFactory.createBaggageDeliveryTo()
        nutrition = servicesFactory.createNutrition()
        sightseeing = servicesFactory.createSightseeing()
        transferFrom = servicesFactory.createTransferFrom()
        baggageDeliveryFrom = servicesFactory.createBaggageDeliveryFrom()
    }

    fun showBookingInfo() {
        transferTo?.showInfo()
        baggageDeliveryTo?.showInfo()
        nutrition?.showInfo()
        sightseeing?.showInfo()
        transferFrom?.showInfo()
        baggageDeliveryFrom?.showInfo()
        println("You have booked a wonderful ${roomInfo.type} $roomLocation Room!")
    }
}