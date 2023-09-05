package com.example.safety

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val bottomBar = findViewById<BottomNavigationView>(R.id.bottom_bar)

        bottomBar.setOnItemSelectedListener {

            if (it.itemId == R.id.nav_guard) {
                infalteFragment()
            } else if (it.itemId == R.id.nav_home) {
                infalteHomeFragment()
            } else if (it.itemId == R.id.nav_safety) {
                inflateSafetyFragment()
            } else if (it.itemId == R.id.nav_profile) {
                inflateContactFragment()
            }

            true
        }

    }

    private fun inflateContactFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, ProfileFragment.newInstance())
        transaction.commit()
    }

    private fun inflateSafetyFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, DashboardFragment.newInstance())
        transaction.commit()
    }

    private fun infalteHomeFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, HomeFragment.newInstance())
        transaction.commit()
    }

    private fun infalteFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, GuardFragment.newInstance())
        transaction.commit()
    }


}