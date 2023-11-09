package com.example.navigationdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.navigationdemo.navigation.DynamicModule
import com.example.navigationdemo.navigation.goActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            goActivity(DynamicModule.A)
            finish()
        }
    }
}