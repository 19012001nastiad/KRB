package model

import clientsList
import workmanList
import productList
import persons

class Store () {

    fun addClientByName(name: String) {
        persons[name]?.let {
            if (it is Client)
                clientsList.add(it)
        }
    }

    fun addWorkmanName(name: String) {
        persons[name]?.let {
            if (it is Workman)
                workmanList.add(it)
        }
    }

    fun addCategories(categories: Categories) {
        val newGenre = categories.find { it.name == categories.name }
        if (newGenre == null)
            categories += categories
    }

}