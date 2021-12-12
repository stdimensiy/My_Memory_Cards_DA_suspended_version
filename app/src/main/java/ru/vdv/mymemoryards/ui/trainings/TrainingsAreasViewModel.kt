package ru.vdv.mymemoryards.ui.trainings

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TrainingsAreasViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Фрагмент отображения областей знаний с тренировками (тестами)"
    }
    val text: LiveData<String> = _text
}