package com.example.degiskenlerveveritipleri

fun main(){

    fun selamla(){  //GERİ DÖNÜŞ OLMAYAN FONKSİYON PARAMETRE ALMAZ
        val sonuc = "Hellüüğğ Merveee"
        println(sonuc)
    }

    selamla()

    fun selamla1() : String{ //GERİ DÖNÜŞ OLAN FONKSİYON PARAMAETRE ALIR RETURN KULLANILIR ÇOK ÖNEMLİ
        val sonuc = "Hellüüüü Merve"
        return (sonuc)
    }

    val gelenSonuc = selamla1()
    println(gelenSonuc)

    fun selamla2(isim:String){ //Geri dönüşü olmayan PARAMETRELİ
        val sonuc = "Heloo $isim"
        println(sonuc)

    }

    selamla2("Merveeeee")

    fun toplama(){ // Geri dönüş olmayan
        val toplam = 30 + 40
        println("Toplama : $toplam")
    }

    toplama()

    fun toplama1(): Int{ // Yukarıdaki örneğin GERİ DÖNÜŞ olan fonksiyonu
        val toplam = 30 + 90
        return (toplam)
    }

    var t1 = toplama1()
    println("t1: $t1")


    fun toplama2(sayi1:Int, sayi2:Int):Int { //Parametre alarak kullanımı
        val toplam = sayi1 + sayi2
        return toplam
    }

    val t2 = toplama2(100,200)
    println("t2: $t2")


}