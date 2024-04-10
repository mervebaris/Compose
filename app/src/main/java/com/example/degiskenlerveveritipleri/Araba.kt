package com.example.degiskenlerveveritipleri

/*class Araba { //Araba sınıfının özellikleri DURUM !!  Bundan nesne oluşturacağız ArabaMain içinde
    var renk:String = "kırmızı"
    var hiz:Int = 10
    var calisiyorMu:Boolean = false
}*/


class Araba (var renk:String,var hiz:Int,var calisiyorMu:Boolean ) {


    fun calistir(){
        calisiyorMu = true
    }

    fun durdur(){
        calisiyorMu = false
        hiz = 0
    }

    fun hizlan(kacKm:Int){
        hiz = hiz + kacKm
    }

    fun yavasla(kacKm:Int){
        hiz = hiz - kacKm
    }

    //bu sınıfa fonksiyonlar ekleyebiliriz davranışlar kazandırabiliriz
    fun BilgiAl(){ //methot oluşturduk
        println("Renk : $renk")
        println("Hız : $hiz")
        println("Çalışıyor mu : $calisiyorMu")
    }



}