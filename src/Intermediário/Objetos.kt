package `Intermediário`

object DoAuth {
    fun takeParams(username: String, password: String) {
        println("Parâmetros de autenticação de entrada = $username:$password")
    }
}

// Como usar no Main

//fun main() {
//    DoAuth.takeParams("Kaiqui", "SenhaSegura@123")
//}

// Objetos podem herdar de classes e interfaces. Por exemplo:

interface Auth {
    fun takeParams2(username: String, password: String)
}

object DoAuth2 : Auth {
    override fun takeParams2(username: String, password: String) {
        println("parâmetros de autenticação de entrada = $username:$password")
    }
}

data object AppConfig {
    var appName: String = "My Application"
    var version: String = "1.0.0"
}

// como usar data object no Main

//fun main() {
//    println(AppConfig)
//    println(AppConfig.appName)
// ou
//    println(AppConfig.appName)
//    println(AppConfig.version)
//}

// objetos companheiros

class BigBen {
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            repeat(nTimes) { print("BONG ") }
        }
    }
}

// Como usar no Main

//fun main() {
//    BigBen.getBongs(12) // Repete Bong n vezes
//}