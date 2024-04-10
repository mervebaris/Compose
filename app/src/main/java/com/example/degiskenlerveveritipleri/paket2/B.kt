package com.example.degiskenlerveveritipleri.paket2

import com.example.degiskenlerveveritipleri.paket1.A

class B : A() {

    fun fonksiyon(){

        //val nesne = A()

        // println(nesne.varsayilanDegisken)
        // println(nesne.publicDegisken)
        // println(nesne.internalDegisken)
        // println(nesne.privateDegisken) hata verdi buna buradan erişemedik sadece SINIF içinden erişilebilir
        // println(nesne.protectedDegisken) hata verdi A sınıfından türemesi gerekir çalışabilmesi için B sınıfı kalıtım yoluyla bir sınıftan türemediği için hata verdi


        println(varsayilanDegisken)
        println(publicDegisken)
        println(internalDegisken)
       // println(privateDegisken)
        println(protectedDegisken)
    }

}