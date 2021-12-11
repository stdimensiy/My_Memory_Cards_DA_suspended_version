package ru.vdv.mymemoryards.ui.statistics

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StatisticsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Фрагмент отображения статистики пользователя и его друзей"
    }
    val text: LiveData<String> = _text
}