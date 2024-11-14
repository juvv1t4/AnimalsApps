package com.example.animalsapps.halaman

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
fun Gambar() {
    val columnList = getAllRas()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE3E9E9))
            .padding(vertical = 10.dp, horizontal = 10.dp)
    ){
        LazyVerticalGrid (content = {
            itemsIndexed(columnList, itemContent = { index, item ->
                KucingGrid(item = item)
            })
        }, modifier = Modifier
            .fillMaxSize(),
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(bottom = 100.dp),
            verticalArrangement = Arrangement.spacedBy(15.dp),
            horizontalArrangement = Arrangement.spacedBy(15.dp)
        )
    }
}

@Composable
fun KucingGrid(item : DetailRas){

    val context = LocalContext.current

    Column(
        modifier = Modifier
            .height(200.dp)
            .width(200.dp)
            .clickable {
                Toast.makeText(context, item.ras, Toast.LENGTH_SHORT).show()
            },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = item.foto),
            contentDescription = item.ras,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .size(200.dp)
        )
    }
}