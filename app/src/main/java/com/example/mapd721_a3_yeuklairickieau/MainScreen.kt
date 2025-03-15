package com.example.mapd721_a3_yeuklairickieau

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.mapd721_a3_yeuklairickieau.ui.theme.MAPD721A3YeukLaiRickieAuTheme

@Composable
fun MainScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { navController.navigate("screen1") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Go to Screen 1")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { navController.navigate("screen2") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Go to Screen 2")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { navController.navigate("screen3") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Go to Screen 3")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { navController.navigate("screen4") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Go to Screen 4")
        }
        Spacer(modifier = Modifier.height(16.dp))

        Text("Yeuk Lai Rickie Au")
        Spacer(modifier = Modifier.height(16.dp))

        Text("301458593")

    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MAPD721A3YeukLaiRickieAuTheme {
        MainScreen(rememberNavController())
    }
}

