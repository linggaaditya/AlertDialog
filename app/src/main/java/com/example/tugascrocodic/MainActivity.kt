package com.example.tugascrocodic

import android.app.AlertDialog
import android.app.Dialog
import android.app.ProgressDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    public fun Dialog(view: View) {
        AlertDialog.Builder(this)
            .setTitle("Login")
            .setMessage("Apakah Anda Yakin Akan Login?")
            .setPositiveButton("YA", DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this, "Anda Memlih YA", Toast.LENGTH_LONG).show()
            })

            .setNegativeButton("NO", DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this, "Anda Memilih Tidak", Toast.LENGTH_LONG).show()
            })
            .show()
    }
}
