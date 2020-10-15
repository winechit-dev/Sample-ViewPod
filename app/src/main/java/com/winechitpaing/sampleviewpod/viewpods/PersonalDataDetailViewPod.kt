package com.winechitpaing.sampleviewpod.viewpods

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import androidx.cardview.widget.CardView
import com.winechitpaing.sampleviewpod.databinding.ViewpodPersonalDataDetailBinding

class PersonalDataDetailViewPod @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttrs: Int = 0
) : CardView(context, attrs, defStyleAttrs) {

    private val binding by lazy {
        ViewpodPersonalDataDetailBinding.bind(this)
    }

    companion object {

        fun newInstance(
            view: View
        ): PersonalDataDetailViewPod {
            return view as PersonalDataDetailViewPod
        }
    }

    fun bindData(name: String, phone: String, address: String) {
        binding.tvName.text = name
        binding.tvPhone.text = phone
        binding.tvAddress.text = address
    }
}
