package com.pupup.optionmenu

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
val toolbar=findViewById<androidx.appcompat.widget.Toolbar>(R.id.tool_bar)
    setSupportActionBar(toolbar)


    }

        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.optoin_menu_item,menu)
            return super.onCreateOptionsMenu(menu)
        }

        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            when (item.itemId){
                R.id.about -> Toast.makeText(this,"About Selected",Toast.LENGTH_SHORT).show()
                R.id.settings -> Toast.makeText(this,"Settings Selected",Toast.LENGTH_SHORT).show()
                R.id.exit -> Toast.makeText(this,"Exit Selected",Toast.LENGTH_SHORT).show()
            }
            return super.onOptionsItemSelected(item)

    }
}