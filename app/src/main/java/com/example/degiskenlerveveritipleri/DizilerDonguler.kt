package com.example.degiskenlerveveritipleri

fun main(){

    val meyveler = arrayListOf<String>("çilek", "muz", "elma", "kivi", "kiraz") // Verileri teker teker almak istiyorsak for döngüsünü kullanacağız

    for (meyve in meyveler){
        println("Sonuç : $meyve")
    }

    for ((indeks,meyve) in meyveler.withIndex()){ // Verilerin indeks num. bilmiyorsak indeks num. erişmek için kullanılır
        println("Sonuç : $indeks : $meyve")
    }



}