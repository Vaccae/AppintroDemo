package dem.vac.appintrodemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * 作者：Vaccae
 * 邮箱：3657447@qq.com
 * 创建时间：2019-12-19 14:44
 * 功能模块说明：
 */
class SliderFragment : Fragment() {

    companion object {

        private val ARG_LAYOUT_ID = "layoutId"

        private var layoutId = 0
        fun newInstance(layoutid: Int): SliderFragment {
            val slider = SliderFragment()
            val args = Bundle()
            args.putInt(ARG_LAYOUT_ID, layoutid)

            slider.arguments = args

            return slider
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments ?: return

        if (arguments!!.containsKey(ARG_LAYOUT_ID)) {
            layoutId = arguments!!.getInt(ARG_LAYOUT_ID)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        return super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(layoutId, container, false)
    }

}