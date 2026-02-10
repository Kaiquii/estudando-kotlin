package `básico`

//fun uppercaseString(text: String): String {
//    return text.uppercase()
//}

// println(uppercaseString("básico.hello")) passar assim na básico.main, ou da pra fazer da forma abaixo

fun upperCaseString() {
    val upperCaseString = { text: String -> text.uppercase() }
    println(upperCaseString("básico.hello"))
}
