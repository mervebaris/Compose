package com.example.degiskenlerveveritipleri.ArrayList

fun main(){
    val meyveler = ArrayList<String>()

    meyveler.add("çilek")
    meyveler.add("muz")
    meyveler.add("elma")
    meyveler.add("kivi")
    meyveler.add("kiraz")

    println(meyveler.toString())

    val str1 = meyveler.get(2) //elmalar verisini çekiyoruz
    println(str1)

    val str2= meyveler[4]
    println(str2)

    meyveler.add("mandalina") // add - varolan veri kümesinin sonuna ekliyor
    println(meyveler.toString())

    meyveler[2] = "ananas"    //varolan elemanın üzerine ekliyor elma yerine ananas geldi
    println(meyveler.toString())

    meyveler.add(3, "portakal") //varolan kümenin içerisindeki bilgiyi kaybetmeden veriyi ekliyor diğer verileri sağ tarafa kaydırıyor. (3. indekse portakal verisini ekliyor diğer elemanlerı sağ tarafa doğru kaydırıyor)
    println(meyveler.toString())



}