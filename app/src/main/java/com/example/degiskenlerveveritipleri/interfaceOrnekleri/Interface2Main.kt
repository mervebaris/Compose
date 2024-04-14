package com.example.degiskenlerveveritipleri.interfaceOrnekleri

fun main(){
    val aslan = Interface2Aslan()

    val amasyaElmasi:Interface2Elma = Interface2AmasyaElmasi()

    val elma = Interface2Elma()

    val tavuk:Interface2Eatable = Interface2Tavuk()

    val nesneler = arrayOf(aslan,amasyaElmasi,elma,tavuk)

    for (nesne in nesneler){

        if (nesne is Interface2Eatable){
            nesne.howToEat()
        }

        if (nesne is Interface2Squeezable){
            nesne.howToSqueeze()
        }


    }
}