package com.thaa.viewmodeltest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var button2: Button
    private lateinit var textView: TextView
    private lateinit var viewModel: ClassViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(ClassViewModel::class.java)

        button = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)
        textView = findViewById(R.id.txt_num)

        result()

        button.setOnClickListener {
            viewModel.tambahAngka()
            result()
        }

        button2.setOnClickListener {
            viewModel.kurangAngka()
            result()
        }
    }

    fun result() {
        textView.text = viewModel.angka.toString()
    }
}