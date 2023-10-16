package app

class MoonServicesFactory : ServicesFactory {
    override fun createTransferTo(): AdditionalService = MoonTransferToService()

    override fun createBaggageDeliveryTo(): AdditionalService = MoonBaggageDeliveryToService()

    override fun createNutrition(): AdditionalService = MoonNutritionService()

    override fun createSightseeing(): AdditionalService = MoonSightseeingService()

    override fun createTransferFrom(): AdditionalService = MoonTransferFromService()

    override fun createBaggageDeliveryFrom(): AdditionalService = MoonBaggageDeliveryFromService()
}