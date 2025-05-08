
// Unfinished
object CyrptoSquare {

    fun ciphertext(plaintext: String): String {

        val newText = plaintext.filter { it.isLetter()}.map { it.lowercaseChar() }.toString()

        return  newText
    }

}
fun main() {
    println(CyrptoSquare.ciphertext("If man was meant to stay on the ground, god would have given us roots."))
}