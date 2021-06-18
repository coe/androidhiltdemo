package app.hyuga.myapplicationnav.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import app.hyuga.myapplicationnav.AnalyticsAdapter
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    val handle: SavedStateHandle,
    val analytics: AnalyticsAdapter
) : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = analytics.aaa()
    }
    val text: LiveData<String> = _text
}