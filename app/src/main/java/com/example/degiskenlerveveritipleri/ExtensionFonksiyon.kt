package com.example.degiskenlerveveritipleri

fun main(){

    infix fun Int.carpi(sayi:Int):Int{
        return this * sayi
    }

    val sonuc = 5 carpi 2
    println(sonuc)


}