package com.example.degiskenlerveveritipleri.ArrayList

fun main(){

    var sayilar = ArrayList<Int>()

    sayilar.add(30)
    sayilar.add(40)
    sayilar.add(60)
    sayilar.add(10)
    sayilar.add(100)
    sayilar.add(60)

    var toplam = 0

    for (s in sayilar){
        toplam += s
    }

    println("Ortalama : ${toplam / sayilar.size}")  //sayıların toplamını ArrayListin boyutuna (sayilar.size) bölersek ortalamayı almış oluruz










}