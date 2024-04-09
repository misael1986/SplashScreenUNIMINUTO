package com.example.splashscreenuniminuto

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen //ADICIONAR DEPENDENCIA

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val splashScreen = installSplashScreen()// METODO PARA CARGAR LOS SPLASH

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        splashScreen.setKeepOnScreenCondition{ true }

        Thread.sleep(2000)
        val intent = Intent(this, NuevaActivity::class.java)
        startActivity(intent)
        finish()

        }

}