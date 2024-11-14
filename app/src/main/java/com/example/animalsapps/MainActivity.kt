package com.example.animalsapps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.animalsapps.halaman.Informasi
import com.example.animalsapps.halaman.Ras
import com.example.animalsapps.ui.theme.AnimalsAppsTheme
import com.example.animalsapps.navigation.BottomNavigation
import com.example.animalsapps.navigation.TopBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        enableEdgeToEdge()
        setContent {
            AnimalsAppsTheme {
                val navController = rememberNavController()
                var selectedIndex by remember { mutableIntStateOf(0) }
                val screenTitles = listOf("BERANDA", "RAS", "GAMBAR", "PROFIL")

                NavHost(navController = navController, startDestination = "ras") {
                    composable("ras") {
                        Ras(navController)
                    }
                    composable("informasi") {
                        Informasi(navController)
                    }
                }

                //jika column dimatikan maka halaman detail akan muncul tetapi
                // topbar dan navbar akan hilang sehingga hanya
                // halaman ras dan informasi saja yang dapat dilihat
                Column {
                    TopBar(title = screenTitles[selectedIndex])
                    BottomNavigation(selectedIndex = selectedIndex, onNavItemClick = { index ->
                        selectedIndex = index
                    },
                        navController = navController)
                }
            }
        }
    }
}
