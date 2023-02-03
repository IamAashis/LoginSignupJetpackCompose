package com.jetpack.loginsignupjetpackcompose.ui.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.jetpack.loginsignupjetpackcompose.R
import com.jetpack.loginsignupjetpackcompose.ui.theme.PrimaryColor
import com.jetpack.loginsignupjetpackcompose.ui.theme.White
import java.util.*


/**
 * Created by Aashis on 02,February,2023
 */

@Composable
fun LoginScreen() {
    Box(
        modifier = Modifier
            .background(White)
            .fillMaxSize()
    ) {
        val username = remember { mutableStateOf(TextFieldValue()) }
        val password = remember { mutableStateOf(TextFieldValue()) }
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(60.dp))
            Box {
                Icon(
                    painter = painterResource(id = R.drawable.ic_login),
                    contentDescription = "This is logo",
                    tint = PrimaryColor,
                    modifier = Modifier.size(100.dp)
                )
            }
            Spacer(modifier = Modifier.height(60.dp))

            Text(
                text = "Login to your Account",
                textAlign = TextAlign.Start
            )
            Spacer(modifier = Modifier.height(30.dp))

            OutlinedTextField(value = username.value,
                label = { Text(text = "Email") },
                onValueChange = { username.value = it })

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(value = password.value,
                onValueChange = { password.value = it },
                label = {
                    Text(
                        text = "Password"
                    )
                })

            Spacer(modifier = Modifier.height(40.dp))
            Button(
                onClick = { }, colors = ButtonDefaults.buttonColors(backgroundColor = PrimaryColor)
            ) {
                Text(
                    modifier = Modifier.padding(
                        horizontal = 52.dp, vertical = 8.dp
                    ),
                    text = "Sign in", color = White,
                )
            }

        }
    }
}

