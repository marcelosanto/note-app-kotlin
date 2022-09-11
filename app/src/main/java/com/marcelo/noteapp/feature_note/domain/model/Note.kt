package com.marcelo.noteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.marcelo.noteapp.ui.theme.*

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,

    @PrimaryKey val id: Int? = null
){
    companion object {
        val noteColors = listOf(RedOrange,LightGreen, Violet, BabyBlue, RedPink)
    }
}
