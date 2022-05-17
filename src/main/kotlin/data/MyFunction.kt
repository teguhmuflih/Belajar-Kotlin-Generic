package data

class Function(val name:String) {

    fun <T> sayHello(param:T){
        "Hello $param, my name is ${this.name}"
    }
}