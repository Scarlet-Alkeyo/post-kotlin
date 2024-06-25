package com.akirachix.postassignment

import android.app.Activity
import android.icu.text.IDNA.Info
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.postassignment.databinding.ActivityMainBinding

//class MainActivity : AppCompatActivity() {
//
//    private latent  var
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//    }
//}

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvPost.layoutManager = LinearLayoutManager(this)
        displayInfo()
    }
    fun displayInfo(){
//        val  contact1 =Contact("Abram","0786752345","@abram.com","")
        val Info1=Info()






//        val contactList = listOf(Info1,contact2,contact3,contact4,contact5,contact6,contact7,contact8)
//        val contactAdapter= ContactAdapter(contactList)
//        binding.rvContacts.adapter=contactAdapter

    }
}