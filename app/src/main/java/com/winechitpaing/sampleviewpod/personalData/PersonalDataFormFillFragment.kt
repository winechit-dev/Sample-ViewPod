package com.winechitpaing.sampleviewpod.personalData

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.winechitpaing.sampleviewpod.R
import com.winechitpaing.sampleviewpod.databinding.FragmentPersonalDataFormFillBinding
import com.winechitpaing.sampleviewpod.viewpods.PersonalDataFormFillViewPod
import org.koin.android.viewmodel.ext.android.sharedViewModel

class PersonalDataFormFillFragment : Fragment() {

    private val viewModel by sharedViewModel<PersonalDataViewModel>()
    private lateinit var binding: FragmentPersonalDataFormFillBinding

    private val viewPodPersonalDataFormOne by lazy {
        PersonalDataFormFillViewPod.newInstance(
            binding.vpPersonalDataFormThree.root
        )
    }

    private val viewPodPersonalDataFormTwo by lazy {
        PersonalDataFormFillViewPod.newInstance(
            binding.vpPersonalDataFormTwo.root
        )
    }

    private val viewPodPersonalDataFormThree by lazy {
        PersonalDataFormFillViewPod.newInstance(
            binding.vpPersonalDataFormThree.root
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPersonalDataFormFillBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initUI()
        initUIListener()
    }

    private fun initUI() {
        if (viewModel.validateInput()) {
            viewPodPersonalDataFormOne.bindData(
                viewModel.nameOne,
                viewModel.phoneOne,
                viewModel.addressOne
            )
            viewPodPersonalDataFormTwo.bindData(
                viewModel.nameTwo,
                viewModel.phoneTwo,
                viewModel.addressTwo
            )
            viewPodPersonalDataFormThree.bindData(
                viewModel.nameThree,
                viewModel.phoneThree,
                viewModel.addressThree
            )
        }
    }

    private fun initUIListener() {
        binding.btnOk.setOnClickListener {

            if (viewPodPersonalDataFormOne.validateInput() && viewPodPersonalDataFormTwo.validateInput() && viewPodPersonalDataFormThree.validateInput()) {

                viewModel.nameOne = viewPodPersonalDataFormOne.getName()!!
                viewModel.phoneOne = viewPodPersonalDataFormOne.getPhone()!!
                viewModel.addressOne = viewPodPersonalDataFormOne.getAddress()!!

                viewModel.nameTwo = viewPodPersonalDataFormTwo.getName()!!
                viewModel.phoneTwo = viewPodPersonalDataFormTwo.getPhone()!!
                viewModel.addressTwo = viewPodPersonalDataFormTwo.getAddress()!!

                viewModel.nameThree = viewPodPersonalDataFormThree.getName()!!
                viewModel.phoneThree = viewPodPersonalDataFormThree.getPhone()!!
                viewModel.addressThree = viewPodPersonalDataFormThree.getAddress()!!

                findNavController().navigate(R.id.action_personal_data_form_fragment_to_personal_data_detail_fragment)
            }

        }
    }
}
