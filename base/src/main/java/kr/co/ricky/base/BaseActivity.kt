package kr.co.ricky.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

/**
 * BaseActivity
 *
 * @param layoutResId 레이아웃 Resource Id
 *
 * @property binding 바인딩 객체
 *
 * @author ricky
 * @since v1.0.0 / 2020.12.28
 */
abstract class BaseActivity<T : ViewDataBinding>(
    @LayoutRes private val layoutResId: Int
) : AppCompatActivity() {
    protected lateinit var binding: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutResId)
    }
}
