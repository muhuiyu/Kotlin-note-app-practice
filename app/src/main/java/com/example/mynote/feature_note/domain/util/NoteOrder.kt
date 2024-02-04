package com.example.mynote.feature_note.domain.util

sealed class NoteOrder(val orderTyoe: OrderType) {
    class Title(orderType: OrderType): NoteOrder(orderType)
    class Date(orderType: OrderType): NoteOrder(orderType)
    class Color(orderType: OrderType): NoteOrder(orderType)
}