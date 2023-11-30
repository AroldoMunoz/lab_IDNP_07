package com.example.labfragmen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity(),OneFragmentAction {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClickFragmentButton() {
        Toast.makeText(this,"boton pulsado",Toast.LENGTH_SHORT).show()
    }
}