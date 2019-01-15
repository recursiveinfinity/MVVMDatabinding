package com.example.mvvm_databinding

import android.databinding.DataBindingUtil
import android.databinding.ObservableField
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.mvvm_databinding.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val profileDataBinding: ActivityProfileBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_profile)

        val profile = Profile("Tom", "Male", "35", "London")

        profileDataBinding.profile = profile
    }
}