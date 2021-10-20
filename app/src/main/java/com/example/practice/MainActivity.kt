package com.example.practice

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practice.ui.theme.PracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PracticeTheme {
                // A surface container using the 'background' color from the theme
//                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                Greeting("Android")
                LineText()
//                }
            }
        }
    }
}

@Composable
fun LineText() {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("テキスト1")
        Text("テキスト2")
        Text("テキスト3")
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

//@Composable
//fun LogoImage() {
//    Image
//}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    PracticeTheme {
        Greeting("Android")
        LineText()
        LogoImage()
    }
}

//@Preview(widthDp = 50, heightDp = 50)
//@Composable
//fun SquareComposablePreview() {
//    Box(Modifier.background(Color.Yellow)) {
//        Text(text = "Hello world")
//    }
//}

//@Preview(locale = "fr-rFR")
//@Composable
//fun DifferentLocaleComposablePreview() {
//    Text(text = stringResource(id = , formatArgs =  ))
//}
//
//@Preview(showSystemUi = true)
//@Composable
//fun DecoratedComposablePreview() {
//    Text("Hello World")
//}


