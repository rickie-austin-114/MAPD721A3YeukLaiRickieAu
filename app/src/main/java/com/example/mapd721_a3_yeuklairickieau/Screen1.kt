package com.example.mapd721_a3_yeuklairickieau

import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.mapd721_a3_yeuklairickieau.ui.theme.MAPD721A3YeukLaiRickieAuTheme

@Composable
fun Screen1() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        var count by remember { mutableIntStateOf(0) }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        )
        {
            AnimatedContent(
                targetState = count,
                label = "animated content"
            ) { targetCount ->
                // Make sure to use `targetCount`, not `count`.
                Text(text = "Count: $targetCount")
            }

            Row {
                Button(onClick = { count++ }) {
                    Text("Add")
                }
                Button(onClick = { count-- }) {
                    Text("Minus")
                }
                Button(onClick = { count = 0 }) {
                    Text("Reset")
                }
            }


        }
    }
}

@Preview(showBackground = true)
@Composable
fun Screen1Preview() {
    MAPD721A3YeukLaiRickieAuTheme {
        Screen1()
    }
}

