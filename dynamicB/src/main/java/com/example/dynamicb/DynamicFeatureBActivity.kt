package com.example.dynamicb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.commons.CommonComponent
import com.example.dynamicb.ui.theme.NavigationDemoTheme
import com.example.navigationdemo.navigation.DynamicModule
import com.example.navigationdemo.navigation.goActivity

class DynamicFeatureBActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationDemoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CommonComponent("Dynamic Feature B") {
                        goActivity(DynamicModule.C)
                    }
                }
            }
        }
    }
}