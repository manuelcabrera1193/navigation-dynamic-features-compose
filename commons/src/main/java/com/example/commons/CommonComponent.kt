package com.example.commons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview(showSystemUi = true)
fun CommonComponent(name: String = "Dynamic Feature", event: () -> Unit = {}) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.padding(16.dp))
        Text(
            text = "This is module: $name",
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )
        Spacer(modifier = Modifier.padding(32.dp))
        Button(
            onClick = event,
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary),
            contentPadding = PaddingValues(16.dp),
            modifier = Modifier.clip(MaterialTheme.shapes.medium)
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Continuar", color = Color.White)
                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = null,
                    tint = Color.White
                )
            }
        }
    }
}