package com.winechitpaing.sampleviewpod.personalData

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import com.winechitpaing.sampleviewpod.R
import org.koin.android.viewmodel.ext.android.viewModel

class PersonalDataActivity : AppCompatActivity() {

    private val viewModel by viewModel<PersonalDataViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.navigationController = Navigation.findNavController(this, R.id.my_nav_host_fragment)
    }
}