package com.jctech2024.githubtest.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jctech2024.githubtest.R
import com.jctech2024.githubtest.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView( binding.root )
    }
}