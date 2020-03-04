class WaterBottle {

    var volume: Int = 100

    fun drink(){
        if (volume < 10) {
            volume = 0
        } else {
            volume -= 10
        }
    }

    fun empty() {
        volume = 0
    }

    fun fill() {
        volume = 100
    }
}