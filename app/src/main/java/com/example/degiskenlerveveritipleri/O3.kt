package com.example.degiskenlerveveritipleri

class O3 {
    fun faktoriyelHesaplama(sayi1:Int): Int {
        var sonuc = 1

        for (i in 1..sayi1){
            sonuc *= i
        }
        return sonuc


    }
}