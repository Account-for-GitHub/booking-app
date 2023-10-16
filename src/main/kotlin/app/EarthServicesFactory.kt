package app

class EarthServicesFactory : ServicesFactory {
    override fun createTransferTo(): AdditionalService = EarthTransferToService()

    override fun createBaggageDeliveryTo(): AdditionalService = EarthBaggageDeliveryToService()

    override fun createNutrition(): AdditionalService = EarthNutritionService()

    override fun createSightseeing(): AdditionalService = EarthSightseeingService()

    override fun createTransferFrom(): AdditionalService = EarthTransferFromService()

    override fun createBaggageDeliveryFrom(): AdditionalService = BaggageDeliveryFromService()
}