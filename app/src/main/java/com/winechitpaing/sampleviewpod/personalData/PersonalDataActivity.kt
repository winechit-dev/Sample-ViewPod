package com.winechitpaing.sampleviewpod.personalData

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import com.winechitpaing.sampleviewpod.R
import com.winechitpaing.sampleviewpod.databinding.ActivityMainBinding
import org.koin.android.viewmodel.ext.android.viewModel

class PersonalDataActivity : AppCompatActivity() {

    private val viewModel by viewModel<PersonalDataViewModel>()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
