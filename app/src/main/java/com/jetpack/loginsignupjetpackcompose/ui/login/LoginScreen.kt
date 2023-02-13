package com.jetpack.loginsignupjetpackcompose.ui.login

import android.widget.ImageView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpack.loginsignupjetpackcompose.R
import com.jetpack.loginsignupjetpackcompose.ui.theme.PrimaryColor
import com.jetpack.loginsignupjetpackcompose.ui.theme.White
import com.jetpack.loginsignupjetpackcompose.ui.theme.WhiteShadow


/**
 * Created by Aashis on 02,February,2023
 */

@Composable
fun LoginScreen() {
    Column(
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
            Spacer(modifier = Modifier.height(50.dp))
            Icon(
                painter = painterResource(id = R.drawable.ic_login),
                contentDescription = "This is logo",
                tint = PrimaryColor,
                modifier = Modifier.size(80.dp)
            )
        }
        Spacer(modifier = Modifier.height(50.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 42.dp),
        ) {
            Text(
                text = "Login to your Account",
                textAlign = TextAlign.Start,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(30.dp))

            OutlinedTextField(modifier = Modifier.fillMaxWidth(),
                value = username.value,
                label = { Text(text = "Email") },
                onValueChange = { username.value = it })

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedTextField(modifier = Modifier.fillMaxWidth(),
                value = password.value,
                onValueChange = { password.value = it },
                label = {
                    Text(
                        text = "Password"
                    )
                })
            Spacer(modifier = Modifier.height(40.dp))
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = { },
                colors = ButtonDefaults.buttonColors(backgroundColor = PrimaryColor)
            ) {
                Text(
                    modifier = Modifier.padding(
                        horizontal = 52.dp, vertical = 8.dp
                    ),
                    text = "Sign in", color = White,
                )
            }

            Spacer(modifier = Modifier.height(80.dp))
            Text(
                text = "- Or sign in with -"
            )
//            Spacer(modifier = Modifier.height(80.dp))
            OtherSection()
        }
    }
}

@Composable
fun OtherSection() {
    Row(modifier = Modifier.padding(top = 10.dp)) {
        Box(modifier = Modifier
            .shadow(elevation = 3.dp, spotColor = WhiteShadow)
            .clickable { }
            .background(White)
            .clip(RoundedCornerShape(5.dp))
            .padding(start = 38.dp, top = 18.dp, bottom = 18.dp, end = 38.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_gmai),
                contentDescription = "This is gmail"
            )
        }
        Box(modifier = Modifier
            .shadow(elevation = 3.dp, spotColor = WhiteShadow)
            .clickable { }
            .background(White)
            .clip(RoundedCornerShape(5.dp))
            .padding(start = 38.dp, top = 18.dp, bottom = 18.dp, end = 38.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.facebook),
                contentDescription = "This is facebook"
            )
        }
        Box(modifier = Modifier
            .shadow(elevation = 3.dp, spotColor = WhiteShadow)
            .clickable { }
            .background(White)
            .clip(RoundedCornerShape(5.dp))
            .padding(start = 38.dp, top = 18.dp, bottom = 18.dp, end = 38.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.twitter),
                contentDescription = "This is twitter"
            )
        }

    }

}

