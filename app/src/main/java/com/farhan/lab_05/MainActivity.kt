    package com.farhan.lab_05

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.farhan.lab_05.databinding.ActivityMainBinding

    class MainActivity : AppCompatActivity() {

    //ActivityMain => Reverse of our Activity name (MainActivity)
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)

        binding.button.setOnClickListener{
            var pizzaSizePrice = 0.0 //typedouble
            var toppingsPrice = 0.0 //type double (implicit typing)

            when {
                //isCheck is the property to see if an item is selected
                binding.smallRadioButton.isChecked -> pizzaSizePrice = 5.0
                binding.mediumRadioButton.isChecked -> pizzaSizePrice = 7.0
                binding.largeRadioButton.isChecked -> pizzaSizePrice = 9.0
            }

            //Multiple toppings can be selected, if, (not if else if)
            if (binding.OnionsBox.isChecked) {
                toppingsPrice += 1.0
            }
            if (binding.TomatoesBox.isChecked) {
                toppingsPrice += 1.0
            }
            if (binding.OlivesBox.isChecked) {
                toppingsPrice += 2.0
            }

            binding.totalprice.text = "Total price is RM ${pizzaSizePrice+toppingsPrice}"

        }
    }
}