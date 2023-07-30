package com.viktor.shoppinglist.domain

data class ShopItem(
    val name: String,
    val count: Int,
    val enable: Boolean,
    var id: Int = UNDEFINED_OBJECT,
) {

    companion object {
        const val UNDEFINED_OBJECT = -1
    }

}
