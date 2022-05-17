package app

import java.util.*
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class LogReadOnlyProperty (val data: String): ReadOnlyProperty<Any, String>{
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Access property ${property.name} with value $data")
        return data.uppercase(Locale.getDefault())
    }
}

class NameWithLog(param: String){
    val name:String by LogReadOnlyProperty(param)
}

fun main() {
    val nameWithLog = NameWithLog("Eko Kurniawan")
    println(nameWithLog.name)
    println(nameWithLog.name)
}