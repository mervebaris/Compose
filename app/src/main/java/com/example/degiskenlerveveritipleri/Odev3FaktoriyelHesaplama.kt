package com.example.degiskenlerveveritipleri

class Odev3FaktoriyelHesaplama {

    // 3 - 3*2*1

    fun faktoriyelHesaplama(sayi:Int): Int {
        var sonuc = 1

        for (i in 1..sayi){
            sonuc = sonuc * i
        }

        return sonuc

    }
}