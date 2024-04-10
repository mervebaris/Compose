package com.example.degiskenlerveveritipleri

import com.example.degiskenlerveveritipleri.KonserveBoyut.*

fun main(){
    fun ucretAl(boyut: KonserveBoyut){

        when(boyut){
            Kucuk -> println(20*30)
            Orta ->  println(30*30)
            Buyuk -> println(40*40)
        }

    }

    ucretAl(Kucuk)
}