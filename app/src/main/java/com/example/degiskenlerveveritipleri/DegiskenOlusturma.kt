package com.example.degiskenlerveveritipleri

fun main(){
    var ogrenciAdi = "Merve"
    var ogrenciYas = 31
    var ogrenciBoy = 1.65
    var ogrenciBasHarf = 'M'

    println(ogrenciAdi)
    println(ogrenciYas)
    println(ogrenciBoy)
    println(ogrenciBasHarf)

    var urun_id:Int = 3416
    var urun_ad:String = "Kol Saati"
    var urun_adet:Int = 100
    var urun_fiyat:Double = 149.99
    var urun_tedarik:String = "Rolex"

    println("Ürün id: $urun_id")
    println("Ürün ad: $urun_ad")
    println("Ürün adet: $urun_adet")
    println("Ürün fiyat: $urun_fiyat")
    println("Ürün tedarik: $urun_tedarik")

    println("$urun_tedarik marka $urun_ad $urun_fiyat fiyatla satılmaktadır. Stokta $urun_adet adet kalmıştır.")

    var a = 10
    var b = 20

    println("$a ve $b nin toplamı : ${a+b}")

}