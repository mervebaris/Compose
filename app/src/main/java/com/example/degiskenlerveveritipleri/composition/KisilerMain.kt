package com.example.degiskenlerveveritipleri.composition

fun main(){
    val adress = Adress("İzmir", "Mavişehir")

    val kisi = Kisiler("merve", 31, adress)

    println("Kşi Ad: ${kisi.ad}") //birden fazla tanımlama var o yüzden süslü parantez kullandık !!

    println("Kişi Yaş: ${kisi.yas}")

    println("Kişi İl: ${kisi.adress.il}")

    println("Kişi İlçe : ${kisi.adress.ilçe}")


}