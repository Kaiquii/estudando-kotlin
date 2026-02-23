package `Intermediário`

import java.io.File

fun printObjectType(obj: Any) {
    when (obj) {
        is Int -> println("É um número inteiro com o valor $obj")
        !is Double -> println("Não é um Double")
        else -> println("Unknown type")
    }
}

// Como usar no main

//fun main() {
//    val myInt = 42
//    val myDouble = 3.14
//    val myList = listOf(1, 2, 3)
//
//    // The type is Int
//    printObjectType(myInt)
//    // It's an Integer with value 42
//
//    // The type is List, so it's NOT a Double.
//    printObjectType(myList)
//    // It's NOT a Double
//
//    // The type is Double, so the else branch is triggered.
//    printObjectType(myDouble)
//    // Unknown type
//}

fun calculateTotalStringLength(items: List<Any>): Int {
    var totalLength = 0

    for (item in items) {
        totalLength += if (item is String) {
            item.length
        } else {
            0
        }
    }

    return totalLength
}

// Como usar no main

//fun main() {
//    val minhaLista = listOf("Kotlin", 10, "Java", true, "JavaScript", 3.14)
//
//    val resultado = calculateTotalStringLength(minhaLista)
//
//    println("O comprimento total das Strings é: $resultado")
//}

// versão resumida, faz a mesma coisa

fun calculateTotalString(items: List<Any>): Int {
    return items.sumOf { (it as? String)?.length ?: 0 }
}

val emails: List<String?> = listOf("kaiqui@example.com", null, "bob@example.com", null, "carol@example.com")
val validEmails = emails.filterNotNull()

// como usar no main

//fun main() {
//    println(validEmails)
//}

val serverConfig = mapOf(
    "appConfig.json" to "App Configuration",
    "dbConfig.json" to "Database Configuration",
)

val requestedFile = "appConfig.json"
val configFiles = listOfNotNull(serverConfig[requestedFile])

// Como usar no main

//fun main() {
//    println(configFiles)
//}

fun CalculateTemperatures() {
    val temperatures = listOf(15, 18, 21, 21, 19, 17, 16)

    val maxTemperature = temperatures.maxOrNull()
    println("Temperatura máxima registrada: ${maxTemperature ?: "Sem dados"}")

    val minTemperature = temperatures.minOrNull()
    println("Temperatura mínima registrada: ${minTemperature ?: "Sem dados"}")
}

// Como usar no main

//fun main() {
//    CalculateTemperatures()
//}

data class User(val name: String?, val age: Int?)

val users = listOf(
    User(null, 25),
    User("Alice", null),
    User("Bob", 30)
)

// Como usar no main

//fun main() {
//    val firstNonNullName = users.firstNotNullOfOrNull { it.name }
//    println(firstNonNullName)
//}

