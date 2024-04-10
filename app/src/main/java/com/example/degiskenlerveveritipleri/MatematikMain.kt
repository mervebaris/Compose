package com.example.degiskenlerveveritipleri

fun main(){
    val m = Matematik()

    m.topla(100, 200)

    val c = m.çikar(300.0,50.0) //GERİDÖNÜŞÜ OLAN FONK. DEĞER TİPİ BELİRTİP DEĞİŞKENE ATADIK

    println("c :$c")

    m.carp(20, 5 ,"merve")

    val veri = m.bol(100.0, 2.0) //GERİDÖNÜŞÜ OLAN FONK. DEĞER TİPİ BELİRTİP DEĞİŞKENE ATADIK
    println(veri)
}

//GERİ DÖNÜŞ OLAN FONKSİYONLARDA
// :Doble
// :String
// :Int
// DİYE DEĞER TİPİ BELİRTTİYSEK
// BİZ BUNUN ÇIKTISINI GÖREBİLMEK İÇİN
// val veya var x =
// DİYE BİR DEĞİŞKENE ATAMAK ZORUNDAYIZ !!!!