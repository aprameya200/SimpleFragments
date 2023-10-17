package com.example.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragments.R

class MyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment, container, false) //inflates the view with fragment

        // Find and manipulate UI elements
        val textView = rootView.findViewById<TextView>(R.id.textView)
        textView.text = "Hello"

        return rootView
    }
}
