package model

class Workman(
    name: String
) : Person(name) {
    val income = ArrayList<Float>()
}