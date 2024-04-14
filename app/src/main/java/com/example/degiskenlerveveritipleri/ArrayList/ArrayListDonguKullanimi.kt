package com.example.degiskenlerveveritipleri.ArrayList

fun main(){

    val meyveler = ArrayList<String>()

    meyveler.add("çilek")
    meyveler.add("muz")
    meyveler.add("elma")
    meyveler.add("kivi")
    meyveler.add("kiraz")

    for (meyve in meyveler){
        println("Sonuç: $meyve")
    }

    for ((indeks,meyve) in meyveler.withIndex()){
        println("Sonuc: $indeks : $meyve")
    }




}