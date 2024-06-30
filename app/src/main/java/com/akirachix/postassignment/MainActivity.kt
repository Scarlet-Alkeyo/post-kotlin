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
//
        val  article= Post("Jane Juma","","Science","1 June 2024","Science is interesting...","","Read more")
        val  article2= Post("Agnes Wambui","","Technology","24 June 2024","Tech increase innovation ...","","Read more")
        val  article3= Post("Alice Wahome","","Plants","24 June 2024","Plants provide food...","","Read more")
        val  article4= Post("James Gitau","","Religion","24 June 2024","Religion makes us close to God ...","","Read more")
        val  article5= Post("Scarlet Alkeyo","","Education","24 June 2024","Education is the best thing ...","","Read more")
        val  article6= Post("Wilson Mundia","","Accounting","2 June 2024","Mathematics is needed in accounting ...","","Read more")
        val  article7= Post("Alice  Auma","","Bussiness","1 June 2024","Work in your bussiness ...","","Read more")
        val  article8= Post("Ann Alkeyo","","Health","23 June 2024","Good health is the best thing ...","","Read more")


         var   articleList= listOf(article,article2,article3,article4,article5,article5,article6,article7,article8)
        val  PostAdapter =PostAdapter(articleList)
        binding.rvPost.adapter = PostAdapter





//

    }
}