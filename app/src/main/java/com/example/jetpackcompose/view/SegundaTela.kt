package com.example.jetpackcompose.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcompose.R


@Composable
fun SegundaTela(
    navController: NavController
) {
    Surface(color = Color(0xFF141414), modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(),) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier

            .fillMaxWidth()
            .fillMaxHeight()

    ) {

        CampoParaID()
        CampoParaSenha()
        Button(

            modifier = Modifier.padding(10.dp),
            onClick = {
                navController.navigate("Logado")

            }, colors = ButtonDefaults.buttonColors(Color(0xFF006DC3))
        ) {

            Text(text = "Entrar", color = Color.White)
        }




    }
}
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CampoParaID() {

    var id by remember { mutableStateOf(TextFieldValue("",)) }

    return OutlinedTextField(
        modifier = Modifier.padding(10.dp),
        value = id,
        label = {
            Text(
                text = "Nome de Usuario", style = TextStyle(
                    color = Color(0xFF006DC3),
                )
            )
        }, colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color(0xFF006DC3),
            unfocusedBorderColor =Color(0xFF006DC3),
            cursorColor = Color(0xFF006DC3)
        ),
        onValueChange = {
            id = it
            var id2: TextFieldValue = it
        }

    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CampoParaSenha() {
    var senha by remember { mutableStateOf(TextFieldValue("")) }
    return OutlinedTextField(
        value = senha,
        label = {
            Text(
                text = "Senha", style = TextStyle(
                    color = Color(0xFF006DC3),


                    )
            )

        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color(0xFF006DC3),
            unfocusedBorderColor =Color(0xFF006DC3),
            cursorColor = Color(0xFF006DC3)
        ),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        visualTransformation = PasswordVisualTransformation(),
        onValueChange = { it ->
            senha = it
        },
       

    )
}





