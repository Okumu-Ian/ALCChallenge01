package com.eeyan.alcchallenge01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.webkit.WebSettings



class AboutAlc : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_alc)
        initUI()
    }

    private fun initUI(){
        supportActionBar?.title = "About ALC"
        val myWebView: WebView = findViewById(R.id.about_alc_webview)
        myWebView.webViewClient = WebViewClient()
        val webSettings = myWebView.settings
        webSettings.allowFileAccess = true
        myWebView.loadUrl("https://andela.com/alc/")
    }
}
