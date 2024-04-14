package com.example.degiskenlerveveritipleri.ArrayList.ArrayListNesneTabanliProgramlama

import com.example.degiskenlerveveritipleri.paket1.A

fun main(){

    val u1 = ArraylistUrun(1,"Saat", 150.0)

    val u2 = ArraylistUrun(2, "TV", 1750.0)

    val u3 = ArraylistUrun(3,"Bilgisayar",960.0)

    val urunler = ArrayList<ArraylistUrun>() // ArrayList içine normalde ınt string doble tanımlardık fakat biz bu sefer yukarıdaki nesnelerimize ulaşmak istediğimizde ArrayListUrunler dedik !!!!

    urunler.add(u1)
    urunler.add(u2)
    urunler.add(u3)

    for (urun in urunler){
        println("******************")
        println("Ürün no : ${urun.urunAd}")
        println("Ürün no : ${urun.urunNo}")
        println("Ürün no : ${urun.urunFiyat}")
    }






}