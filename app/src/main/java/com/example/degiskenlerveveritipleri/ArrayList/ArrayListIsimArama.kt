package com.example.degiskenlerveveritipleri.ArrayList

import java.util.Scanner

fun main(){
    val girdi = Scanner(System.`in`)

    val isimler = ArrayList<String>()

    isimler.add("merve")
    isimler.add("tuğberk")
    isimler.add("pınar")
    isimler.add("erdinç")
    isimler.add("hüma")

    println("Aratmak için isim giriniz")
    val isim = girdi.next()

    for (i in isimler){
        if (i == isim){
            println("İSİM MEVCUT")
            break
        }
    }

}