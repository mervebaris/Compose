package com.example.degiskenlerveveritipleri

import java.util.Scanner

fun main(){

    val girdi = Scanner(System.`in`)

    println("Sil (1)")
    println("Ekle (2)")

    val tercih = girdi.nextInt()

    when(tercih){
        1 -> println("Silindi")
        2 -> println("Eklendi")
        else -> println("Böyle bir işlem yok")
    }




}