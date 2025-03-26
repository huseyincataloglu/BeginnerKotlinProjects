object ArmstrongNumber {

    fun check(input: Int) = isArmstrong(input) == input
    private fun isArmstrong(input : Int) : Int{
        var numStr = input.toString()
        return numStr.sumOf{
            Math.pow(it.digitToInt().toDouble(),numStr.length.toDouble()).toInt()
        }
        // sumOf gets selector function which creates a value for every value in the collection  RETURNS INT
        // filter elminites the vlaues which doesnt suite in predicate funct defined in the filter lambda exp body


    }

}


fun main() {
    println(ArmstrongNumber.check(154))


}