package com.example.jetpackcompose

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.TextUtils.split
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme
import com.example.jetpackcompose.view.Cadastrado
import com.example.jetpackcompose.view.Logado

import com.example.jetpackcompose.view.SegundaTela
import com.example.jetpackcompose.view.TelaPrincipal

import com.example.jetpackcompose.view.Terceiratela

class MainActivity : ComponentActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
            val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "telaPrincipal" ) {
                    composable(
                        route = "telaPrincipal"
                    ) {
                        TelaPrincipal(navController)
                    }
                    composable(
                        route = "segundaTela"
                    ){
                        SegundaTela(navController)
                    }
                    composable(
                        route = "Terceiratela"
                    ){
                       Terceiratela(navController)
                    }
                    composable(
                            route = "Cadastrado"
                            ){
                        Cadastrado(navController)
                    }
                    composable(
                        route = "Logado"
                    ){
                        Logado(navController)
                    }


                }
            }
        }
    }
}



