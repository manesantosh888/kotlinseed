package com.example.kotlinseed.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.kotlinseed.R
import com.example.kotlinseed.ui.composables.CardLayout

@Composable
fun LayoutDesign() {
    val painter = painterResource(R.drawable.colors)
    val description = "Kermit is plying in the snow"
    val title = "Kermit is playing in the snow"
    Box (modifier = Modifier.fillMaxWidth(0.5f)){
        CardLayout(painter, description, title)
    }
}