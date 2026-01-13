package com.tjkt.app1abdyllaan

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tjkt.app1abdyllaan.ui.theme.App1abdyllaanTheme

class DetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App1abdyllaanTheme {
                DataSiswa()
            }
        }
    }
}

@Composable
fun DataSiswa(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Column(
        modifier = modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        Text(
            text = "Biodata Siswa",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))

        Image(painter = painterResource(R.drawable.abdyllaan),
            contentDescription = "Abdylla Adhiyasa Nugroho",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
                .align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(16.dp))

        BiodataRow("Nama", "Abdylla Adhiyasa Nugroho")
        BiodataRow("Mapel", "PCC")
        BiodataRow("Alamat", "Kudus")

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { (context as DetailActivity).finish() },
            shape = RoundedCornerShape(size = 12.dp),
            modifier = Modifier.align(Alignment.End)
        ) {
            Text("Back")
        }
    }
}

@Composable
fun BiodataRow(label: String, value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween

    ) {
        Text(text = label)
        Text(text = value)
    }
}

@Preview(showBackground = true)
@Composable
private fun DataSiswaPreview() {
    DataSiswa()
}

//@Composable
//fun CleanLayoutScreen() {
//    val context = LocalContext.current
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .statusBarsPadding()
//            .padding(16.dp),
//        verticalArrangement = Arrangement.spacedBy(20.dp),
//        horizontalAlignment = Alignment.CenterHorizontally
//
//    ) {
//
//        Text(
//            text = "Informasi Guru dan Siswa",
//            fontSize = 20.sp,
//            fontWeight = FontWeight.Bold
//        )
//        Card(
//            shape = RoundedCornerShape(16.dp),
//            colors = CardDefaults.cardColors(
//                containerColor = Color.White
//            ),
//            elevation = CardDefaults.cardElevation(10.dp),
//            modifier = Modifier.fillMaxWidth()
//
//        ) {
//            Column(
//                modifier = Modifier
//                    .padding(16.dp),
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.spacedBy(12.dp)
//            ) {
//
//                Text(text = "Data Siswa", fontWeight = FontWeight.Bold)
//                Image(painter = painterResource(R.drawable.abdyllaan),
//                    contentDescription = "Ali Zaenal Abidin",
//                    modifier = Modifier
//                        .size(120.dp)
//                        .clip(CircleShape)
//                        .align(Alignment.CenterHorizontally)
//                )
//                InfoRow("Nama", "Abdylla")
//                InfoRow("Kelas", "XII TJKT 3")
//                InfoRow("Alamat", "Kudus")
//            }
//        }
//
//        Card(
//            shape = RoundedCornerShape(16.dp),
//            elevation = CardDefaults.cardElevation(10.dp),
//            colors = CardDefaults.cardColors(
//                containerColor = Color.White
//            ),
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            Column(
//                modifier = Modifier
//                    .padding(16.dp),
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.spacedBy(12.dp)
//            ) {
//                Text(text = "Data Guru", fontWeight = FontWeight.Bold)
//                Image(painter = painterResource(R.drawable.abdyllaan),
//                    contentDescription = "Abdylla Adhiyasa Nugroho",
//                    modifier = Modifier
//                        .size(120.dp)
//                        .clip(CircleShape)
//                        .align(Alignment.CenterHorizontally)
//                )
//                InfoRow("Nama", "Pak Abdylla")
//                InfoRow("Mapel", "PCC")
//
//                Button(
//                    shape = RoundedCornerShape(size = 12.dp),
//                    onClick = {
//                        val phoneNumber = "6289648453133"
//                        context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/$phoneNumber")))
//                    },
//                    modifier = Modifier
//                        .align(Alignment.End)
//                ) {
//                    Text("Chat Now")
//                }
//            }
//        }
//        Button(
//            onClick = { (context as DetailActivity).finish() },
//            shape = RoundedCornerShape(size = 12.dp),
//            modifier = Modifier
//                .fillMaxWidth()
//        ) {
//            Text("Back")
//        }
//
//
//    }
//}
//
//@Composable
//fun InfoRow(label: String, value: String) {
//    Row(
//        modifier = Modifier.fillMaxWidth(),
//        horizontalArrangement = Arrangement.SpaceBetween
//    ) {
//        Text(text = label)
//        Text(text = value)
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun CleanLayoutPreview() {
//    CleanLayoutScreen()
//}
