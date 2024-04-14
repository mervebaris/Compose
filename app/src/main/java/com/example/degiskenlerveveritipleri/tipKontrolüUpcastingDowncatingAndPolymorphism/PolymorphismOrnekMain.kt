package com.example.degiskenlerveveritipleri.tipKontrolüUpcastingDowncatingAndPolymorphism

fun main(){

    val ogretmen:Personel = Ogretmen() //öğretmen personel sınıfına benzeyecek ama öğretmen sınıfı olacak
    val isci:Personel = Isci()
    val mudur = Mudur()

    //mudur.iseAl(ogretmen)
    // mudur.iseAl(isci)
    mudur.terfiEttir(ogretmen)
    mudur.terfiEttir(isci)
}