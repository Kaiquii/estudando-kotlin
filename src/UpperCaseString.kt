//fun uppercaseString(text: String): String {
//    return text.uppercase()
//}

// println(uppercaseString("hello")) passar assim na main, ou da pra fazer da forma abaixo

fun upperCaseString() {
    val upperCaseString = { text: String -> text.uppercase() }
    println(upperCaseString("hello"))
}
