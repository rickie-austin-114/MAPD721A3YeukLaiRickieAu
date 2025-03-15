package com.example.mapd721_a3_yeuklairickieau

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mapd721_a3_yeuklairickieau.ui.theme.MAPD721A3YeukLaiRickieAuTheme

@Composable
fun Screen4() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        GestureAndAnimationSimple.Gesture()
    }
}


@Preview(showBackground = true)
@Composable
fun Screen4Preview() {
    MAPD721A3YeukLaiRickieAuTheme {
        Screen4()
    }
}
