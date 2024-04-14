package com.example.degiskenlerveveritipleri.oopKalıtımEv

fun main(){

    //Saray sınıfından nesne oluşturacağız

    val topkapiSarayi = Saray(20,5) //pencere sayısı üst sınıftan geliyor EVDEN !! kule sayısı kendi özelliği

    //Villa sınıfından nesne oluşturacağız

    val bogazVilla = Villa(4,true) // pencere sayısı üst sınıftan geliyor Evden !! garaj varmı kendi özelliği

    //Verilere erişelim

    println(topkapiSarayi.kuleSayisi) //Saray hem kendi özelliğine hem üst sınıfın özelliğine erişebilir
    println(topkapiSarayi.pencereSayisi)

    println(bogazVilla.garajVarMi) //Villa hem kendi özelliğine hem üst sınıfın özelliğine erişebilir
    println(bogazVilla.pencereSayisi)



}

//Evden garaj var mı ve kule sayısına erişemiyoruz üst sınıf alt sınıfa ERİŞEMEZ !!