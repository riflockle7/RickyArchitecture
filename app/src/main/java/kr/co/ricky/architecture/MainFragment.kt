package kr.co.ricky.architecture

import androidx.lifecycle.ViewModelProvider
import kr.co.ricky.architecture.databinding.FragmentMainBinding
import kr.co.ricky.base.BaseFragment

/**
 * MainFragment
 *
 * @author ricky
 * @since v1.0.0 / 2020.12.29
 */
class MainFragment : BaseFragment<FragmentMainBinding>(R.layout.fragment_main) {
    override val viewModel: MainViewModel by lazy {
        ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)
    }

    override fun init() {
        binding.setVariable(BR.vm, viewModel)

        binding.apply {
            //Do something
            viewModel.setTitle("프레그먼트 테스트")
        }
    }
}
