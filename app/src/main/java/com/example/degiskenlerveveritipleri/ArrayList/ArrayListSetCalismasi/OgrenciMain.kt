package com.example.degiskenlerveveritipleri.ArrayList.ArrayListSetCalismasi

fun main(){


    val o1 = Ogrenci(1,"merve","12A")
    val o2 = Ogrenci(2,"tuğberk","9A")
    val o3 = Ogrenci(3,"pınar","10C")
    val o4 = Ogrenci(4,"erdinç","11B")
    val o5 = Ogrenci(4,"hüma","3B")

    val ogrenciler = HashSet<Ogrenci>()

    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)
    ogrenciler.add(o4)
    ogrenciler.add(o5)

    for (o in ogrenciler){
        println("**************")
        println("Öğrenci No: ${o.no}")
        println("Öğrenci No: ${o.ad}")
        println("Öğrenci No: ${o.sinif}")
    }



}