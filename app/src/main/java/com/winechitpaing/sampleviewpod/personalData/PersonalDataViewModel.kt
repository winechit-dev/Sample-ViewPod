package com.winechitpaing.sampleviewpod.personalData

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController

class PersonalDataViewModel : ViewModel() {

    var navigationController: NavController? = null

    var nameOne: String = ""
    var phoneOne: String = ""
    var addressOne: String = ""

    var nameTwo: String = ""
    var phoneTwo: String = ""
    var addressTwo: String = ""

    var nameThree: String = ""
    var phoneThree: String = ""
    var addressThree: String = ""

    fun validateInput(): Boolean =
        !nameOne.isBlank() && !phoneOne.isBlank() && !addressOne.isBlank()
                && !nameTwo.isBlank() && !phoneTwo.isBlank() && !addressTwo.isBlank()
                && !nameThree.isBlank() && !phoneThree.isBlank() && !addressThree.isBlank()
}