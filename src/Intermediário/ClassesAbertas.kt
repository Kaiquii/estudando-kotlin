package `Intermediário`

//open class Vehicle(val make: String, val model: String)
//
//class Carro(make: String, model: String, val numberOfDoors: Int):Vehicle(make, model)

// Como usar no main

//fun main() {
//    val car = Carro("Toyota", "Corolla", 4)
//
//    println("Informações do carro: Marca - ${car.make}, Modelo - ${car.model}, Número de portas - ${car.numberOfDoors}")
//}

open class Vehicle(val make: String, val model: String) {
    open fun displayInfo() {
        println("Informações do carro: Marca: $make, Modelo: $model")
    }
}

class Carro(make: String, model: String, val numberOfDoors: Int) : Vehicle(make, model) {
    override fun displayInfo() {
        println("Informações do carro: Marca: $make, Modelo: $model, Número de portas: $numberOfDoors")
    }
}

// Como usar no Main

//fun main() {
//    val car1 = Carro("Toyota", "Corolla", 4)
//    val car2 = Carro("Honda", "Civic", 4)
//
//    car1.displayInfo()
//    car2.displayInfo()
//}

// Classes e interfaces abertas

interface Ecologico {
    val emissionLevel: String
}

interface ElectricVehicle {
    val batteryCapacity: Double
}

open class Veiculo(val make: String, val model: String)

open class CarroVeiculo(make: String, model: String, numberOfDoors: Int) : Vehicle(make, model)

class  ElectricCar(
    make: String,
    model: String,
    numberOfDoors: Int,
    val capacity: Double,
    val emission: String
) : CarroVeiculo(make, model, numberOfDoors), Ecologico, ElectricVehicle {
    override val batteryCapacity: Double = capacity
    override val emissionLevel: String = emission
}

// Classes seladas

sealed class Mammal(val name: String)

class Cat(val catName: String) : Mammal(catName)
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    when (mammal) {
        is Human -> return "Olá  ${mammal.name}; Você está trabalhando como um(a)  ${mammal.name}"
        is Cat -> return "Olá  ${mammal.name}"
    }
}

// Como usar no Main

//fun main() {
//    println(greetMammal(Cat("Nina")))
//}

// Classes de enum

enum class State {
    IDLE, RUNNING, FINISHED
}

// como usar no main

//fun main() {
//    val state = State.RUNNING
//    val message = when (state) {
//        State.IDLE -> "Está ocioso"
//        State.RUNNING -> "Está funcionando"
//        State.FINISHED -> "Está acabado"
//    }
//    println(message)
//}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}

// Como usar no main

//fun main() {
//    val red = Color.RED
//
//    println(red.containsRed())
//    println(Color.BLUE.containsRed())
//    println(Color.YELLOW.containsRed())
//}

@JvmInline
value class Email(val address: String)

fun sendEmail(email: Email) {
    println("Enviando e-mail para ${email.address}")
}
