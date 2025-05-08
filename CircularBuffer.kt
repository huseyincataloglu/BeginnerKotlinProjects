// TODO: implement proper exceptions to complete the task
class EmptyBufferException:Exception("The buffer is empty")

class BufferFullException:Exception("The buffer is full. The further writes are blocked until a slot becomes free."){
}

class CircularBuffer<T>(var size : Int) {
    // TODO: implement proper constructor to complete the task
    val arrayDeque = ArrayDeque<T>(size)
    fun read() : T {
        if(arrayDeque.size == 0){
            throw EmptyBufferException()
        }
        else{
            return arrayDeque.removeFirst()
        }
    }

    fun write(value: T) {
        if(arrayDeque.size == this.size){
            throw BufferFullException()
        }
        else{
            arrayDeque.add(value)
        }
    }

    fun overwrite(value: T) {
        read()
        arrayDeque.addFirst(value)
    }

    fun clear() {
        arrayDeque.clear()
    }

    fun show() = println(arrayDeque.indices)

    override fun toString(): String {
        return "${this.arrayDeque}"
    }
}
fun main() {
    val buffer = CircularBuffer<Int>(5)
    buffer.run {
        this.write(44)
        this.write(55)
        this.write(66)
    }
    buffer.overwrite(77)
    println(buffer)
    println(buffer.arrayDeque[0])

}