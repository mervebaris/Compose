package com.example.degiskenlerveveritipleri.oopKalıtımOverride

class Kedi : Memeli(){

    override fun sesCikar() {
       // super.sesCıkar() //super burada bir üst sınıfı temsil eder yani Memeli sınıfını
        println("miyav miyav")
    }
}