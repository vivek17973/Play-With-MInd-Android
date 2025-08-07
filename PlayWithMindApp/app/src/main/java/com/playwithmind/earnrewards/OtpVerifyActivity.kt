package com.playwithmind.earnrewards

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.PhoneAuthProvider

class OtpVerifyActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var verificationId: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp_verify)

        auth = FirebaseAuth.getInstance()
        verificationId = intent.getStringExtra("verificationId")!!

        val otpInput = findViewById<EditText>(R.id.etOtp)
        val verifyBtn = findViewById<Button>(R.id.btnVerify)

        verifyBtn.setOnClickListener {
            val otp = otpInput.text.toString()
            val credential = PhoneAuthProvider.getCredential(verificationId, otp)
            signInWithCredential(credential)
        }
    }

    private fun signInWithCredential(credential: com.google.firebase.auth.PhoneAuthCredential) {
        auth.signInWithCredential(credential)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                } else {
                    Toast.makeText(this, "OTP verification failed", Toast.LENGTH_SHORT).show()
                }
            }
    }
}
