package com.example.runthrhan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn=findViewById<Button>(R.id.button1)
        btn.setOnClickListener {
          //  Thread.sleep(5000)
            var x= Runnable{
                    Thread.sleep(5000)

                var hand=Handler(Looper.getMainLooper())
                hand.post(Runnable { Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show() })

                }
            var thread=Thread(x)
            thread.start()
        }

    }
}