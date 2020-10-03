package com.winechitpaing.sampleviewpod.viewpods

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.viewpod_personal_data_detail.view.*

class PersonalDataDetailViewPod @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttrs: Int = 0
) : CardView(context, attrs, defStyleAttrs) {

    companion object {

        fun newInstance(
            view: View
        ): PersonalDataDetailViewPod {
            return view as PersonalDataDetailViewPod
        }
    }

    fun bindData(name: String, phone: String, address: String) {
        tvName.text = name
        tvPhone.text = phone
        tvAddress.text = address
    }
}