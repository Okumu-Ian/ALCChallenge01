package com.eeyan.alcchallenge01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        initUI()
    }

    private fun initUI(){
        supportActionBar?.title = "My Profile"
    }

}
