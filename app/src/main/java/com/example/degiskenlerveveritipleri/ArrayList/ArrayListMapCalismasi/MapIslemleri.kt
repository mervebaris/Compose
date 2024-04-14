package com.example.degiskenlerveveritipleri.ArrayList.ArrayListMapCalismasi

fun main(){

    val sayilar = mapOf<Int,String>(1 to "Bir", 2 to "İki")

    val oranlar = mutableMapOf<Double,String>(1.5 to "Oran1", 3.5 to "Oran2")

    val iller = hashMapOf<Int, String>()

    iller.put(35,"izmir")
    iller.put(34,"istanbul")

    println(iller.toString())

    iller.put(35, "Yeni İzmir")
    println(iller.toString())

    println(iller.get(35))  //veri okuması yapılır izmiri getirir

    println(iller.size)
    println(iller.count())
    println(iller.toString())

    println(iller.isEmpty())
    println(iller.containsKey(34))

    for ((anahtar, deger) in iller){
        println("$anahtar : $deger")
    }

    iller.remove(35)
    println(iller.toString())

    iller.clear()
    println(iller.toString())
}