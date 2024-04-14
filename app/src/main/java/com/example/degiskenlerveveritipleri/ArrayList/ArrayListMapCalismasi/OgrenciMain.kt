package com.example.degiskenlerveveritipleri.ArrayList.ArrayListMapCalismasi

fun main(){

    val o1 = Ogrenci(1, "merve", "11F")
    val o2 = Ogrenci(2, "tuğberk", "12D")
    val o3 = Ogrenci(3, "pınar", "10A")
    val o4 = Ogrenci(4, "erdinç", "9E")

    val ogrenciler = hashMapOf<Int, Ogrenci>()

    ogrenciler.put(o1.no,o1)
    ogrenciler.put(o2.no,o2)
    ogrenciler.put(o3.no,o3)
    ogrenciler.put(o3.no,o3)

    for ((ogrenciNo, ogrenci) in ogrenciler){
        println("*******************")
        println("Öğrenci no: $ogrenciNo")
        println("Öğrenci Ad: ${ogrenci.ad}")
        println("Öğrenci Sınıf: ${ogrenci.sinif}")

    }
}