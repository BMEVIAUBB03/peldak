package hu.bme.aut.kliensalkalmazasok.helloworlddemo

import android.app.SearchManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import hu.bme.aut.kliensalkalmazasok.helloworlddemo.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonTime.setOnClickListener {
            var simpleDateFormat = SimpleDateFormat("yyyy. MM. dd. HH:mm:ss")
            binding.tvTime.text = simpleDateFormat.format(Date())
        }

        binding.buttonStart.setOnClickListener {
            val intent = Intent(MainActivity@this,BActivity::class.java)

            startActivity(intent)
        }

        binding.buttonSearch.setOnClickListener {
            val searchIntent = Intent()
            searchIntent.action = Intent.ACTION_WEB_SEARCH
            searchIntent.putExtra(SearchManager.QUERY,"android studio")

            startActivity(searchIntent)
        }

        Log.d("lifecycle","A onCreate")
    }

    override fun onStart() {
        super.onStart()

        Log.d("lifecycle","A onStart")

    }

    override fun onResume() {
        super.onResume()

        Log.d("lifecycle","A onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.d("lifecycle","A onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.d("lifecycle","A onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("lifecycle","A onDestroy")

    }

}