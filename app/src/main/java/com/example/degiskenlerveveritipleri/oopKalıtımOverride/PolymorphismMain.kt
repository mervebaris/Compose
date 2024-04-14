package com.example.degiskenlerveveritipleri.oopKalıtımOverride

fun main(){
    val hayvan:Hayvan = Kopek()
    hayvan.sesCikar()

    val h:Hayvan = Kedi()
    h.sesCikar()
}