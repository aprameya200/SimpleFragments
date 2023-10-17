package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.getFragment1.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(
                    R.id.ma,
                    MyFragment()
                ) //using the onCreateView() of the fragment class it adds it t the designated view in main layout
                .commit()
        }

        binding.getFragment2.setOnClickListener {
            supportFragmentManager.beginTransaction().add(R.id.ma, MyOtherFragment()).commit()
        }


    }
}