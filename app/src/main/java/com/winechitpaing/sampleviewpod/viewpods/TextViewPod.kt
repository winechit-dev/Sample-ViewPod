package com.winechitpaing.sampleviewpod.viewpods

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.res.ResourcesCompat
import com.winechitpaing.sampleviewpod.R

class TextViewPod @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttrs: Int = 0
): AppCompatTextView(context , attrs , defStyleAttrs){
    override fun setTypeface(tf: Typeface?) {
        val typeface = ResourcesCompat.getFont(context,
            R.font.notoserif_regular
        )
        super.setTypeface(typeface)
    }
}