package com.example.animalsapps.halaman

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.animalsapps.R
import com.example.animalsapps.ui.theme.Blue_Costal


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Informasi(navController: NavController, modifier: Modifier = Modifier) {

    var scrollState = rememberScrollState()

    Scaffold(modifier = modifier.fillMaxWidth(),
        topBar = {
            TopAppBar(
                title = { Text(text = "INFORMASI") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            painter = painterResource(id = R.drawable.img_2),
                            contentDescription = "APP Icon"
                        )
                    }
                }, colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Blue_Costal
                )
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier.fillMaxSize()
                .background(Color(0xFFE3E9E9))
                .padding(innerPadding)
                .verticalScroll(scrollState),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Image(
                painter = painterResource(R.drawable.kucingkampung),
                contentDescription = "Kucing",
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .size(200.dp)
                    .padding(vertical = 15.dp))
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Kucing Kampung",
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(10.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Penggemar anabul kucing tentu familiar dengan kucing Moggie. " +
                        "Kucing Moggy, yang juga dikenal sebagai Moggie, adalah istilah dari Inggris yang digunakan untuk menggambarkan kucing jalanan. " +
                        "Mereka adalah kucing ras campuran dan tidak memiliki stambum (surat silsilah). " +
                        "Meskipun ada keraguan mengenai stambum mereka, kucing Moggie merupakan jenis kucing domestik yang paling banyak ditemui dan populer.\n" +
                        "\n" +
                        "Kucing Moggy mungkin berasal dari kucing liar atau hasil pembiakan yang tidak selektif. " +
                        "Inilah salah satu alasan utama mengapa kucing ini memiliki berbagai ukuran, bentuk, pola bulu, dan warna, serta kepribadian yang berbeda-beda. " +
                        "Kucing Moggie menunjukkan berbagai ciri kepribadian dan perilaku yang beragam tergantung pada susunan genetik mereka. " +
                        "Beberapa di antaranya sangat ramah dan suka bermain, sementara yang lain mungkin lebih pemalu dan santai. " +
                        "Namun, secara umum, mereka adalah kucing kampung lucu yang bersahabat dan menjadi hewan peliharaan serta teman yang hebat.\n" +
                        "\n" +
                        "Kucing Moggie memiliki struktur fisik yang kokoh dan ciri khusus yang muncul dari keturunan campuran mereka. " +
                        "Para ahli menyarankan bahwa memahami secara umum tentang jenis kucing Moggy akan membantu meningkatkan penerimaan felin ini di rumah dan masyarakat kita.",
                fontSize = 15.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(10.dp)
            )
        }
    }
}