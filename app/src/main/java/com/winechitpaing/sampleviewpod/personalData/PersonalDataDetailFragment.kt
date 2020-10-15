package com.winechitpaing.sampleviewpod.personalData

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.winechitpaing.sampleviewpod.R
import com.winechitpaing.sampleviewpod.databinding.FragmentPersonalDataDetailBinding
import com.winechitpaing.sampleviewpod.viewpods.PersonalDataDetailViewPod
import org.koin.android.viewmodel.ext.android.sharedViewModel

class PersonalDataDetailFragment : Fragment() {

    private val viewModel by sharedViewModel<PersonalDataViewModel>()
    private lateinit var binding: FragmentPersonalDataDetailBinding


    private val viewPodPersonalDataDetailOne by lazy {
        PersonalDataDetailViewPod.newInstance(
            binding.vpPersonalDataViewOne.root
        )
    }

    private val viewPodPersonalDataDetailTwo by lazy {
        PersonalDataDetailViewPod.newInstance(
            binding.vpPersonalDataViewTwo.root
        )
    }

    private val viewPodPersonalDataDetailThree by lazy {
        PersonalDataDetailViewPod.newInstance(
            binding.vpPersonalDataViewThree.root
        )
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPersonalDataDetailBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initUI()
        initUIListener()
    }


    private fun initUI() {
        viewPodPersonalDataDetailOne.bindData(
            viewModel.nameOne,
            viewModel.phoneOne,
            viewModel.addressOne
        )

        viewPodPersonalDataDetailTwo.bindData(
            viewModel.nameTwo,
            viewModel.phoneTwo,
            viewModel.addressTwo
        )

        viewPodPersonalDataDetailThree.bindData(
            viewModel.nameThree,
            viewModel.phoneThree,
            viewModel.addressThree
        )
    }

    private fun initUIListener() {
        binding.btnBack.setOnClickListener {
            findNavController().navigate(R.id.action_personal_data_detail_fragment_to_personal_data_form_fragment)
        }
    }

}
