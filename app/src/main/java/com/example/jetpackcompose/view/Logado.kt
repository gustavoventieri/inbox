package com.example.jetpackcompose.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.leanback.widget.ListRow
import androidx.navigation.NavController
import com.example.jetpackcompose.R
import net.jetpackcompose.composetext.model.FruitModel

@Composable
fun Logado(
    navController: NavController
) {
    Surface(color = Color(0xFF141414), modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()) {

        Column( verticalArrangement = Arrangement.SpaceAround,) {
            Pesquisa()
            CustomListView()
        }


    }
}

private val fruitsList = mutableListOf<FruitModel>()
@Composable
fun CustomListView() {
    //add the list
    fruitsList.add(FruitModel("Apple", "Lançamentos", "Novos produtos chegaram na nossas lojas, com...", R.drawable.img))



    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 20.dp),
        verticalArrangement = Arrangement.spacedBy(40.dp),
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF141414))

    ) {
        items(fruitsList) { model ->
            ListRow(model = model)
        }
    }

}

@Composable
fun ListRow(model: FruitModel) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()

            ) {
        Image(
            painter = painterResource(id = model.image),
            contentDescription = "aaaaaaaaaaaaa",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)                       // clip to the round corner shape

        )
        Spacer(modifier = Modifier.width(15.dp))
        Column() {


            Text(
                text = model.name,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Text(text = model.cont,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,)

            Text(text = model.txt,
                color = Color.DarkGray,
                    fontSize = 12.sp,)
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Pesquisa () {
    Spacer(modifier = Modifier.padding(10.dp))
    Row(modifier = Modifier
        .size(width = 500.dp, height = 60.dp)
        .background(Color(0xFF141414)) ) {
        Spacer(modifier = Modifier.width(10.dp))

        Row(

            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .size(width = 370.dp, height = 50.dp)
                .clip(CircleShape)
                .background(Color(0xFF1D1D1D))


        ) {

            Spacer(modifier = Modifier.width(30.dp))
            Text("Procure", color = Color.Gray)
            Spacer(modifier = Modifier.width(230.dp))
            Image(painter = painterResource(R.drawable.img),
                contentDescription = "aaaaaaaaaaaaa",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)                       // clip to the round corner shape

            )

        }
    }
}