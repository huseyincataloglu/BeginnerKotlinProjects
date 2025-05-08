object  Acronym{
    fun generate(s  :String) : String{
        var newStr = ""
        s.forEach { newStr+= if(it.isLetterOrDigit() || it in "'!")  it else ' '}
        return newStr.split(' ').filter { it.isNotEmpty() }.joinToString(""){it.first().uppercaseChar().toString()}

    }
}

fun main() {
    print(Acronym.generate(readln()))
}