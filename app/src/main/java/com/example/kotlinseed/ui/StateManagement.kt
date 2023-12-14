package com.example.kotlinseed.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlin.random.Random


//  In this screen we achieved the state management.
@Composable
fun StateManagement() {
    val color = remember {
        mutableStateOf(Color.Yellow)
    }
    Column {
        ColorBox(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            color.value = it
        }
        Box(
            modifier = Modifier
                .background(color = color.value)
                .fillMaxSize()
                .weight(1f)
        )
    }
}

@Composable
fun ColorBox(
    modifier: Modifier = Modifier,
    updateColor: (Color) -> Unit
) {
    Box(
        modifier = modifier
            .background(color = Color.Red)
            .clickable {
                updateColor(
                    Color(
                        Random.nextFloat(),
                        Random.nextFloat(),
                        Random.nextFloat(),
                    )
                )
            }
    )
}