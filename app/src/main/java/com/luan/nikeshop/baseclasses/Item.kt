package com.luan.nikeshop.baseclasses

data class Item(
    var endereco: String? = null,
    val base64Image: String? = null,
    val imageUrl: String? = null,
    var preco: Float? = null,
    var tamanho: Int? = null,
    var cor: String? = null,
)
