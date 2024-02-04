package com.example.mynote.feature_note.domain.util

sealed class OrderType {
    object Ascending: OrderType()
    object Desending: OrderType()
}
