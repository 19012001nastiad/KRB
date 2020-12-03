package model

import saleList
import clientsList
import productList

class Cart(
    val clientName: String
) {
    private var viewingProduct: Product? = null

    fun sale(saleList: ArrayList<Product>, clientName: String) {
        for (i in 0..clientsList.size)
            if (clientsList[i].name == clientName)
                clientsList[i].library.plus(saleList)
    }

    fun productOnCategories(categories: Categories) {
        for (i in 0..productList.size)
            if (productList[i].categories == categories)
                viewingProduct = productList[i]
    }

    fun findProduct(name: String) {
        viewingProduct = productList.find { it.name == name }
    }

    fun addProductInCart(product: Product) {
        saleList.plus(product)
    }

    fun deleteProductFromCart(product: Product) {
        for (i in 0..saleList.size)
            if (saleList[i] == product)
                saleList.minus(i)
    }
}


