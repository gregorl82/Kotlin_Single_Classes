class Printer(numberOfSheets: Int, tonerAmount: Int) {

    var numberOfSheets: Int = numberOfSheets
    var tonerAmount: Int = tonerAmount

    fun print(numberOfPages: Int, numberOfCopies: Int): String {
        val pagesUsed: Int = numberOfPages * numberOfCopies
        if (pagesUsed > tonerAmount) {
            return "Not enough toner!"
        }
        when (pagesUsed <= numberOfSheets) {
            true -> {
                numberOfSheets -= pagesUsed
                tonerAmount -= pagesUsed
                return "Printed $numberOfCopies copies with $numberOfPages pages each"
            }
            false -> return "Not enough sheets!"
        }
    }
}