package com.example.degiskenlerveveritipleri.oopKalıtım

fun main(){
    val araba = Araba("kırmızı", "otomatik", "sedan")

    println(araba.renk)
    println(araba.vites)
    println(araba.kasaTipi)

    val nissan = Nissan("beyaz", "manuel", "sedan", "micra")

    println(nissan.model)
    println(nissan.renk)
    println(nissan.kasaTipi)

}

//Alt sınıf üst sınıfa erişebilir. Üst sınıf Alt sınıfa erişemeezz !!!! ÇOOKKKKK ÖNEMLİİİİ