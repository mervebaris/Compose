package com.example.degiskenlerveveritipleri.ArrayList.ArrayListKarne

import java.util.Scanner

fun main(){

    val girdi = Scanner(System.`in`)

    val dersNotlariListesi = ArrayList<DerslerNotlar>()

    while (true){

        println("Ders Adını Giriniz")
        val ders = girdi.next()

        println("Dersin Notunu Giriniz")
        val not = girdi.nextInt()



        val yeniNot = DerslerNotlar(ders, not)

        dersNotlariListesi.add(yeniNot)




        println("Çıkmak için (1) - Devam etmak için diğer sayılar")
        val cikis = girdi.nextInt()

        if (cikis == 1){

            println("**************")

            var toplam = 0

            for (dn in dersNotlariListesi){
                println("${dn.ders} - ${dn.not}")
                toplam = toplam + dn.not
            }

            val ortalama = toplam / dersNotlariListesi.size

            println("**************")
            println("ORTALAMA : $ortalama")

            if (ortalama >= 50){
                println("Geçtiniz")
            }else{
                println("Kaldınız")
            }

            println("Çıkış Yapıldı")
            break
        }


    }



}