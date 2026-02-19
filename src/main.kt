import Intermediário.CreditCardPayment

fun main() {
    val paymentMethod = CreditCardPayment("1234 5678 9012 3456", "Kaiqui Lucas", "12/25")
    println(paymentMethod.initiatePayment(100.0))
}
