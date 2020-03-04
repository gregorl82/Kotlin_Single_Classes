class Printer(numberOfSheets: Int) {

    var numberOfSheets: Int = numberOfSheets

    fun print(numberOfPages: Int, numberOfCopies: Int): String {
        val pagesUsed: Int = numberOfPages * numberOfCopies
        when (pagesUsed <= numberOfSheets) {
            true -> {
                numberOfSheets -= pagesUsed
                return "Printed $numberOfCopies copies with $numberOfPages pages each"
            }
            false -> return "Not enough sheets!"
        }
    }
}