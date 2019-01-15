package com.example.mvvm_databinding

import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mvvm_databinding.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityMainBinding: ActivityMainBinding = DataBindingUtil
            .setContentView(this, R.layout.activity_main)

        /*val calculatorViewModel = ViewModelProviders.of(this)
            .get(CalculatorViewModel::class.java)*/
        val calculatorViewModel = CalculatorViewModel()

        activityMainBinding.result = calculatorViewModel.resultObservable

        btnAdd.setOnClickListener { calculatorViewModel.add(etNumberOne.text.toString(),
            etNumberTwo.text.toString()) }

        btnSubtract.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}
