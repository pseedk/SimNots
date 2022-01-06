package com.example.simnots.db.repository

import androidx.lifecycle.LiveData
import com.example.simnots.model.NoteModel

interface NoteRepository {

    val allNotes: LiveData<List<NoteModel>>
    suspend fun insertNote(noteModel: NoteModel, onSuccess: () -> Unit)
    suspend fun deleteNote(noteModel: NoteModel, onSuccess: () -> Unit)
}