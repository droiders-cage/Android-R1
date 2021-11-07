package com.ericg.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ericg.intent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding :ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding!!.root)

        binding!!.btnShare.setOnClickListener {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "This is my text to send.")
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, "Share with?")
            startActivity(shareIntent)

        }

         binding!!.btnNext.setOnClickListener {
             val nextActivity = Intent(this,ContactsActivity::class.java )
             startActivity(nextActivity)
         }
    }
}