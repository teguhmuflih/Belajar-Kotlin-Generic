package app

class Container<T>(var data:T)

fun copyContainer(from: Container<out Any>, to: Container<in Any>){
    to.data = from.data
}

fun main() {
    val container1 = Container("teguh")
    val container2: Container<Any> = Container("muflih")

    copyContainer(container1,container2)
}