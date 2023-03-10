package com.example.checkedtextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckedTextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val CheckedTextView = findViewById<CheckedTextView>(R.id.checkedTextView)
        if (CheckedTextView!=null){
            CheckedTextView.isChecked = false
            CheckedTextView.setCheckMarkDrawable(android.R.drawable.checkbox_off_background)

            CheckedTextView.setOnClickListener{
                CheckedTextView.isChecked = !CheckedTextView.isChecked
                CheckedTextView.setCheckMarkDrawable(
                    if (CheckedTextView.isChecked)
                        android.R.drawable.checkbox_on_background
                    else
                        android.R.drawable.checkbox_off_background
                )

                val message = getString(R.string.msg_shown)+ " " +getString(
                    if (CheckedTextView.isChecked) R.string.checked
                    else R.string.unchecked
                )
                Toast.makeText(this@MainActivity , message , Toast.LENGTH_SHORT).show()
            }
        }

    }
}