package kr.co.ricky.architecture

import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kr.co.ricky.architecture.databinding.ActivityMainBinding
import kr.co.ricky.base.BaseActivity
import kr.co.ricky.base.navigate

/**
 * MainActivity
 *
 * @author ricky
 * @since v1.0.0 / 2020.12.29
 */
class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override val viewModel: MainViewModel by lazy {
        ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.setVariable(BR.vm, viewModel)

        binding.apply {
            //Do something
            tvTitle.setOnClickListener { viewModel.setTitle("${viewModel.title.value}1") }
            MainFragment().navigate(supportFragmentManager, flFragment.id)
        }
    }
}
