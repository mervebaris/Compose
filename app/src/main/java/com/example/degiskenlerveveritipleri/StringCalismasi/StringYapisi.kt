package com.example.degiskenlerveveritipleri.StringCalismasi

fun main(){
    val str1 = "Hellüüğğ"
    println(str1)

    var str2 = String()
    str2 = "Kotlin"
    println(str2)

    val str3 = """
        HEEEYYYY
        NASILSIN
        """.trimIndent()
    println(str3)

    val str4 = ""

    var str5 = String()
    str5 = "x"

    if (str4.isEmpty()){
        println("str4 boş")
    }else{
        println("str4 dolu")
    }


    if (str5.isEmpty()){
        println("str5 boş")
    }else{
        println("str5 dolu")
    }

    val varA = 10
    val varB = 20
    println("$varA x $varB = ${varA*varB}")


    val str6 = "Hellüğğğğ"
    val str7 = " Meerrr"
    println(str6+str7)

    val str8 = "Merhaba,Kotlin !"
    println("$str8 boyutu : ${str8.length}")

    val str9 = "merhaba"
    val str10 = "merhaba dünya"

    if (str9 == str10){
        println("$str9 ve $str10 eşittir")
    }else{
        println("$str9 ve $str10 eşit değildir")
    }

    val str11 = "Merhaba"
    for (s in str11){
        println(s)
    }



}