package com.example.getitemcountnpe

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, ListFragment())
                .commit()
        }
    }

    fun viewDetail(position: Int) {
        supportFragmentManager.beginTransaction()
            .setCustomAnimations(
                R.anim.frag_enter_right,
                R.anim.frag_exit_left,
                R.anim.frag_enter_left,
                R.anim.frag_exit_right
            )
            .replace(R.id.fragment_container, DetailFragment.newInstance(position))
            .addToBackStack(null)
            .commit()
    }

}
