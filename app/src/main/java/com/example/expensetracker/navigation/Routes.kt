package com.example.expensetracker.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Routes {

    @Serializable
    data object SplashScreen : Routes()

    @Serializable
    data object OnBoardingScreen : Routes()

    @Serializable
    data object LoginScreen : Routes()

    @Serializable
    data object SignupScreen : Routes()

}
