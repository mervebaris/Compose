package com.example.degiskenlerveveritipleri.compositionVeriIslemi

fun main(){

    val k1 = Kategoriler(1,"Dram")
    val k2 = Kategoriler(2,"Komedi")

    val y1 = Yonetmenler(1,"Nuri Bilge Ceylan")
    val y2 = Yonetmenler(2,"Quentin Tarantino")

    val f1 = Filmler(1, "Django", 2013, k1,y2)

    println("Film id: ${f1.film_id}")
    println("Film adı: ${f1.film_ad}")
    println("Film yılı: ${f1.film_yil}")
    println("Film kategorisi: ${f1.kategori.kategori_ad}")
    println("Film yönetmeni: ${f1.yonetmen.yonetmen_ad}")

}