package com.pseedk.simnots.screens.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pseedk.simnots.REPOSITORY
import com.pseedk.simnots.model.NoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DetailViewModel : ViewModel() {

    fun delete(noteModel: NoteModel, onSuccess: () -> Unit) =
        viewModelScope.launch (Dispatchers.IO) {
            REPOSITORY.deleteNote(noteModel) {
                onSuccess()
            }
        }
}