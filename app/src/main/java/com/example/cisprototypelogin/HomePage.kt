package com.example.cisprototypelogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
    }

    fun logout(view: View) {
        val loginPage = Intent(this,MainActivity::class.java)
        startActivity(loginPage)
        finish()
    }
}