package `básico`

fun controle() {
    val obj = "Hello"

    val result = when (obj) {
        "1" -> "One"
        "Hello" -> "Greeting"
        else -> "Unknown"
    }

    println(result)
    println("--------------------------------")
    farolUpgrade()
}

fun farol() { // faz a mesma coisa do básico.farolUpgrade, porem menos verboso
    val trafficLightState = "Red"

    val trafficAction = when {
        trafficLightState == "Green" -> "Vai"
        trafficLightState == "Yellow" -> "Atenção"
        trafficLightState == "Red" -> "Pare"
        else -> "Malfunction"
    }

    println(trafficAction)
}

fun farolUpgrade() {
    val trafficLightState = "Red"

    val trafficAction = when(trafficLightState) {
        "Green" -> "Vai"
        "Yellow" -> "Atenção"
        "Red" -> "Pare"
        else -> "Malfunction"
    }

    println(trafficAction)
}