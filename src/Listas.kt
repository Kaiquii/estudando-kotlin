fun list() {
    val lista = listOf("Letra A", "Letra B", "Letra C")
    val lista2: MutableList<String> = mutableListOf("Maçã", "Banana", "Melancia", "Melão")

    println("-----------------------------------")
    println(lista)
    println("Eu quero a: ${lista[0]}")
    println("O primeiro item da lista é: ${lista.first()}")
    println("O ultimo item da lista é: ${lista.last()}")
    println("A lista tem ${lista.count()} itens")
    println("Letra D" in lista) // Verificar se um item está na Lista
    println("------------------------------------")
    println(lista2)
    println("Eu quero comer uma: ${lista2[0]}")
    println("o primeiro item da lista é: ${lista2.first()}")
    println("o ultimo item da lista é: ${lista2.last()}")
    println("A lista tem ${lista2.count()} itens")
    println("Banana" in lista2) // Verificar se um item está na Lista
    println("-----------------------------------")
    listAddandRemove() // Usando a função no main
    println("-----------------------------------")
    ListAndValue() // Usando a função no main
}

fun listAddandRemove() {
    val list: MutableList<Int> = mutableListOf(1, 2, 3)
    list.add(4) // Adiciona item da lista
    list.remove(3) // Remove item da lista
    println(list)
}

fun ListAndValue() {
    val list = mapOf("Mouse" to 100, "Teclados" to 20, "Monitores" to 35)
    println(list)
    println("O valor de mouse em estoque é ${list["Mouse"]}")
    println("Esse mapa tem ${list.count()} itens")
    println(list.containsKey("Teclados")) // Verificar se tem pela key, da pra fazer por string e int
    println("------------------------------------")
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("Maça" to 15, "Kiwi" to 15, "Laranja" to 35)
    juiceMenu["Coco"] = 150 // Adicionar itens na lista
    juiceMenu.remove("Laranja")
    println("Maça" in juiceMenu.keys) // Verificar se tem o item pela key
    println(200 in juiceMenu.values) // Verificar de tem pelo valor
    println(juiceMenu)
}