package hybrid.ng.fonta

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.widget.TextView

/**
 * Created by kluivert 11/9/2019.
 */
@SuppressLint("AppCompatCustomView")
class TextViewFont : TextView {

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        init()
        nexaLight()
        roboRegular()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
        nexaLight()
        roboRegular()
    }

    constructor(context: Context) : super(context) {
        init()
        nexaLight()
        roboRegular()
    }

    private fun init() {
        if (!isInEditMode) {
            val tf = Typeface.createFromAsset(context.assets, "Lato-Regular.ttf")
            typeface = tf
        }
    }

    private fun nexaLight() {
        if (!isInEditMode) {
            val nexa = Typeface.createFromAsset(context.assets, "NexaLight.otf")
            typeface = nexa
        }
    }

    private fun roboRegular() {
        if (!isInEditMode) {
            val robo = Typeface.createFromAsset(context.assets, "Roboto-Regular.ttf")
            typeface = robo
        }
    }


}