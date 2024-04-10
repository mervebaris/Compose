package com.example.degiskenlerveveritipleri

fun main (){

   /* var bmw = Araba() //Nesne ismimiz bmw bu nesneyi Araba sınıfından oluşturduk

    println(bmw.renk)
    println(bmw.hiz)
    println(bmw.calisiyorMu)

    bmw.renk = "beyaz" // araba sınıfındaki verileri değiştirebiliyoruz
    bmw.hiz = 99
    bmw.calisiyorMu = true

    println(bmw.renk)
    println(bmw.hiz)
    println(bmw.calisiyorMu)*/

    val bmw = Araba("kırmızı",  10, false) // nesneyi oluştururken verileri aktardık

   /* println(bmw.renk)
    println(bmw.hiz)
    println(bmw.calisiyorMu)*/

    bmw.BilgiAl()

    bmw.hiz = 900 //veriyi değiştirebiliyoruz
    bmw.renk = "beyaz"
    bmw.calisiyorMu = true

   /* println(bmw.hiz)
    println(bmw.renk)
    println(bmw.calisiyorMu)*/

    bmw.BilgiAl()

    bmw.durdur()
    bmw.BilgiAl()

    bmw.calistir()
    bmw.BilgiAl()

    bmw.hizlan(100)
    bmw.hizlan(300)
    bmw.BilgiAl()

    bmw.yavasla(50)
    bmw.BilgiAl()

    val sahin = Araba("Sarı", 100, true)

    sahin.BilgiAl()

    sahin.hizlan(100)
    sahin.BilgiAl()

    sahin.durdur()
    sahin.BilgiAl()



}