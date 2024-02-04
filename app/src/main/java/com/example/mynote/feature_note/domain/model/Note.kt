package com.example.mynote.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mynote.ui.theme.BabyBlue
import com.example.mynote.ui.theme.LightGreen
import com.example.mynote.ui.theme.RedOrange
import com.example.mynote.ui.theme.RedPink
import com.example.mynote.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}
