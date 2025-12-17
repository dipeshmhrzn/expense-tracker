package com.example.expensetracker.presentation.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.expensetracker.R
import com.example.expensetracker.presentation.auth.components.CustomButton
import com.example.expensetracker.presentation.auth.components.CustomPasswordField
import com.example.expensetracker.presentation.auth.components.CustomTextField
import com.example.expensetracker.presentation.auth.components.textFieldHeader
import com.example.expensetracker.ui.theme.ExpenseTrackerTheme

@Composable
fun SignupScreen(navHostController: NavHostController) {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.topbg),
            contentDescription = null
        )

        Card(
            modifier = Modifier
                .padding(16.dp)
                .offset(y = (-110).dp)
                .fillMaxWidth(),
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.background,
                contentColor = MaterialTheme.colorScheme.onBackground
            )
        ) {
            Column(
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxWidth()
            ) {

                textFieldHeader(" EMAIL")
                Spacer(modifier = Modifier.height(8.dp))

                CustomTextField(
                    value = email,
                    onValueChange = {
                        email = it
                    },
                    placeholder = "example@gmail.com",
                    keyboardType = KeyboardType.Email,
                )

                Spacer(modifier = Modifier.height(16.dp))
                textFieldHeader("PASSWORD")
                Spacer(modifier = Modifier.height(8.dp))

                CustomPasswordField(
                    value = password,
                    onValueChange = {
                        password = it
                    },
                    placeholder = "Password",
                    keyboardType = KeyboardType.Password,
                    passwordVisible = passwordVisible,
                    onVisibilityToggle = { passwordVisible = !passwordVisible }
                )

                Spacer(modifier = Modifier.height(16.dp))

                textFieldHeader("RE-TYPE PASSWORD")
                Spacer(modifier = Modifier.height(8.dp))

                CustomPasswordField(
                    value = confirmPassword,
                    onValueChange = {
                        confirmPassword = it
                    },
                    placeholder = " Confirm Password",
                    keyboardType = KeyboardType.Password,
                    passwordVisible = passwordVisible,
                    onVisibilityToggle = { passwordVisible = !passwordVisible }
                )
                Spacer(modifier = Modifier.height(20.dp))

                CustomButton(
                    buttonText = "Register",
                    onClick = { }
                )

            }
        }

    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun LoginScreenPreview() {
    ExpenseTrackerTheme {
        SignupScreen(rememberNavController())
    }
}