package com.example.zerohungerapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun SplashScreen() {
    val gradientBackground = Brush.linearGradient(
        colors = listOf(
            Color(0xFF4CAF50),
            Color(0xFF81C784),
        )
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(gradientBackground)
            .padding(24.dp)
            .padding(top = 32.dp),
    ) {
        Column(
            modifier = Modifier.align(Alignment.TopStart)
        ) {
            Text(
                text = "Welcome Back!",
                fontSize = 38.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Let’s continue the journey to",
                fontSize = 18.sp,
                color = Color.White,
            )
            Spacer(modifier = Modifier.height(6.dp))
            Text(
                text = "Zero Hunger.",
                fontSize = 18.sp,
                color = Color.White,
            )
        }

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 32.dp)
                .width(350.dp)
        ) {
            Text(
                text = "Get Started",
                fontSize = 18.sp,
                color = Color.White,
            )
        }
    }
}
