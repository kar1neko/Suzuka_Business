package com.example.suzuka_business_contest.ui.premium

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PremiumViewModel : ViewModel() {

    private val _text = MutableLiveData<String>()
    val text: LiveData<String> = _text
}