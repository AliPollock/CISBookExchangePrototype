package com.example.cisprototypelogin

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.cisprototypelogin.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

        lateinit var username: String
        lateinit var password: String

    fun login(view: View) {


        username = findViewById<TextInputEditText>(R.id.editUsername).text.toString()


        password = findViewById<TextInputEditText>(R.id.editPassword).text.toString()

        binding.editUsername.addTextChangedListener(object: TextWatcher {

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                s!!
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                s!!
            }

            override fun afterTextChanged(s: Editable?) {
                username = s.toString()!!
            }
        })

        binding.editPassword.addTextChangedListener(object: TextWatcher {

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                s!!
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                s!!
            }

            override fun afterTextChanged(s: Editable?) {
                password = s.toString()!!
            }
        })

        val dataBaseUsername: String = "alipollock"
        val dataBasePassword: String = "password"

        binding.loginButton.setOnClickListener {
            if(binding.editPassword.toString().isEmpty()) {
            } else {

                if(username == dataBaseUsername && password == dataBasePassword){
                    val homePage = Intent(this, HomePage::class.java)
                    startActivity(homePage)
                    finish()

                } else {
                    Toast.makeText(
                        this,
                        "Details Username: $username and password: $password are not recognised",
                        Toast.LENGTH_LONG
                    ).show()

                }


            }
        }
    }

    fun register(view: View) {
        val registerPage = Intent(this, RegisterPage::class.java)
        startActivity(registerPage)
        finish()

    }
}