package data

class MyFunction(val name:String) {

    fun <T> sayHello(param:T){
        "Hello $param, my name is $name"
    }
}