package com.example.degiskenlerveveritipleri.interfaceOrnekleri

import com.example.degiskenlerveveritipleri.Interface1

class Interface1Class:Interface1 { //ınterfacein özelliklerini bir sınıfa arktarıyorsak hepsini kullnmalıyız !!
    override val degisken: Int = 10


    override fun method1() {
        println("Interface hellüüğğ")

    }

    override fun method2():String {
        return "Interface çalışması"

    }
}