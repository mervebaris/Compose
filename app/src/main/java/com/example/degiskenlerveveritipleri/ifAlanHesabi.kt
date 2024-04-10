package com.example.degiskenlerveveritipleri

import java.util.Scanner

fun main(){

    val girdi = Scanner(System.`in`)

    println("Dikdörtgen Alanı (1)")
    println("Çember Alanı (2)")

    val secim = girdi.nextInt()

    println("Seçiminiz $secim")

    if (secim == 1){
        println("Kısa kenar giriniz")
        val kisaKenar = girdi.nextInt()

        println("Uzun kenar giriniz")
        val uzunKenar = girdi.nextInt()

        println("Dikdörtgen Alanı")
        val dikdörtgenAlani = kisaKenar * uzunKenar

        println("Sonuç : $dikdörtgenAlani")
    }


    if (secim == 2){
        println("Yarı çap giriniz")
        val yariCap = girdi.nextInt()

        println("Çember alanı giriniz")
        val cemberAlani = 3.14 * yariCap * yariCap

        println("Sonuç : $cemberAlani")



    }



}