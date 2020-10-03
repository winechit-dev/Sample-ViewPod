package com.winechitpaing.sampleviewpod

import com.winechitpaing.sampleviewpod.personalData.PersonalDataViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val personalDataModule = module {
    viewModel {
        PersonalDataViewModel()
    }
}