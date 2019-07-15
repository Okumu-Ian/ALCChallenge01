package com.eeyan.alcchallenge01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUI()
    }

    private fun initUI(){

        supportActionBar?.title = "ALC 4 Phase 1"
        val profileButton: AppCompatButton = findViewById(R.id.btn_my_profile)
        val webViewButton: AppCompatButton = findViewById(R.id.btn_about_alc)

        profileButton.setOnClickListener {
            openProfile()
        }

        webViewButton.setOnClickListener {
            openWebView()
        }

    }

    private fun openProfile(){
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
    }

    private fun openWebView(){
        val intent = Intent(this,AboutAlc::class.java)
        startActivity(intent)
    }
}
