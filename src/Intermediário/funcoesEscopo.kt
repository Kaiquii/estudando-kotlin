package `Intermediário`

fun sendNotification(recipientAddress: String): String {
    println("Yo $recipientAddress!")
    return "Notification sent!"
}

fun getNextAddress(): String {
    return "sebastian@jetbrains.com"
}

// Como usar no main
//val address: String = getNextAddress()
//sendNotification(address)