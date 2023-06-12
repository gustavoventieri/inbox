package com.example.jetpackcompose.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
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
fun Terceiratela (
    navController: NavController) {
    Surface(
        color = Color(0xFF141414),
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier

                .fillMaxWidth()
                .fillMaxHeight()

        ) {
            Imagemred2()
            EmailCad()
            CampoParaIDCad()
            NumCad()
            CampoParaSenhaCad()
            SenhaCadConf()
            Button(
                modifier = Modifier
                    .padding(10.dp),

                onClick = {
                    navController.navigate("Cadastrado")
                },
                colors = ButtonDefaults.buttonColors(Color(0xFF006DC3))
            ) {

                Text(text = "Cadastrar", color = Color.White)

            }

        }
    }
}
@Composable
fun Imagemred2() {
    Image(
        painter = painterResource(R.drawable.img),
        contentDescription = "Round corner image",
        contentScale = ContentScale.Crop,            // crop the image if it's not a square
        modifier = Modifier
            .size(145.dp)
            .clip(CircleShape)                       // clip to the round corner shape
            .border(5.dp, Color(0xFF006DC3), CircleShape)  // add a border (optional)
    )
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EmailCad() {

    var email by remember { mutableStateOf(TextFieldValue("",)) }
    OutlinedTextField(
        modifier = Modifier.padding(7.dp),
        value = email,
        label = { Text(text = "Email",  style = TextStyle(color =Color(0xFF006DC3),
        )
        )
        },  colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor =Color(0xFF006DC3), //quando o textfield está seleionado
            unfocusedBorderColor = Color(0xFF006DC3), //quando o textfield não está selecionado
            cursorColor = Color(0xFF006DC3)),
        onValueChange = {
            email = it
        }

    )
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CampoParaIDCad() {
    var idcad by remember { mutableStateOf(TextFieldValue("",)) }
    OutlinedTextField(

        value = idcad,
        label = { Text(text = "Nome de Usuario",  style = TextStyle(color =Color(0xFF006DC3),
        )
        )
        },  colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color(0xFF006DC3), //quando o textfield está seleionado
            unfocusedBorderColor = Color(0xFF006DC3), //quando o textfield não está selecionado
            cursorColor = Color(0xFF006DC3)),
        onValueChange = {
            idcad = it
        }

    )
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NumCad() {
    var num by remember { mutableStateOf(TextFieldValue("",)) }
    OutlinedTextField(
        modifier = Modifier.padding(7.dp),
        value = num,
        label = { Text(text = "Telefone",  style = TextStyle(color = Color(0xFF006DC3),
        )
        )
        },  colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color(0xFF006DC3), //quando o textfield está seleionado
            unfocusedBorderColor =Color(0xFF006DC3), //quando o textfield não está selecionado
            cursorColor = Color(0xFF006DC3)),
        onValueChange = {
            num = it
        }

    )
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CampoParaSenhaCad() {
    var senhacad by remember { mutableStateOf(TextFieldValue("")) }
    OutlinedTextField(

        value = senhacad,
        label = { Text(text = "Senha",  style = TextStyle(color = Color(0xFF006DC3),
        )
        )
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color(0xFF006DC3), //quando o textfield está seleionado
            unfocusedBorderColor = Color(0xFF006DC3), //quando o textfield não está selecionado
            cursorColor = Color(0xFF006DC3)),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        visualTransformation = PasswordVisualTransformation(),
        onValueChange = {
           senhacad = it
        }

    )
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SenhaCadConf() {
    var senha by remember { mutableStateOf(TextFieldValue("")) }
    OutlinedTextField(
        modifier = Modifier.padding(7.dp),
        value = senha,
        label = { Text(text = "Confirme a Senha",  style = TextStyle(color =Color(0xFF006DC3),
        )
        )
        },  colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color(0xFF006DC3), //quando o textfield está seleionado
            unfocusedBorderColor = Color(0xFF006DC3), //quando o textfield não está selecionado
            cursorColor = Color(0xFF006DC3)),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        visualTransformation = PasswordVisualTransformation(),
        onValueChange = {
            senha = it
        }

    )
}





