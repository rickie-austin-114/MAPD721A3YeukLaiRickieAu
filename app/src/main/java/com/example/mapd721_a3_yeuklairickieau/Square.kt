package com.example.mapd721_a3_yeuklairickieau

import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color

@Composable
fun Square(modifier: Modifier) {
    Canvas(modifier = modifier) {
        val squareSize = 200f // Fixed size of the square (100x100)
        drawRect(
            color = Color.Blue,
            topLeft = Offset(size.width / 2 - squareSize / 2, size.height / 2 - squareSize / 2),
            size = Size(squareSize, squareSize)
        )
    }
}