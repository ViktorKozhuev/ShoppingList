package com.viktor.shoppinglist.data

import com.viktor.shoppinglist.domain.ShopItem

class ShopListMapper {

    fun mapEntityToDbModel(shopItem: ShopItem): ShopItemDbModel {
        return ShopItemDbModel(
            id = shopItem.id,
            name = shopItem.name,
            count = shopItem.count,
            enable = shopItem.enable
        )
    }

    fun mapDbModelToEntity(shopItemDbModel: ShopItemDbModel): ShopItem {
        return ShopItem(
            id = shopItemDbModel.id,
            name = shopItemDbModel.name,
            count = shopItemDbModel.count,
            enable = shopItemDbModel.enable
        )
    }

    fun mapListDbModeToListEntity(list: List<ShopItemDbModel>) = list.map {
        mapDbModelToEntity(it)
    }
}