package kr.co.ricky.architecture

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kr.co.ricky.base.BaseViewModel

/**
 * MainViewModel
 *
 * @author ricky
 * @since v1.0.0 / 2020.12.29
 */
class MainViewModel : BaseViewModel() {
    private val _title = MutableLiveData("")
    val title: LiveData<String> = _title

    init {
        _title.value = "액티비티 테스트"
    }

    fun setTitle(value: String) {
        _title.value = value
    }
}
