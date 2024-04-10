package com.example.degiskenlerveveritipleri

//Global ve Local değişkenler ***Local değişken her zaman Global değişkene karşı baskındır. Önce Local Değişken çalışır !!

class Deneme {
    var x = 10
    var y = 20

    fun topla() {

        var x = 100

        var z = x + y
        println(z)

    }
}