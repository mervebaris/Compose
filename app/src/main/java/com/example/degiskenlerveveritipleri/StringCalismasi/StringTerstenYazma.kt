package com.example.degiskenlerveveritipleri.StringCalismasi

import java.util.Scanner

fun main (){
    val girdi = Scanner(System.`in`)

    println("Kelime giriniz")

    val kelime = girdi.next()

    // m-0, e-1, r-2, v-3, e-4

    //4,3,2,1,0

    for (i in kelime.length-1 downTo 0){
        print(kelime[i])

    }

}