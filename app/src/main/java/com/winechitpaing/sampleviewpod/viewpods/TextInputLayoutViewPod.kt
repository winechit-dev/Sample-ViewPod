package com.winechitpaing.sampleviewpod.viewpods

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.textfield.TextInputLayout
import com.winechitpaing.sampleviewpod.R

@SuppressLint("AppCompatCustomView")
class TextInputLayoutViewPod @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttrs: Int = 0
) : TextInputLayout(context, attrs, defStyleAttrs) {

    override fun setTypeface(tf: Typeface?) {
        val typeface = ResourcesCompat.getFont(context, R.font.notoserif_regular)
        super.setTypeface(typeface)
    }

}
