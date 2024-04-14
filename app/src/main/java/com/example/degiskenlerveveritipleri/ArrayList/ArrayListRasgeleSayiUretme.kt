package com.example.degiskenlerveveritipleri.ArrayList

import kotlin.random.Random

fun main(){
    val sayilar = ArrayList<Int>()

    for (i in 1..100){
        val rasgeleSayi = Random.nextInt(0,101) //bu aralıkta 0'dan 100'e kadar sayı üretir
        sayilar.add(rasgeleSayi)
    }

    sayilar.sort() //sayıları sıraya sokacağız

    for (s in sayilar){
        println(s)
    }

}