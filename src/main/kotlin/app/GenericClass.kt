package app

import data.MyData

fun main() {
    val myDataString: MyData<String, Int> = MyData<String, Int>("Eko", 10)
    myDataString.printData()

    val myDataInteger: MyData<Int, String> = MyData(5, "Joko")
    myDataInteger.printData()
}