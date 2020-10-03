package com.winechitpaing.sampleviewpod.personalData

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.winechitpaing.sampleviewpod.R
import com.winechitpaing.sampleviewpod.viewpods.PersonalDataDetailViewPod
import kotlinx.android.synthetic.main.fragment_personal_data_detail.*
import org.koin.android.viewmodel.ext.android.sharedViewModel

class PersonalDataDetailFragment : Fragment() {

    private val viewModel by sharedViewModel<PersonalDataViewModel>()

    private val viewPodPersonalDataDetailOne by lazy { PersonalDataDetailViewPod.newInstance(vpPersonalDataViewOne) }

    private val viewPodPersonalDataDetailTwo by lazy { PersonalDataDetailViewPod.newInstance(vpPersonalDataViewTwo) }

    private val viewPodPersonalDataDetailThree by lazy { PersonalDataDetailViewPod.newInstance(vpPersonalDataViewThree) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_personal_data_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initUI()
        initUIListener()
    }


    private fun initUI() {
        viewPodPersonalDataDetailOne.bindData(viewModel.nameOne , viewModel.phoneOne , viewModel.addressOne)

        viewPodPersonalDataDetailTwo.bindData(viewModel.nameTwo , viewModel.phoneTwo , viewModel.addressTwo)

        viewPodPersonalDataDetailThree.bindData(viewModel.nameThree , viewModel.phoneThree , viewModel.addressThree)
    }

    private fun initUIListener() {
        btnBack.setOnClickListener {
            viewModel.navigationController?.navigate(R.id.action_personal_data_detail_fragment_to_personal_data_form_fragment)
        }
    }

}