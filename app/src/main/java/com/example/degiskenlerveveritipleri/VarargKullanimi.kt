package com.example.degiskenlerveveritipleri

fun main(){

    //Vararg Dizi gibi çalışır !! for döngüsü ile sayıları çoğaltıp işlem yaptıracağız

    fun toplam(vararg sayilar:Int): Int { //Geri dönüşlü fonk. olarak tanımladık :Int diyerek

        var sonuc = 0

        for (s in sayilar){
            sonuc += s
        }

        return sonuc
    }

    val t1 = toplam(1,2,3,4,5,6,7,8)
    println("t1 : $t1")

}