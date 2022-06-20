package com.stockbit.hiring.page

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.feature_login.R
import com.stockbit.common.base.BaseFragment
import com.stockbit.common.base.BaseViewModel

class FLogin : BaseFragment() {
    override fun getViewModel(): BaseViewModel = LoginViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.f_login, container, false)
    }

    companion object {}
}