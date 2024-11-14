package com.example.animalsapps.halaman

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.animalsapps.R

@Composable
fun Profil(modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE3E9E9))
            .padding(vertical = 15.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "DATA PRIBADI",
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold,
        )

        Spacer(modifier = Modifier.height(10.dp))

        Image(
            painter = painterResource(R.drawable.juwita),
            contentDescription = "Juwita",
            modifier = Modifier
                .clip(CircleShape)
                .size(200.dp)
                .scale(1.0f))

        Spacer(modifier = Modifier.height(10.dp))

        Column(
            modifier = Modifier
                .background(Color(0xFF8FA5B2))
                .clip(RoundedCornerShape(10.dp))
                .padding(10.dp),
        ){
            Text(text = "Nama : Juwita Cahya Safira",
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(text = "Email : juwitacahya088@gmail.com",
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(text = "Perguruan Tinggi : Politeknik Negeri Batam",
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(text = "Jurusan : Teknik Informatika",
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal
            )
        }

    }
}