package `Intermediário`

class Contact(val id: Int, var email: String) {
    var category: String = ""
        get() = field
        set(value) {
            field = value
        }
}

class Person {
    var name: String = ""
        set(value) {
            field = value.replaceFirstChar { firstChar -> firstChar.uppercase() }
        }
}

// como usar na main

//fun main() {
//    val person = Person()
//    person.name = "Kaiqui"
//    println(person.name)
//}