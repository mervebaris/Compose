package com.example.degiskenlerveveritipleri.ArrayList.ArrayListCompostion

import java.util.Scanner

fun main(){

    val girdi = Scanner(System.`in`)

    val personeller = ArrayList<Personel>()


    for (i in 1..5 ){ //1,2,3,4,5

        println("$i. Personel Ad: ") // 1. Personel Ad
        val isim = girdi.next()

        println("$i. Personel Adres İl: ") // 1. Personel Adres İl
        val il = girdi.next()

        println("$i. Personel Adres İlçe: ") // 1. Personel Adres ilçe
        val ilçe = girdi.next()


        val adres = Adres(il, ilçe)

        val personel = Personel(i, isim, adres)

        personeller.add(personel)



    }
    for (p in personeller){
        println("****************")
        println("Pesonel No: ${p.no}")
        println("Pesonel Ad: ${p.isim}")
        println("Pesonel İl: ${p.adres.il}")
        println("Pesonel İlçe: ${p.adres.ilce}")
    }

}