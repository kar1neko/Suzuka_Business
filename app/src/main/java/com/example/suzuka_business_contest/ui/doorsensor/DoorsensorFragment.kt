package com.example.suzuka_business_contest.ui.doorsensor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.suzuka_business_contest.R

class DoorsensorFragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_doorsensor_detail)

        supportFragmentManager.beginTransaction()
            .replace(R.id.text_doorsensor_detail, DoorsensorFragment())
            .commit()

    }
}