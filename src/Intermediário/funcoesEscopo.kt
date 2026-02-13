package `Intermediário`

fun sendNotification(recipientAddress: String): String {
    println("Yo $recipientAddress!")
    return "Notification sent!"
}

fun getNextAddress(): String {
    return "sebastian@jetbrains.com"
}

// Como usar no main
//val address: String = getNextAddress()
//sendNotification(address)

class Client() {
    var token: String? = null
    fun connect() = println("connected!")
    fun authenticate() = println("authenticated!")
    fun getData() : String {
        println("getting data!")
        return "Mock data"
    }
}

val client = Client()

// ou o client pode ser criado assim

//val client = Client().apply {
//    token = "asdf"
//    connect()
//    authenticate()
//}

//val client: Client = Client().apply { token = "asdf" }

// Como usar no main
//client.token = "asdf"
//client.connect()
//client.authenticate()
//client.getData()

fun medalhas() {
    val medals: List<String> = listOf("Gold", "Silver", "Bronze")
}