package `básico`

//class básico.Contact(val id: Int, var email: String = "exemplo@gmail.com") {
//    val category: String = "work"
//}

class Contact(val id: Int, var email: String)

// Colocar no básico.main

//val contact = básico.Contact(1, "mary@gmail.com")
//println("O endereço do e-mail é: ${contact.email}")

class ContactMember(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}

// Colocar no básico.main

//val contact = básico.ContactMember(1,  "mary@gmail.com")
//contact.printId()

data class User(val name: String, val id: Int)

// Colocar no básico.main, usando data class básico.User()

//val user = básico.User("Kaiqui", 1)
//println(user)

// também pode comparar as instâncias

//val user = básico.User("Alex", 1)
//val secondUser = básico.User("Alex", 1)
//val thirdUser = básico.User("Max", 2)
//
//println("user == secondUser: ${user == secondUser}")
//println("user == thirdUser: ${user == thirdUser}")
//println(user.copy("Max")) // Cria uma cópia e altera dados
