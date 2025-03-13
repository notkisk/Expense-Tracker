package com.example.expensetracker.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.expensetracker.R
import com.example.expensetracker.repository.Routes
import com.example.expensetracker.ui.theme.DefaultAnimationSpec


@Composable
fun Splashscreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xA8B0A04E))
    ) {
        Text(
            text = "Expense\nTracker",
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 100.dp),
            style = TextStyle(
                fontSize = 60.sp,
                fontFamily = FontFamily(Font(R.font.item)),
                color = Color.Black,
                shadow = Shadow(
                    color = Color.Black.copy(alpha = 0.3f),
                    offset = Offset(5f, 8f),
                    blurRadius = 4f
                ),
                textAlign = TextAlign.Center

            )

        )

        Box(
            modifier = Modifier
                .size(300.dp)
                .align(Alignment.CenterEnd)
                .background(Color.Transparent)


        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_expense_tracker),
                contentDescription = "Logo",
                modifier = Modifier.size(280.dp),
                contentScale = ContentScale.Fit,
            )
        }


        Button(
            onClick = {
                navController.navigate(Routes.SIGN_IN_SCREEN) {
                    launchSingleTop = true
                    DefaultAnimationSpec
                }
            },

            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 180.dp, start = 100.dp, end = 100.dp)
                .fillMaxWidth()
                .size(50.dp)
                .shadow(
                    elevation = 6.dp,
                    shape = RoundedCornerShape(10.dp),
                    spotColor = Color.Black.copy(alpha = 0.3f)
                ),
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4A2E00))
        ) {
            Text(
                text = "Get Started",
                fontFamily = FontFamily(Font(R.font.inter)),
                fontSize = 16.sp,
                color = Color.White
            )
        }
    }
}

@Preview
@Composable
fun SplashPreview() {
    Splashscreen(navController = rememberNavController())
}