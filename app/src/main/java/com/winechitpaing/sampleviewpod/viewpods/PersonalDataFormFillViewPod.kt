package com.winechitpaing.sampleviewpod.viewpods

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.cardview.widget.CardView
import com.winechitpaing.sampleviewpod.databinding.ViewpodPersonalDataFormFillBinding
import com.winechitpaing.sampleviewpod.utils.InputValidateUtils

class PersonalDataFormFillViewPod @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttrs: Int = 0
) : CardView(context, attrs, defStyleAttrs) {

    private val binding by lazy {
        ViewpodPersonalDataFormFillBinding.bind(this)
    }

    companion object {
        fun newInstance(
            view: View
        ): PersonalDataFormFillViewPod {
            return view as PersonalDataFormFillViewPod
        }
    }

    fun bindData(name : String , phone : String , address : String){
        binding.actvName.setText(name)
        binding.actvPhone.setText(phone)
        binding.actvAddress.setText(address)
    }

    fun getName(): String? = if (InputValidateUtils.isGivenEditTextHasInput(
            binding.actvName,
            "Input your name!"
        )
    ) binding.actvName.text.toString() else null

    fun getPhone(): String? = if (InputValidateUtils.isGivenPhoneNoHasInput(
            binding.actvPhone,
            "Input your phone number"
        )
    ) binding.actvPhone.text.toString() else null

    fun getAddress(): String? = if (InputValidateUtils.isGivenEditTextHasInput(
            binding.actvAddress,
            "Input your address!"
        )
    ) binding.actvAddress.text.toString() else null

    fun validateInput(): Boolean =
        !getName().isNullOrBlank() && !getPhone().isNullOrBlank() && !getAddress().isNullOrBlank()
}
