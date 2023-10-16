package app

interface ServicesFactory {
    fun createTransferTo(): AdditionalService
    fun createBaggageDeliveryTo(): AdditionalService
    fun createNutrition(): AdditionalService
    fun createSightseeing(): AdditionalService
    fun createTransferFrom(): AdditionalService
    fun createBaggageDeliveryFrom(): AdditionalService
}
