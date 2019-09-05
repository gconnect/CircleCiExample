package com.glory.learningcirleci

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.glory.learningcirleci.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    var firstNumber : Int = 5
    var secondNumber : Int = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            binding  = DataBindingUtil.
            setContentView(this, R.layout.activity_main)
            addition()
    }

    fun addition(){
        var answer: Int = firstNumber + secondNumber
        binding.result.setText("Say Hello CircleCi the value is ${answer}")
    }
}
