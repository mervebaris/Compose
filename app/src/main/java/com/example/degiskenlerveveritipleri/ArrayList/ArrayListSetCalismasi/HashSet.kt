package com.example.degiskenlerveveritipleri.ArrayList.ArrayListSetCalismasi

fun main(){

    val meyveler = setOf<String>("çilek", "muz", "elma", "kivi")

    val iller = mutableSetOf<String>("izmir", "istanbul", "ankara") //üzerinde değişiklik yapabiliriz veri okuyabiliriz içine eklenen veriler düzensiz rasgele yerleştirilir

    val sayilar = hashSetOf<Int>() //üzerinde değişiklik yapabiliriz veri okuyabiliriz içine eklenen veriler düzensiz rasgele yerleştirilir

    sayilar.add(10)
    sayilar.add(20)
    sayilar.add(30)

    println(sayilar.toString())

    sayilar.add(31)
    println(sayilar.toString())

    println(sayilar.elementAt(1)) //1.indexteki veriyi getirir

    println(sayilar.size)

    println(sayilar.count())

    println(sayilar.isEmpty())

    println(sayilar.contains(20))


    for ((i ,s ) in sayilar.withIndex()){
        println("$i --> $s")

    }

    sayilar.remove(10)  //10 verisini sildi
    println(sayilar.toString())

    sayilar.clear() //bütün verileri siler
    println(sayilar.toString())
}