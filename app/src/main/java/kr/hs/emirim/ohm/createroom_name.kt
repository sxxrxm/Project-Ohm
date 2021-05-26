package kr.hs.emirim.ohm

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_createmeeting1.*

class createroom_name : AppCompatActivity(){

    lateinit var room_name: String
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_createmeeting1)

            room_name = findViewById<EditText>(R.id.room_name).text.toString()

            next_button1.setOnClickListener {
                Toast.makeText(this, room_name, Toast.LENGTH_SHORT).show()
                val intent = Intent(this, createroom_topic::class.java)
                startActivity(intent)
            }
          }
}