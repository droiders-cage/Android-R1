package com.ericg.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ericg.intent.databinding.ActivityContactsBinding

class ContactsActivity : AppCompatActivity() {
    var binding: ActivityContactsBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactsBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        val myAdapter = MyAdapter()
        binding!!.recyclerView.apply {
            adapter = myAdapter
        }
    }
}