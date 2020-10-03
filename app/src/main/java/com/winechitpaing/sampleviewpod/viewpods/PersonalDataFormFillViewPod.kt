package com.winechitpaing.sampleviewpod.viewpods

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import com.winechitpaing.sampleviewpod.utils.InputValidateUtils
import kotlinx.android.synthetic.main.viewpod_personal_data_form_fill.view.*

class PersonalDataFormFillViewPod @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttrs: Int = 0
) : CardView(context, attrs, defStyleAttrs) {

    companion object {
        fun newInstance(
            view: View
        ): PersonalDataFormFillViewPod {
            return view as PersonalDataFormFillViewPod
        }
    }

    fun bindData(name : String , phone : String , address : String){
        actvName.setText(name)
        actvPhone.setText(phone)
        actvAddress.setText(address)
    }

    fun getName(): String? = if (InputValidateUtils.isGivenEditTextHasInput(
            actvName,
            "Input your name!"
        )
    ) actvName.text.toString() else null

    fun getPhone(): String? = if (InputValidateUtils.isGivenPhoneNoHasInput(
            actvPhone,
            "Input your phone number"
        )
    ) actvPhone.text.toString() else null

    fun getAddress(): String? = if (InputValidateUtils.isGivenEditTextHasInput(
            actvAddress,
            "Input your address!"
        )
    ) actvAddress.text.toString() else null

    fun validateInput(): Boolean =
        !getName().isNullOrBlank() && !getPhone().isNullOrBlank() && !getAddress().isNullOrBlank()
}