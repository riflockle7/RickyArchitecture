package kr.co.ricky.base

import androidx.lifecycle.ViewModel

/**
 * BaseViewModel
 *
 * @author ricky
 * @since v1.0.0 / 2020.12.29
 */
open class BaseViewModel : ViewModel() {

    override fun onCleared() {
        super.onCleared()
    }
}
