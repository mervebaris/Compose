package com.example.degiskenlerveveritipleri

fun main (){

    val kamilKoc = Otobus(50 , "Bursa", "Ankara", 10) //nesne oluşturup otobüs sınıfını burada çağırdım

    /*println(kamilKoc.kapasite)
    println(kamilKoc.nereden)
    println(kamilKoc.nereye)
    println(kamilKoc.mevcutYolcu)*/

    kamilKoc.bilgiAl()

    kamilKoc.kapasite = 100
    kamilKoc.nereden = "izmir"
    kamilKoc.nereye = "istanbul"
    kamilKoc.mevcutYolcu = 2

    /*println(kamilKoc.kapasite)
    println(kamilKoc.nereden)
    println(kamilKoc.nereye)
    println(kamilKoc.mevcutYolcu)*/

    kamilKoc.bilgiAl()

    kamilKoc.yolcuAl(10)
    kamilKoc.bilgiAl()

    kamilKoc.yolcuIndir(3)
    kamilKoc.bilgiAl()

    val otobusFirmasi = Otobus(50, "Tekirdağ", "Sakarya", 5)
    otobusFirmasi.bilgiAl()
    otobusFirmasi.yolcuAl(7)
    otobusFirmasi.bilgiAl()




}