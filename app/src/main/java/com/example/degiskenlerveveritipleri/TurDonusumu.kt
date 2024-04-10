package com.example.degiskenlerveveritipleri

import java.lang.Exception

fun main(){

    var i:Int = 42
    var d:Double = 42.45
    var f:Float = 42.89f

    var sonuc1:Int = d.toInt()
    var sonuc2:Double = i.toDouble()
    var sınuc3:Int = f.toInt()

    println(sonuc1)
    println(sonuc2)
    println(sınuc3)


    var str1 = i.toString()
    var str2 = d.toString()
    var str3 = f.toString()

    println(str1)
    println(str2)
    println(str3)


    //YÖNTEM 1

    var yazi1 = "34t"

    try{

        var x = yazi1.toInt()
        println(x)

    }catch (e:Exception){

        println("Dönüşümde hata var")

    }

    //YÖNTEM 2
    var yazi2 = "48.56r"

    var y = yazi2.toDoubleOrNull()

    if(y != null){
        println("y : $y")

    }else{
        println("Dönüşümde hata var")
    }


    //YÖNTEM3
    var yazi3 = "67y"

    var z = yazi3.toIntOrNull()

    z?.let {
        println("z : $z")
    }





}