package com.example.animalsapps.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.animalsapps.halaman.Beranda
import com.example.animalsapps.halaman.Gambar
import com.example.animalsapps.halaman.Profil
import com.example.animalsapps.halaman.Ras

@Composable
fun BottomNavigation(selectedIndex: Int,
                     navController: NavController,
                     onNavItemClick: (Int) -> Unit,
                     modifier: Modifier = Modifier){

    val navItemList = listOf(
        NavItem( "Beranda", icon = Icons.Default.Home),
        NavItem( "Ras", icon = Icons.Default.Search),
        NavItem( "Gambar", icon = Icons.Default.Favorite),
        NavItem( "Profil", icon = Icons.Default.Person),
    )

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar(
                containerColor = Color(0xFF8FA5B2)
            ) {
                navItemList.forEachIndexed { index, navItem ->
                    NavigationBarItem(
                        selected = selectedIndex == index,
                        onClick = {
                            onNavItemClick(index)
                        },
                        icon = {
                            Icon(imageVector = navItem.icon, contentDescription = "Icon")
                        },
                        label = {
                            Text(text = navItem.label)
                        },
                        colors = NavigationBarItemDefaults.colors(

                            indicatorColor = Color(0xFFE3E9E9)
                        )
                    )
                }
            }
        }
    ) { innerPadding ->
        KontenNav(modifier = Modifier.padding(innerPadding), selectedIndex, navController)
    }
}

@Composable
fun KontenNav(modifier: Modifier = Modifier, selectedIndex : Int, navController: NavController) {
    when(selectedIndex) {
        0-> Beranda()
        1-> Ras(navController)
        2-> Gambar()
        3-> Profil()
    }
}