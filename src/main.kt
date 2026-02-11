import Intermediário.getNextAddress
import Intermediário.sendNotification


fun main() {
    val address: String = getNextAddress()
    sendNotification(address)
}
