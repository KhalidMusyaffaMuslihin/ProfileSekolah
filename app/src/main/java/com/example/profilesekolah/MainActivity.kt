package com.example.profilesekolah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val host: NavHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragment) as NavHostFragment? ?: return
        val navControler = host.navController
        bottom_nav. setupWithNavController(navControler)
    }
}