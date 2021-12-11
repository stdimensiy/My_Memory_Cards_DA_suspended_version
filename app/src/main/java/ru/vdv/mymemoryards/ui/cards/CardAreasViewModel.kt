package ru.vdv.mymemoryards.ui.cards

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CardAreasViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Фрагмент отображения карточек областей знаний"
    }
    val text: LiveData<String> = _text
}