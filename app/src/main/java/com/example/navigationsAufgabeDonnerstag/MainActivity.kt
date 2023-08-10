package com.example.navigationsAufgabeDonnerstag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.navigationdemo.R
import com.example.navigationdemo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navHostFragmentFCV) as NavHostFragment
        val navController = navHostFragment.navController

        binding.bottomNavBNV.setupWithNavController(navController)

            // wenn item in der navbar ausgewählt wird

        binding.bottomNavBNV.setOnItemSelectedListener { item ->
            //hier kann man funktionen einbauen
            //Standard navbar funktion:Navigiere zum ausgewählten item
            //vorherige navigation bleibt gespeichert
            NavigationUI.onNavDestinationSelected(item, navController)
            //reselectlistener löscht den verlauf der fragmente(weiterbutton) backstack zurücksetzen
            navController.popBackStack(item.itemId, false)
            return@setOnItemSelectedListener true
        }

        Toast.makeText(this, "Du bist jetzt online", Toast.LENGTH_LONG).show()


    }
}