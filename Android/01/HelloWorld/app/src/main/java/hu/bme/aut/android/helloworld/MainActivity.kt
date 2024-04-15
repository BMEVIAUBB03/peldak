package hu.bme.aut.android.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hu.bme.aut.android.helloworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myButton.setOnClickListener {
            binding.myTextView.append("\n--CLICKED--")
        }
    }
}