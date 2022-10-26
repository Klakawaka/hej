package com.example.happybirthdayhabibi

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.happybirthdayhabibi.ui.theme.HappyBirthdayHabibiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            HappyBirthdayHabibiTheme {
                    
                    Surface(color = MaterialTheme.colors.background) {
                        Column() {
                             //TODO

                        Button(onClick = { }) {
                        buttonMsg(message = "CLICK MEEE!")

                        }}

                        BirthdayGreetingWithText( "Happy Birthday Habibi!!", "- from ur Habibi")

                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingWithText(message: String, from: String){
    Column() {
        Text(
            text = message,
            fontSize = 36.sp,
        )
        Text(
            text = from,
            fontSize = 24.sp,
        )
    }
}


@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayHabibiTheme {
        BirthdayGreetingWithText("Happy Birthday Habibi!!", "- from ur Habibi")

        }
    }
@Composable
fun buttonMsg(message: String){
    Text(
        text = message,
        fontSize = 19.sp,
    )
}

        
