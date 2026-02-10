package `Intermediário`

fun String.bold(): String = "<b>$this</b>"

// como usar no main
//"Olá" é o receptor
//println("Olá".bold())
//<b>Olá</b>

fun Int.isPositive(): Boolean = this > 0 // verifica se um número é positivo ou negativo

// como usar no main
//println(1.isPositive()) ou
//println((-1).isPositive())

fun String.toLowerCaseString(): String = this.lowercase()

// como usar no main
//println("Olá Mundo!".toLowerCaseString())