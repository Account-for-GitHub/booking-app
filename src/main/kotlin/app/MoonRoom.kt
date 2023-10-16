package app

abstract class MoonRoom : Room() {
    override val roomLocation: String = "Moon"
     
    init {
        addServices(MoonServicesFactory())
    }
}