package com.pseedk.simnots.db.repository

import androidx.lifecycle.LiveData
import com.pseedk.simnots.db.dao.NoteDao
import com.pseedk.simnots.model.NoteModel

class NoteRealization(private val noteDao: NoteDao) : NoteRepository {
    override val allNotes: LiveData<List<NoteModel>>
        get() = noteDao.getAllNotes()

    override suspend fun insertNote(noteModel: NoteModel, onSuccess: () -> Unit) {
        noteDao.insert(noteModel)
        onSuccess()
    }

    override suspend fun deleteNote(noteModel: NoteModel, onSuccess: () -> Unit) {
        noteDao.delete(noteModel)
        onSuccess()
    }
}