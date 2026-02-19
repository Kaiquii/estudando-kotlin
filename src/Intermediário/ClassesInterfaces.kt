package `Intermediário`

// Classes

class Car(
    val marca: String,
    val modelo: String,
    val portas: Int
)

fun carros() {
    val car1 = Car("Toyota", "Corolla", 4)

    println("Marca: ${car1.marca}, Modelo: ${car1.modelo}, Qtd De Portas: ${car1.portas}")
}

// Como Usar na Main

//fun main() {
//    carros()
//}

abstract class Product(val name: String, var price: Double) {
    abstract val categoria: String

    fun productInfo(): String {
        return "Produto: $name, Categoria: $categoria, Preço: $price"
    }
}

class Electronic(name: String, price: Double, val garantia: Int) : Product(name, price) {
    override val categoria = "Electronic"
}

// como usar no main

//fun main() {
//    val laptop = Electronic(name = "Laptop", price = 1000.0, garantia = 2)
//
//    println(laptop.productInfo())
//}

// Interfaces

interface PaymentMethod {
    fun initiatePayment(amount: Double): String
}

class CreditCardPayment(val cardNumber: String, val cardHolderName: String, val expiryDate: String) : PaymentMethod {
    override fun initiatePayment(amount: Double): String {
        return "Pagamento de $$amount iniciado usando cartão de crédito terminando em ${cardNumber.takeLast(4)}."
    }
}

// Como usar na Main

//fun main() {
//    val paymentMethod = CreditCardPayment("1234 5678 9012 3456", "Kaiqui Lucas", "12/25")
//    println(paymentMethod.initiatePayment(100.0))
//}

// Delegação

interface FerramentaDesenho {
    val color: String
    fun draw(shape: String)
    fun erase(area: String)
    fun getToolInfo(): String
}

class PenTool : FerramentaDesenho {
    override val color: String = "Black"

    override fun draw(shape: String) {
        println("Desenho $shape usando uma caneta em $color")
    }

    override fun erase(area: String) {
        println("Apagando $area com a ferramenta caneta")
    }

    override fun getToolInfo(): String {
        return "FerramentaCaneta(color=$color)"
    }
}
