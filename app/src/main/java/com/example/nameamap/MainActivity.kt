package com.example.nameamap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.nameamap.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val activityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val openMapBtn: Button = findViewById(R.id.openMapBtn)

        openMapBtn.setOnClickListener{
            val Intent = Intent(this,MainActivity2::class.java )
            startActivity(Intent)
        }

        activityMainBinding.textInput.isCounterEnabled

    }


}