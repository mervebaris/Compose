package com.example.degiskenlerveveritipleri

fun main(){

    for(i in 3..5){ //3,4,5
        println(i)
    }


    //10 ve 20 arasında 5er 5er artması
    var baslangic = 10
    var bitis = 20
    var artis = 5

    for(a in baslangic..bitis step artis){
        println("a : $a")
    }

    //20 ve 10 arası tersine 2şer artış
    for (b in 20 downTo 10 step 2){
        println("b : $b")
    }

    for (c in 1 until 5){ //sondaki sayıyı siliyor
        println("c : $c")
    }

    var sayac = 1

    while (sayac < 4){
        println("sayac: $sayac")
        sayac += 1 // sayac = sayac + 1 (uzun azım şekli)
    }


}