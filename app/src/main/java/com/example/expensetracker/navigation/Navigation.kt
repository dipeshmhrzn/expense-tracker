package com.example.expensetracker.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.expensetracker.presentation.auth.LoginScreen
import com.example.expensetracker.presentation.auth.SignupScreen
import com.example.expensetracker.presentation.onboardingscreen.OnboardingScreen
import com.example.expensetracker.presentation.splashscreen.SplashScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

//    val backStack: SnapshotStateList<Routes> = remember { mutableListOf(Routes.SplashScreen1).toMutableStateList() }

    NavHost(navController = navController, startDestination = Routes.SplashScreen) {


        composable<Routes.SplashScreen> {
            SplashScreen(navHostController = navController)
        }

        composable<Routes.OnBoardingScreen> {
            OnboardingScreen(navHostController = navController)
        }

        composable<Routes.LoginScreen> {
            LoginScreen(navHostController = navController)
        }
        composable<Routes.SignupScreen> {
            SignupScreen(navHostController = navController)
        }



    }
}