package com.example.degiskenlerveveritipleri

class Hesaplayici {


    fun topla (sayi1:Int, sayi2:Int){
        println("Toplam: ${sayi1 + sayi2}")  //işlem yaptıracağımızda {} parantezi açmak zorundayız tek bir sayı göstereceksek $sayi1 şeklinde gösterebiliriz
    }

    fun topla (sayi1:Double, sayi2:Int){
        println("Toplam: ${sayi1 + sayi2}")  //işlem yaptıracağımızda {} parantezi açmak zorundayız tek bir sayı göstereceksek $sayi1 şeklinde gösterebiliriz
    }

    fun topla (sayi1:Int, sayi2:Double){
        println("Toplam: ${sayi1 + sayi2}")  //işlem yaptıracağımızda {} parantezi açmak zorundayız tek bir sayı göstereceksek $sayi1 şeklinde gösterebiliriz
    }

    fun topla (sayi1:Int, sayi2:Int, ad:String){
        println("Toplama yapan $ad sonuç: ${sayi1 + sayi2}")  //işlem yaptıracağımızda {} parantezi açmak zorundayız tek bir sayı göstereceksek $sayi1 şeklinde gösterebiliriz
    }

}