package com.shrey.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shrey.mos_businesscard.ui.theme.MOS_BusinessCardTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.shrey.mos_businesscard.R


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MOS_BusinessCardTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121212))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ProfileImage()
        Spacer(modifier = Modifier.height(16.dp))
        NameText(name = "Shreyansh Parker")
        Spacer(modifier = Modifier.height(8.dp))
        TitleText(title = "AI Developer & Content Creator")
        Spacer(modifier = Modifier.height(24.dp))
        ContactInfo(phone = "+1 234 567 890", email = "shreyansh@example.com", website = "www.shreyanshparker.com")
    }
}

@Composable
fun ProfileImage() {
Image(painter = painterResource(R.drawable.image_profile),contentDescription = null,
    contentScale = ContentScale.Crop,
    modifier = Modifier
        .size(120.dp)
        .clip(CircleShape)
        .background(Color.Gray))
}

@Composable
fun NameText(name: String) {
    Text(
        text = name,
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold,
        color = Color.White,
        textAlign = TextAlign.Center
    )
}

@Composable
fun TitleText(title: String) {
    Text(
        text = title,
        fontSize = 18.sp,
        fontWeight = FontWeight.Light,
        color = Color(0xFFBB86FC),
        textAlign = TextAlign.Center
    )
}

@Composable
fun ContactInfo(phone: String, email: String, website: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Phone: $phone",
            fontSize = 16.sp,
            color = Color.White,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = "Email: $email",
            fontSize = 16.sp,
            color = Color.White,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = "Website: $website",
            fontSize = 16.sp,
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBusinessCard() {
    MOS_BusinessCardTheme {
        BusinessCard()
    }
}
