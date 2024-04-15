package hu.bme.aut.android.activitylifecycledemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import hu.bme.aut.android.activitylifecycledemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    DetailsActivity::class.java
                )
            )
        }

        Log.d("TAG_LIFE", "Main onCreate called")
    }


    override fun onStart() {
        super.onStart()
        Log.d("TAG_LIFE", "Main onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG_LIFE", "Main onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG_LIFE", "Main onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG_LIFE", "Main onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG_LIFE", "Main onDestroy called")
    }

}