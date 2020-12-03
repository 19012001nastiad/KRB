package model

class Client (
    name: String

    ) : Person(name) {
    val library = ArrayList<Product>()
}