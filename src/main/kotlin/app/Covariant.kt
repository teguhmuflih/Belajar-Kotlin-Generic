package app

class Covariant <out T : Any>(val data:T){

    fun data(): T {
        return data
    }

}

fun main() {
    val covariantString = Covariant<String>("Eko")
    val covariantAny: Covariant<Any> = covariantString
}