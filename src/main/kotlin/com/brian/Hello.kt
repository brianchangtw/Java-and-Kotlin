package com.brian

fun main() {
//    println("Hello Kotlin")
//    Human().hello()
//    h.hello()
    var s:String? = "airplane"
//    s = null
//    println(s!!.length)
    println(s?.get(3))
    println(s?.substring(3))

    val h = Human(weight = 66.5f, height =  1.7f)
    println(h.bmi())
    val score = 88
    print(score > 60)
    var c: Char = 'a'
    println(c.toInt() >60)


    /*var age : Int = 19
    age = 20
    var weight = 66.5f
    var name : String*/


}

class Human(name: String="", var weight: Float, var height: Float) {
    init {
        println("test $weight")
    }
//    constructor(name: String, weight: Float, height: Float): this(weight, height)
    fun bmi(): Float {
        val bmi = weight / (height*height)
        return bmi
    }
    fun hello() {
        println("Hello Kotlin")
    }

}