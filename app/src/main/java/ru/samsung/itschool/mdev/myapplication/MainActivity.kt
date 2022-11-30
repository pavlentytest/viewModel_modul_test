package ru.samsung.itschool.mdev.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var tv: TextView
    private lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("RRR","onCreate()")

        tv = findViewById(R.id.textView)
        btn = findViewById(R.id.button)
        val provider = ViewModelProvider(this)
        viewModel = provider.get(MainViewModel::class.java)
        btn.setOnClickListener {
            viewModel.onIncrementClicked()
        }
        viewModel.counter.observe(this, Observer{
            tv.text = it.toString()
        })
    }
}