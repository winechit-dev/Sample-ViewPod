package com.winechitpaing.sampleviewpod.utils

import android.widget.EditText

object InputValidateUtils {


    fun isGivenEditTextHasInput(editText: EditText, errorMessage: String): Boolean {
        return if (editText.text.toString().isBlank()) {
            editText.error = errorMessage
            editText.requestFocus()
            false
        } else {
            editText.error = null
            true
        }
    }

    fun isGivenPhoneNoHasInput(editText: EditText, errorMessage: String): Boolean {
        return if (editText.text.toString().isBlank()) {
            editText.error = errorMessage
            editText.requestFocus()
            false
        } else phoneNoRange(editText.length()) && isValidPhoneNo(editText.text.toString())
    }

    private fun phoneNoRange(length: Int): Boolean {
        return (length >= 9) && (length <= 13)
    }

    private fun isValidPhoneNo(phoneNumber: String): Boolean {
        when {
            phoneNumber.substring(0, 3) == "092" -> {
                return true
            }
            phoneNumber.substring(0, 3) == "093" -> {
                return true
            }
            phoneNumber.substring(0, 3) == "094" -> {
                return true
            }
            phoneNumber.substring(0, 3) == "095" -> {
                return true
            }
            phoneNumber.substring(0, 3) == "096" -> {
                return true
            }
            phoneNumber.substring(0, 3) == "097" -> {
                return true
            }
            phoneNumber.substring(0, 3) == "098" -> {
                return true
            }
            phoneNumber.substring(0, 3) == "099" -> {
                return true
            }
            else -> return false
        }
    }
}