package kr.co.ricky.architecture

import androidx.databinding.ObservableField
import kr.co.ricky.base.BaseViewModel

/**
 * MainViewModel
 *
 * @author ricky
 * @since v1.0.0 / 2020.12.29
 */
class MainViewModel : BaseViewModel() {
    val title: ObservableField<String> = ObservableField()
}
