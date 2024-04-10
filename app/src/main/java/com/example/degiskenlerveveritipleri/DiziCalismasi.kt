package com.example.degiskenlerveveritipleri

fun main(){

    //Tanımlama

    val dizi1 = Array<Int>(5){0} // [0,0,0,0,0]

    val dizi2 = arrayListOf(1,10,7)

    val dizi3 = arrayListOf<Int>(1,36,9)

    val dizi4 = arrayListOf<String>("çilek", "ahmet") //genel kullanımı bu

    val dizi5 = arrayListOf(3,8,"elma","bursa")

    val meyveler = arrayListOf<String>("çilek", "muz", "elma", "kivi", "kiraz")

    // Verilere erişim

    val str1 = meyveler[2]

    println(str1)

    val str2 = meyveler.get(3)

    println(str2)

    // Veriler üzerinde işlem yapma

    meyveler[1] = "Yeni Muz"

    println(meyveler.toString())

    meyveler.set(2, "Yeni Elma")

    println(meyveler.toString())

    //Array İşlemleri

    println(meyveler.isEmpty()) //Array boşmu dolumu diye döner true veya false !

    println(meyveler.count()) // Arrayin sayısını boyutunu döner

    println(meyveler.first()) // Arrayin ilk elemanını verir

    println(meyveler.last()) //Arrayin son elemanını verir

    println(meyveler.indexOf("Yeni Elma")) // Arrayin içindeki elemanın index num. döner

    println(meyveler.contains("muz")) //Arrayin içinde muz verisi var mı yok mu kontrol eder true veya false döner

    println(meyveler.max())

    println(meyveler.min())

    println(meyveler.sort()) // Arrayin içindeki elemanları sıralar

    println(meyveler.toString())

    println(meyveler.reverse()) //Arrayin içindeki elemanları tersine sıralar

    println(meyveler.toString())




}