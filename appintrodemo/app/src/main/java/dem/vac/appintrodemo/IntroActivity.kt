package dem.vac.appintrodemo

import android.R.attr.description
import android.graphics.Color
import android.os.Bundle
import android.view.Window
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.github.paolorotolo.appintro.*
import com.github.paolorotolo.appintro.model.SliderPage


class IntroActivity : AppIntro() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Activity中不能加载setContentView
//        setContentView(R.layout.activity_intro)

        //动画效果
//        setFadeAnimation()
//        setZoomAnimation()
        setFlowAnimation()
//        setSlideOverAnimation()
//        setDepthAnimation()

        //设置分割线颜色
        setSeparatorColor(Color.WHITE)

        //实例化
        val sliderPage = SliderPage()
        //设置标题
        sliderPage.title = "标题一"
        //设置说明
        sliderPage.description = "第一个测试说明"
        //设置图片来源
        sliderPage.imageDrawable = R.drawable.person
        //设置背景颜色
        sliderPage.bgColor = Color.TRANSPARENT
        addSlide(AppIntroFragment.newInstance(sliderPage))

        sliderPage.title = "标题二"
        sliderPage.titleColor = Color.GREEN
        sliderPage.description = "第二个测试说明"
        sliderPage.imageDrawable = R.drawable.person2
        sliderPage.bgColor = Color.BLUE
        addSlide(AppIntroFragment.newInstance(sliderPage))


        //添加自定义的Fragment
        addSlide(SliderFragment.newInstance(R.layout.activity_intro))

    }

    //当执行跳过动作时触发
    override fun onSkipPressed(currentFragment: Fragment?) {
        super.onSkipPressed(currentFragment)
        Toast.makeText(this, "跳过",
            Toast.LENGTH_SHORT).show()
        finish()
    }

    //当执行完成动作时触发
    override fun onDonePressed(currentFragment: Fragment?) {
        super.onDonePressed(currentFragment)

        Toast.makeText(this, "完成",
            Toast.LENGTH_SHORT).show()
        finish()
    }

    //当执行页面切换时触发
    override fun onSlideChanged(oldFragment: Fragment?, newFragment: Fragment?) {
        super.onSlideChanged(oldFragment, newFragment)
//        Toast.makeText(this, "页面跳转",
//            Toast.LENGTH_SHORT).show()

    }

}
