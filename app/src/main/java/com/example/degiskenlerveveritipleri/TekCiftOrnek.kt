package com.example.degiskenlerveveritipleri

import java.util.Scanner

fun main(){

    val girdi = Scanner(System.`in`)

    while (true){

        println("Sayı giriniz")

        val sayi = girdi.nextInt()

        val sonuc = sayi % 2 // yüzde işlemi bölümünden kalanı verir kalan çift ise sayı çift tek ise sayı tek

        if (sonuc == 0){
            println("çift sayıdır")
        }

        if (sonuc == 1){
            println("tek sayıdır")
        }


        println("Çıkmak için (1) - Devam etmek için diğer sayılar")

        val cıkıs = girdi.nextInt()

        if (cıkıs == 1){
            println("çıkış yapıldı")
            break
        }



    }



}