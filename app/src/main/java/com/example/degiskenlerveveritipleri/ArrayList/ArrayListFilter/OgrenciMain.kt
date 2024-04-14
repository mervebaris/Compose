package com.example.degiskenlerveveritipleri.ArrayList.ArrayListFilter

fun main(){
    val o1 = Ogrenci(1,"merve", "11f")
    val o2 = Ogrenci(2, "tuğberk", "12a")
    val o3 = Ogrenci(3,"hüma", "3c")
    val o4 = Ogrenci(4, "pinar", "11f")


    val ogrenciler =ArrayList<Ogrenci>()

    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)
    ogrenciler.add(o4)

    /*for (o in ogrenciler){
        println("*************************")
        println("Öğrenci No: ${o.no}")
        println("Öğrenci Ad: ${o.ad}")
        println("Öğrenci Sınıf: ${o.sinif}")

    }*/


    println("-----------------------------")


    val sonucListe = ogrenciler.filter { (it.ad).contains("a") }

    for (o in sonucListe){
        println("*************************")
        println("Öğrenci No: ${o.no}")
        println("Öğrenci Ad: ${o.ad}")
        println("Öğrenci Sınıf: ${o.sinif}")

    }





}