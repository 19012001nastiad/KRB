package model

import repo.Item

class Product(
    override val name: String,
    val description: String = "",
    val categories: Categories,
    val price: Int
   ) : Item