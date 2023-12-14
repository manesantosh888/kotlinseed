package com.example.kotlinseed.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun DetailScreen(name: String?) {
    Box(
        contentAlignment = Alignment.Center, modifier = Modifier.fillMaxHeight()
    ) {
        Text(text = "Hello, $name")
    }
}