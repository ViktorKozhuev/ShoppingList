package com.viktor.shoppinglist.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.viktor.shoppinglist.data.ShopListRepositoryImpl
import com.viktor.shoppinglist.domain.DeleteShopItemUseCase
import com.viktor.shoppinglist.domain.EditShopItemUseCase
import com.viktor.shoppinglist.domain.GetShopListUseCase
import com.viktor.shoppinglist.domain.ShopItem

class MainViewModel : ViewModel(){

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enable = !shopItem.enable)
        editShopItemUseCase.editShopItem(newItem)
    }
}