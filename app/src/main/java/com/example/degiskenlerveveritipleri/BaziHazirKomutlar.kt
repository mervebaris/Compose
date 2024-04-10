package com.example.degiskenlerveveritipleri

import kotlin.math.abs
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.max
import kotlin.math.min
import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.random.Random

fun main(){

    for (i in 1..10){
        val rasgeleSayi = Random.nextInt(0,10) // 0 ile 9 arasında rastgele sayı üretir
        println(rasgeleSayi)
    }

    val c = ceil(6.5) //yukarı yuvarlar
    println("c : $c")

    val f = floor(6.5) //aşağı yuvarlar
    println("f: $f")

    val s = sqrt(4.0) //karekök alır
    println("s: $s")

    val a = abs(-10) //mutlak değer alır
    println("a: $a")

    val mx = max(100, 200) //max değeri alır
    val mn = min(100, 200) // min değeri alır
    println("mx: $mx")
    println("mn: $mn")

    val p = 2.0.pow(3.0) //üssü alır
    println("p: $p")





}