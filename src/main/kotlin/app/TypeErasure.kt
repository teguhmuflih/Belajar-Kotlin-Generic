package app

class TypeErasure<T>(param : T){
    private val data: T = param
    fun getData(): T = data
}

//fun main() {
//    val data1 = TypeErasure<String>("Eko")
//    val dataString: String = data.getData()
//
//    val data2: TypeErasure<T> = data1 as TypeErasure<Int>
//}