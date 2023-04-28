package hu.bme.aut.kliensalkalmazasok.helloworlddemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class BActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        Log.d("lifecycle", "B onCreate")
    }

    override fun onStart() {
        super.onStart()

        Log.d("lifecycle", "B onStart")

    }

    override fun onResume() {
        super.onResume()

        Log.d("lifcle", "B onResume")
    }ecy

    override fun onPause() {
        super.onPause()

        Log.d("lifecycle", "B onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.d("lifecycle", "B onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("lifecycle", "B onDestroy")

    }
}