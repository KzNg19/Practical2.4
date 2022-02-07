package com.example.practical24

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.practical24.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val s = Student("W123","Kz")

        binding.myData = s
        //binding.tvId.text = s.studentID

        binding.btnUpdate.setOnClickListener(){
            s.studentName="asdf"

            binding.apply {
                invalidateAll()
            }
        }
    }
}