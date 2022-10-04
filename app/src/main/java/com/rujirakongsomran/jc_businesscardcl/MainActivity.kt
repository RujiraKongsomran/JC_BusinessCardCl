package com.rujirakongsomran.jc_businesscardcl

import android.graphics.Color.parseColor
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Android
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rujirakongsomran.jc_businesscardcl.ui.theme.JC_BusinessCardClTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JC_BusinessCardClTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    CreateBusinessCard()
                }
            }
        }
    }
}

val String.color
    get() = Color(parseColor(this))

@Preview(showSystemUi = true)
@Composable
fun CreateBusinessCard() {
    Column(
        modifier = Modifier
            .background("#003949".color)
            .fillMaxSize()
    ) {
        Box(Modifier.weight(8f)) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                Icon(
                    imageVector = Icons.Default.Android,
                    contentDescription = "Android Icon",
                    tint = "#3DDC84".color,
                    modifier = Modifier.size(100.dp),
                )
                Text(
                    text = "Jennifer Doe", fontSize = 40.sp,
                    color = Color.White
                )
                Text(
                    text = "Android Developer Extraordinary",
                    fontWeight = FontWeight.Bold,
                    color = "#3DDC84".color
                )
            }
        }


        Box(Modifier.weight(2f)) {
            Column(
                modifier = Modifier.padding(bottom = 24.dp)
            ) {
                Divider(color = Color.White, thickness = 1.dp)
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(start = 58.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Filled.Phone,
                        contentDescription = "Phone Icon",
                        tint = "#3DDC84".color,
                        modifier = Modifier.size(24.dp),
                    )
                    Spacer(modifier = Modifier.width(18.dp))
                    Text(
                        text = "+11 (123) 44 55 66",
                        color = Color.White,
                        fontSize = 16.sp
                    )
                }
                Divider(color = Color.White, thickness = 1.dp)
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(start = 58.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = "Share Icon",
                        tint = "#3DDC84".color,
                        modifier = Modifier.size(24.dp),
                    )
                    Spacer(modifier = Modifier.width(18.dp))
                    Text(
                        text = "@AndroidDev",
                        color = Color.White,
                        fontSize = 16.sp
                    )
                }
                Divider(color = Color.White, thickness = 1.dp)
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(start = 58.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "Email Icon",
                        tint = "#3DDC84".color,
                        modifier = Modifier.size(24.dp),
                    )
                    Spacer(modifier = Modifier.width(18.dp))
                    Text(
                        text = "Rujira@gmail.com",
                        color = Color.White,
                        fontSize = 16.sp
                    )
                }

            }
        }
    }

}
