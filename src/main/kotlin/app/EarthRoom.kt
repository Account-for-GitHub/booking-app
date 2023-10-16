package app

abstract class EarthRoom : Room() {
    override val roomLocation: String = "Earth"

    init {
        addServices(EarthServicesFactory())
    }
}