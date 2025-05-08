class CustomSet(vararg elements : Int ) {

    // TODO: implement proper constructor
    public var set = elements.toMutableSet()

    fun isEmpty(): Boolean {
        return set.size == 0
    }

    fun isSubset(other: CustomSet): Boolean {
        return this.set.all { it in other.set }
    }

    fun isDisjoint(other: CustomSet): Boolean {
        return other.set.none { it in other.set }
    }

    fun contains(other: Int): Boolean {
        return this.set.contains(other)
    }

    fun intersection(other: CustomSet): CustomSet {
        val intersect = this.set.intersect(other.set)
        return CustomSet(*intersect.toIntArray())
    }

    fun add(other: Int) {
        this.set.add(other)
    }

    override fun equals(other: Any?): Boolean {
        if(this === other) return true
        val other2 = other as? CustomSet
        return this.set == other2?.set
    }

    operator fun plus(other: CustomSet): CustomSet {
        this.set.addAll(other.set)
        return this
    }

    operator fun minus(other: CustomSet): CustomSet {
        this.set.removeAll(other.set)
        return this
    }
}

fun main() {

    val set1 = CustomSet(1,2,3)
    val set2 = CustomSet()

    println(CustomSet() == set1.intersection(set2))


}

