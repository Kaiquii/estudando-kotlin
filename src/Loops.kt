fun loops() {
    for (number in 1..5) {
        print(number)
    }

    println("\n-------------------------------") // esse /n é a mesma coisa do <br/>
}

fun cokkie() {
    val biscoitos = listOf("Cenoura", "Queijo", "Chocolate")

    for (biscoito in biscoitos) {
        println("Esse biscoito é de $biscoito")
    }

    println("-------------------------------")
}

fun cakesCount() {
    var cakes = 0
    while (cakes < 3) {
        println("Coma um biscoito")
        cakes++
    }
}