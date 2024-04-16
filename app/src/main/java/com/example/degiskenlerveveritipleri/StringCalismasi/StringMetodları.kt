package com.example.degiskenlerveveritipleri.StringCalismasi

fun main(){
    val  str1 = "Merhaba" //M-0, e-1, r-2, h-3
    println(str1.subSequence(0,3)) //3ün bir eksiğine kadar alır Mer yazdı


    val  str2 = "Merhaba"
    if (str2.contains("er")){
        println("içeriyor")
    }

    val  str3 = "Merhaba"
    println(str3.uppercase())
    println(str3.lowercase())

    val  str4 = "Merhaba Naasılsın"

    val dizi = str4.split(" ")
    for (d in dizi){
        println(d)
    }

    val  str5 = "Merhaba "
    println(str5.trim())







}