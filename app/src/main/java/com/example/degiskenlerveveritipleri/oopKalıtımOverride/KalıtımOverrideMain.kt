package com.example.degiskenlerveveritipleri.oopKalıtımOverride

fun main(){
    //hayvan sınıfından bir nesne oluşturacağız
    val hayvan = Hayvan()
    hayvan.sesCikar()

    //memeli sınıfından bir nesne oluşturacağız
    val memeli = Memeli()
    memeli.sesCikar()

    //kedi sınıfından bir nesne oluşturacağız
    val kedi = Kedi()
    kedi.sesCikar()

    //köpek sınıfından bir nesne oluşturacağız
    val kopek = Kopek()
    kopek.sesCikar()

}