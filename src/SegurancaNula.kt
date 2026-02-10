fun nula() {
    var neverNull: String = "Isso não pode ser nulo"

    //neverNull = null // Comentei apenas para não ficar vermelho

    var nullable: String? = "Você pode manter um valor nulo aqui"

    nullable = null

    var inferredNonNull = "O compilador assume que não é possível aceitar valores nulos"

    //inferredNonNull = null // Comentei apenas para não ficar vermelho

    var podeserNulll: String? = nullable ?:  "aqui"
    println(podeserNulll)

    // notNull não aceita valores nulos
    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull))
    //println(strLength(nullable)) // Gera um erro de compilação
}

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "Cadeia de comprimento ${maybeString.length}"
    } else {
        return "String vazia ou nula"
    }
}

// colocar no main
//val nullString: String? = null
//println(describeString(nullString))

fun lengthString(maybeString: String?): Int? = maybeString?.length

// colocar no main
//val nullString: String? = null
//println(lengthString(nullString))

// Operador Elvis

fun elvis() {
    val nullString: String? = null
    println(nullString?.length ?: 0) // Retorna 0
}