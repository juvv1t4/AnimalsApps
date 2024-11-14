package com.example.animalsapps.halaman

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Ras(navController: NavController){
    val columnList = getAllRas()
    val rowList = getPopularRas()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE3E9E9))
            .padding(vertical = 10.dp, horizontal = 10.dp)
    ){
        Text(text = "Populer", style = TextStyle(fontSize = 25.sp), fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(10.dp))

        LazyRow(modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(10.dp)
        ) {
            itemsIndexed(rowList, itemContent = {index, item ->
                Spacer(modifier = Modifier.width(10.dp))
                KucingRow(item = item, navController = navController)
            })
        }

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Kucing", style = TextStyle(fontSize = 25.sp), fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(10.dp))

        LazyColumn(content = {
            itemsIndexed(columnList, itemContent = { index, item ->
                KucingColumn(item = item, navController = navController)
            })
        }, modifier = Modifier
            .fillMaxSize(),
            contentPadding = PaddingValues(bottom = 100.dp))
    }
}

@Composable
fun KucingRow(item : DetailRas, navController: NavController){

    val context = LocalContext.current

    Column(
        modifier = Modifier
            .height(200.dp)
            .width(150.dp)
            .clickable {
                navController.navigate("informasi")
            },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = item.foto),
            contentDescription = item.ras,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .clip(RoundedCornerShape(10.dp))
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = item.ras,
            style = TextStyle(fontSize = 15.sp),
            fontWeight = FontWeight.Bold)
    }
}

@Composable
fun KucingColumn(item : DetailRas, navController: NavController){

    val context = LocalContext.current

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clickable {
                navController.navigate("informasi")
            }
    ) {
        Image(painter = painterResource(id = item.foto),
            contentDescription = item.ras,
            modifier = Modifier
                .clip(CircleShape)
                .size(64.dp)
                .scale(1.0f)
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = item.ras,
                style = TextStyle(fontSize = 20.sp),
                fontWeight = FontWeight.Bold)
            Text(
                text = item.negara,
                style = TextStyle(fontSize = 15.sp),
                fontWeight = FontWeight.Normal)
        }
    }
}




