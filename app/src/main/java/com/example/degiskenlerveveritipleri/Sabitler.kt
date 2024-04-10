package com.example.degiskenlerveveritipleri

fun main(){
    var sayi = 10 //var kullanımda hafızada bir yer kullanıyor bu değiştirldikçe veriler aktarıldıkça bu hafızadaki yer artabiliyor

    sayi = 20

    sayi = 40

    println(sayi)

    val sayi2 = 100

   // sayi2 = 50  hata verir val(sabit) ile tanımlanan değerler değiştirilemez !!
}