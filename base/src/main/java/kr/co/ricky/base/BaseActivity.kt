package kr.co.ricky.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider

/**
 * BaseActivity
 *
 * @param layoutResId 레이아웃 Resource Id
 *
 * @property binding 바인딩 객체
 * @property viewModel ViewModel. 사용하지 않을 경우 null
 *
 * @author ricky
 * @since v1.0.0 / 2020.12.28
 */
abstract class BaseActivity<T : ViewDataBinding>(
    @LayoutRes private val layoutResId: Int
) : AppCompatActivity() {
    protected lateinit var binding: T
    protected abstract val viewModel: BaseViewModel?

    val viewModelFactory: ViewModelProvider.AndroidViewModelFactory by lazy {
        ViewModelProvider.AndroidViewModelFactory.getInstance(application)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutResId)
    }
}
