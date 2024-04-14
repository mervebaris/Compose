package com.example.degiskenlerveveritipleri.ArrayList

fun main (){

    val sayilar = ArrayList<Int>()
    sayilar.add(1)
    sayilar.add(23)
    sayilar.add(32)
    sayilar.add(47)
    sayilar.add(59)
    sayilar.add(100)
    sayilar.add(18)
    sayilar.add(54)

    //bu sayıları tek ve çift olarak ayıracağız ayırdığımız sayıları başka bir ArrayListe aktaracağız

    val tekler = ArrayList<Int>()
    val ciftler = ArrayList<Int>()

    for (s in sayilar){

        val sonuc = s % 2 //bu sayının yüzdesini alarak (yüzdesini almak kalan kısmını vereceğinden tek mi çift mi öğrenebiliriz) tek mi çift mi olduğunu öğreneceğiz

        if (sonuc == 0){
            ciftler.add(s)
        }

        if (sonuc == 1){
            tekler.add(s)
        }

    }

    println("Tekler")

    for (t in tekler){
        println(t)
    }

    println("Çifler")

    for (c in ciftler){
        println(c)
    }










}