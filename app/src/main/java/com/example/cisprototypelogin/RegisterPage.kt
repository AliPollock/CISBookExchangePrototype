package com.example.cisprototypelogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RegisterPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_page)
    }

    fun login(view: View) {
        val loginPage = Intent(this,MainActivity::class.java)
        startActivity(loginPage)
        finish()
    }

    fun register(view: View) {
        val homePage = Intent(this, HomePage::class.java)
        startActivity(homePage)
        finish()
    }
}