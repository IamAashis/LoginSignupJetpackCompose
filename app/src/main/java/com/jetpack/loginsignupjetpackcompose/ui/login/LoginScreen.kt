package com.jetpack.loginsignupjetpackcompose.ui.login

import android.widget.EditText
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import com.jetpack.loginsignupjetpackcompose.R
import com.jetpack.loginsignupjetpackcompose.ui.theme.White


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
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Box() {
                Image(
                    painter = painterResource(id = R.drawable.ic_jetpack_compose),
                    contentDescription = "This is logo"
                )
            }

            TextField(value = username.value,
                label = { Text(text = "Email") },
                onValueChange = { username.value = it })

            TextField(value = password.value, onValueChange = { password.value = it }, label = {
                Text(
                    text = "Password"
                )
            })

        }
    }
}