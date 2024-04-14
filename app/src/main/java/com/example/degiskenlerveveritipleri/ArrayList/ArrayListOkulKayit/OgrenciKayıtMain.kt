package com.example.degiskenlerveveritipleri.ArrayList.ArrayListOkulKayit

import java.util.Scanner

fun main(){

    val girdi = Scanner(System.`in`)

    var sayac = 1

    val ogrenciler = ArrayList<Ogrenci>() //içinde öğrenci sınıfından nesleri tutacak bir ArrayList tanımladık

    while (true){//girdi içine başka veri aktarmıyacağımız için while dedik sonsuz döngü olması içinde true dedik


        println("Öğrenci Adını Giriniz") //ad ve sınıfı consoledan almak istiyoruz
        val ad = girdi.next()

        println("Öğrenci Sınıfını Giriniz")
        val sinif = girdi.next()


        //Adını ve sınıfını consoledan almak istiyoruz nosunu otomatik oluşturmak istiyoruz
        val yeniOgrenci = Ogrenci(sayac,ad,sinif) //ogrenci sınıfından nesne oluşturduk yukarıdan bilgileri otomatik aldık
        sayac += 1

        ogrenciler.add(yeniOgrenci) //yukarıda kayıt aldığımız öğrenci listesini array liste kayıt edebiliriz




        println("Çıkmak için (1) - Devam etmak için diğer sayılar")
        val cikis = girdi.nextInt()

        if (cikis == 1){

            for (ogrenci in ogrenciler){  //tüm kayıdı çıkış yapmadan alıyoruz
                println("****************")
                println("Öğrenci no: ${ogrenci.no}")
                println("Öğrenci Adı : ${ogrenci.ad}")
                println("Öğrenci Sınıf: ${ogrenci.sinif}")

            }


            println("Çıkış yapıldı")
            break // döngüleri durduruyoruz
        }
    }




}