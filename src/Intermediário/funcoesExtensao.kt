package `Intermediário`

import java.util.Locale.getDefault

class SimplesClass {
    private lateinit var myName: String

    constructor(myName: String) {
        this.myName = myName
    }

    fun getMyName(): String {
        return this.myName
    }
}

fun SimplesClass.GetMyUppername(): String {
    return getMyName().uppercase(getDefault())
}

// Como usar no main

//val instancia = SimplesClass("Kaiqui gay")
//println(instancia.getMyName())
//println(instancia.GetMyUppername())
