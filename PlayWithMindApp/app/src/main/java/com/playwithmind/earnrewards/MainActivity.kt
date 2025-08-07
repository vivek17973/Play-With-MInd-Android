package com.playwithmind.earnrewards

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var tvWallet: TextView
    private lateinit var btnStart: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvWallet = findViewById(R.id.tvWallet)
        btnStart = findViewById(R.id.btnStartGame)

        val user = FirebaseAuth.getInstance().currentUser
        if (user != null) {
            tvWallet.text = "Wallet: ₹0.00"
        } else {
            tvWallet.text = "Not logged in"
        }

        btnStart.setOnClickListener {
            // placeholder
        }
    }
}
