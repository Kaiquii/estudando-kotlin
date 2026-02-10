fun main() {
    val user = User("Alex", 1)
    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

//    println("user == secondUser: ${user == secondUser}")
//    println("user == thirdUser: ${user == thirdUser}")

    println(user.copy("Max")) // Cria uma cópia e altera dados
}
