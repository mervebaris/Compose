package com.example.degiskenlerveveritipleri

fun main(){

    var yas = 17
    var isim = "mehmet"

    //ÖRNEK 1

    if (yas >= 18){
        println("Reşitsiniz")
    }

    //ÖRNEK 2 else kullanımı

    if (yas >= 18){
        println("Reşitsiniz")
    }else{
        println("Reşit değilsiniz")
    }

    //ÖRNEK 3

    if (isim == "ahmet"){
        println("Merhaba Ahmet")
    }else{
        println("Tanınmayan kişi")
    }

    //ÖRNEK 4

    if (isim == "ahmet"){
        println("Merhaba Ahmet")
    }else if (isim == "mehmet"){
        println("Merhaba mehmet")
    }else{
        println("Tanınmayan kişi")
    }

    //ÖRNEK 5 çoklu şart AND

    var kullaniciAdı = "adminx"
    var sifre = 12345

    if (sifre == 12345 && kullaniciAdı == "admin"){ //true and true : true İksininde true olamsı gerekiyor sonuç true olaması için !!
        println("Hoşgeldiniz")
    }else{
        println("Hatalı giriş")
    }

    //ÖRNEK 6 çoklu şart OR

    var sinif = 10

    if (sinif == 9 || sinif == 10 || sinif == 11 || sinif == 12){ //herhangi birisiniz true olamsı yeterli sonuç true olamsı için !!
        println("AYT sınavına hazırlanabilirsiniz")
    }

    //ÖRNEK 7 KISALTMA

    var a = 10
    var b=  9

    if (a == b) println("Eşit") else println("Eşit Değil")




}