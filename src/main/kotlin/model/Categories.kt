package model

import repo.Item

class Categories (
    override val name: String,
    val shortname: String
    ) : Item