package com.winechitpaing.sampleviewpod.personalData

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.winechitpaing.sampleviewpod.R
import com.winechitpaing.sampleviewpod.viewpods.PersonalDataFormFillViewPod
import kotlinx.android.synthetic.main.fragment_personal_data_form_fill.*
import org.koin.android.viewmodel.ext.android.sharedViewModel

class PersonalDataFormFillFragment : Fragment() {

    private val viewModel by sharedViewModel<PersonalDataViewModel>()

    private val viewPodPersonalDataFormOne by lazy { PersonalDataFormFillViewPod.newInstance(vpPersonalDataFormOne) }

    private val viewPodPersonalDataFormTwo by lazy { PersonalDataFormFillViewPod.newInstance(vpPersonalDataFormTwo) }

    private val viewPodPersonalDataFormThree by lazy { PersonalDataFormFillViewPod.newInstance(vpPersonalDataFormThree) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_personal_data_form_fill, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initUI()
        initUIListener()
    }

    private fun initUI() {
        if(viewModel.validateInput()){
            viewPodPersonalDataFormOne.bindData(viewModel.nameOne, viewModel.phoneOne , viewModel.addressOne)
            viewPodPersonalDataFormTwo.bindData(viewModel.nameTwo, viewModel.phoneTwo , viewModel.addressTwo)
            viewPodPersonalDataFormThree.bindData(viewModel.nameThree, viewModel.phoneThree , viewModel.addressThree)
        }
    }

    private fun initUIListener() {
        btnOk.setOnClickListener {

            if(viewPodPersonalDataFormOne.validateInput() && viewPodPersonalDataFormTwo.validateInput() && viewPodPersonalDataFormThree.validateInput()){

                viewModel.nameOne = viewPodPersonalDataFormOne.getName()!!
                viewModel.phoneOne = viewPodPersonalDataFormOne.getPhone()!!
                viewModel.addressOne = viewPodPersonalDataFormOne.getAddress()!!

                viewModel.nameTwo = viewPodPersonalDataFormTwo.getName()!!
                viewModel.phoneTwo = viewPodPersonalDataFormTwo.getPhone()!!
                viewModel.addressTwo = viewPodPersonalDataFormTwo.getAddress()!!

                viewModel.nameThree = viewPodPersonalDataFormThree.getName()!!
                viewModel.phoneThree = viewPodPersonalDataFormThree.getPhone()!!
                viewModel.addressThree = viewPodPersonalDataFormThree.getAddress()!!

                viewModel.navigationController?.navigate(R.id.action_personal_data_form_fragment_to_personal_data_detail_fragment)
            }

        }
    }
}