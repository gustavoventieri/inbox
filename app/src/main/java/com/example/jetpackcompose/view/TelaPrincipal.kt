package com.example.jetpackcompose.view

import android.R
import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle


@Composable
fun TelaPrincipal(
    navController: NavController,

) {
    Surface(color = Color(0xFF141414), modifier = Modifier
            .fillMaxWidth()
        .fillMaxHeight(),) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),

        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {



            Row(
            ) {


                Text(
                    buildAnnotatedString {
                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color.White, fontSize = 120.sp) ) {
                            append("In")
                        }
                        append("")

                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color(0xFF006DC3), fontSize = 120.sp)) {
                            append("box")
                        }
                        append("")
                    }




                )

            }
            Spacer(modifier = Modifier.padding(260.dp))
            Row(horizontalArrangement = Arrangement.SpaceAround,) {


                Button(
                    onClick = {
                        navController.navigate("SegundaTela")
                    },
                    modifier = Modifier.padding(27.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFF006DC3))
                ) {
                    Text(
                        text = "Entrar",
                        modifier = Modifier.padding(horizontal = 19.dp, vertical = 5.dp),
                        Color.White
                    )
                }

                Button(
                    onClick = { navController.navigate("Terceiratela") },
                    modifier = Modifier.padding(27.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFF006DC3))
                ) {
                    Text(
                        text = "Cadastrar",
                        modifier = Modifier.padding(horizontal = 19.dp, vertical = 5.dp),
                        Color.White
                    )
                }
            }

        }
    }
}





