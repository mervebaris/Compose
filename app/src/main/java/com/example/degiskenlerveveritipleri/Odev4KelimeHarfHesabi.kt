package com.example.degiskenlerveveritipleri

class Odev4KelimeHarfHesabi {

    fun kelimeAdeti(kelime:String, harf:Char){ //Ankara , a
        var sonuc = 0
        for (k in kelime){ //A n k a r a
            if (k == harf){
                sonuc += 1
            }

        }
        println("Harf Adeti: $sonuc")

    }

}