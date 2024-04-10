package com.example.degiskenlerveveritipleri

class Matematik {

    fun topla(sayi1:Int, sayi2:Int){
        val toplam = sayi1 + sayi2
        println("Toplam : $toplam")
    }

    fun çikar(sayi1:Double, sayi2:Double) :Double{   //Geri Dönüş olan fonksiyon geri dönüşü :Double olacak diye DEĞER TİPİ belirttik Return ÖNEMLİ !!!!
        return sayi1 - sayi2
    }

    fun carp(sayi1: Int, sayi2: Int, isim: String){
        val sonuc = sayi1 * sayi2
        println("Çarpma yapan $isim Sonuç : $sonuc")
    }

    fun bol(sayi1: Double, sayi2: Double) :String{
        return "Bölme : ${sayi1 / sayi2}"

    }
}