package hu.bme.aut.android.activitylifecycledemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import hu.bme.aut.android.activitylifecycledemo.databinding.ActivityDetailsBinding
import hu.bme.aut.android.activitylifecycledemo.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            startActivity(
                Intent(
                    this@DetailsActivity,
                    MainActivity::class.java
                )
            )
        }

        Log.d("TAG_LIFE", "Details onCreate called")
    }


    override fun onStart() {
        super.onStart()
        Log.d("TAG_LIFE", "Details onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG_LIFE", "Details onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG_LIFE", "Details onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG_LIFE", "Details onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG_LIFE", "Details onDestroy called")
    }

}