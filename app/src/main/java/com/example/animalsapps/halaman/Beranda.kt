package com.example.animalsapps.halaman

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun Beranda(modifier: Modifier= Modifier) {
    Column (modifier = Modifier.fillMaxSize()
        .background(Color(0xFFE3E9E9)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "SELAMAT DATANG",
            fontSize = 35.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color(0xFF8FA5B2),
        )
        Text(text = "HALO, JUWITA CAHYA SAFIRA",
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
            color = Color(0xFF000000)
        )
    }
}