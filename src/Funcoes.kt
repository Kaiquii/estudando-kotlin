fun hello() {
    return println("Olá Mundo!")
}

//fun sum(x: Int, y: Int): Int {
//    return x + y
//}

// Ou pode fazer assim tbm

fun sum(x: Int, y: Int) = x + y

fun printMessage(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

val RegisteredUsers = mutableListOf("kaiqui", "Thamires", "João", "Leonardo")
val RegisteredEmail = mutableListOf("kaiqui@gmail.com", "thamires@gmail.com", "joao@gmail.com", "leonardo@gmail.com" )

fun registerUser(username: String, email: String): String {
    if (username in RegisteredUsers) {
        return "O nome de usuário já está cadastrado. Por favor, escolha um nome de usuário diferente."
    }

    if (email in RegisteredEmail) {
        return "E-mail já cadastrado. Por favor, escolha um e-mail diferente."
    }

    RegisteredUsers.add(username)
    RegisteredEmail.add(email)

    return "Usuário cadastrado com sucesso: $username"
}