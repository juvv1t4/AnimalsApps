package com.example.animalsapps.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.animalsapps.R
import com.example.animalsapps.ui.theme.Blue_Costal

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(title: String,
           modifier: Modifier = Modifier){

    TopAppBar(title = { Text(text = title)},
        navigationIcon = {
            IconButton(onClick = { }) {
                Icon(painter = painterResource(id = R.drawable.img_1), contentDescription = "APP Icon")
            }
        }, colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Blue_Costal
        )
    )
}
