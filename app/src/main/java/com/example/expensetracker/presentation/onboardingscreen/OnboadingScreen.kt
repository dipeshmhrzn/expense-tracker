package com.example.expensetracker.presentation.onboardingscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.expensetracker.R
import com.example.expensetracker.navigation.Routes
import com.example.expensetracker.presentation.splashscreen.SplashScreen
import com.example.expensetracker.ui.theme.ExpenseTrackerTheme
import com.example.expensetracker.ui.theme.Inter

@Composable
fun OnboardingScreen(
    navHostController: NavHostController
) {
    Column(
        modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.onboardingimg),
            contentDescription = null,
        )

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "Spend smarter \nSave more",
            textAlign = TextAlign.Center,
            fontFamily = Inter,
            style = TextStyle(
                fontSize = 36.sp,
                lineHeight = 38.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground
            )
        )

        Spacer(modifier = Modifier.height(40.dp))

        Button(
            onClick = {
                navHostController.navigate(Routes.LoginScreen)
            },
            colors = ButtonColors(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.onPrimary,
                disabledContainerColor = MaterialTheme.colorScheme.inversePrimary,
                disabledContentColor = MaterialTheme.colorScheme.inversePrimary
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(start = 30.dp, end = 30.dp),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 8.dp,
                pressedElevation = 2.dp,
                disabledElevation = 0.dp
            )
        ) {
            Text(
                text = "Get Started",
                textAlign = TextAlign.Center,
                fontFamily = Inter,
                style = TextStyle(
                    fontSize = 18.sp,
                    lineHeight = 38.sp,
                    fontWeight = FontWeight.SemiBold,
                )
            )
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun OnboardingScreenPreview() {
    ExpenseTrackerTheme {
        OnboardingScreen(rememberNavController())
    }
}