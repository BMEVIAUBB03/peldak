package hu.bme.aut.android.intentdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hu.bme.aut.android.intentdemo.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener{

            var resultIntent = Intent()
            resultIntent.putExtra(
                "answer", 1)
            setResult(RESULT_OK, resultIntent)
            finish()

        }

        binding.button2.setOnClickListener{

            var resultIntent = Intent()
            resultIntent.putExtra(
                "answer", 2)
            setResult(RESULT_OK, resultIntent)
            finish()

        }

    }
}