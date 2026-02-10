//class Contact(val id: Int, var email: String = "exemplo@gmail.com") {
//    val category: String = "work"
//}

class Contact(val id: Int, var email: String)

// Colocar no main

//val contact = Contact(1, "mary@gmail.com")
//println("O endereço do e-mail é: ${contact.email}")

class ContactMember(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}

// Colocar no main

//val contact = ContactMember(1,  "mary@gmail.com")
//contact.printId()

data class User(val name: String, val id: Int)

// Colocar no main, usando data class User()

//val user = User("Kaiqui", 1)
//println(user)

// também pode comparar as instâncias

//val user = User("Alex", 1)
//val secondUser = User("Alex", 1)
//val thirdUser = User("Max", 2)
//
//println("user == secondUser: ${user == secondUser}")
//println("user == thirdUser: ${user == thirdUser}")
//println(user.copy("Max")) // Cria uma cópia e altera dados
