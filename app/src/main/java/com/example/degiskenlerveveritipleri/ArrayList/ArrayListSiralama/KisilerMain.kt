package com.example.degiskenlerveveritipleri.ArrayList.ArrayListSiralama

 fun main(){

    val k1 = Kisiler(1,"Merve")
    val k2 = Kisiler(2,"Tuğberk")
    val k3 = Kisiler(3,"Pınar")
    val k4 = Kisiler(4,"Hüma")

    val kisielerArrayList = ArrayList<Kisiler>()

    kisielerArrayList.add(k1)
    kisielerArrayList.add(k2)
    kisielerArrayList.add(k3)
    kisielerArrayList.add(k4)




    println("önce")

    for (k in kisielerArrayList){
        println("${k.kisiNo} - ${k.kisiAd}")
    }


    //-----------------------------------------------------------------------


    println("Sayısal Küçükten Büyüğe")

    val siralamaArrayList1 = kisielerArrayList.sortedWith(compareBy { it.kisiNo })

    for (k in siralamaArrayList1){

        println("${k.kisiNo} - ${k.kisiAd}")
    }


    //-----------------------------------------------------------------------


    println("Sayısal Büyükten Küçüğe")

    val siralamaArrayList2 = kisielerArrayList.sortedWith(compareByDescending { it.kisiNo  })

    for (k in siralamaArrayList2){

        println("${k.kisiNo} - ${k.kisiAd}")
    }





     //-----------------------------------------------------------------------


     println("Harfsel Büyükten Küçüğe")

     val siralamaArrayList3 =  kisielerArrayList.sortedWith(compareByDescending { it.kisiAd  })

     for (k in siralamaArrayList3){
         println("${k.kisiNo} - ${k.kisiAd}")
     }








}