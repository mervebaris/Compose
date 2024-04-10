package com.example.degiskenlerveveritipleri

class Odev4 {

    fun kelimeHesaplama(kelime:String, harf:Char){

        var sonuc = 0

        for (k in kelime){ // M e r v e
            if (k == harf){
                sonuc += 1
            }

        }
        println("Harf Sayısı $sonuc")

    }
}