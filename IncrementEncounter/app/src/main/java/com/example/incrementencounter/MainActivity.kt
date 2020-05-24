package com.example.incrementencounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        incrementButton.setOnClickListener(){
            if (numberEditText.text.toString().isEmpty()){
                Toast.makeText(applicationContext,"Can't Leave Number Empty",Toast.LENGTH_SHORT).show()
            }else{
                val incrementer = numberEditText.text.toString().toInt()
                val initialNumber = numberText.text.toString().toInt()
                val answer = initialNumber + incrementer
                numberText.text = answer.toString()
            }


        }

        decrementButton.setOnClickListener(){
            if (numberEditText.text.toString().isEmpty()){
                Toast.makeText(applicationContext,"Can't Leave Number Empty",Toast.LENGTH_SHORT).show()
            }else {
                val decrementor = numberEditText.text.toString().toInt()
                val initialNumber = numberText.text.toString().toInt()
                val answer = initialNumber - decrementor
                numberText.text = answer.toString()
            }
        }

    }

}
