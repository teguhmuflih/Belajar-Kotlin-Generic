package app

import data.MyFunction

fun main() {
    val function = MyFunction("Eko")

    function.sayHello("Eko")
    function.sayHello<String>("Eko")

    function.sayHello(10)
    function.sayHello<Int>(10)
}