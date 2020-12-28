package kr.co.ricky.architecture

import kr.co.ricky.architecture.databinding.FragmentMainBinding
import kr.co.ricky.base.BaseFragment

/**
 * MainFragment
 *
 * @author ricky
 * @since v1.0.0 / 2020.12.29
 */
class MainFragment : BaseFragment<FragmentMainBinding>(R.layout.fragment_main) {
    override fun init() {
        binding.tvTitle.text = "프레그먼트 테스트"
    }
}
