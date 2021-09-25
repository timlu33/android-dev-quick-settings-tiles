package com.tim.dev_quick_settings_tiles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.widget.Toolbar
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.tim.dev_quick_settings_tiles.ui.theme.AndroidDevQuickSettingsTilesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainActivityPage()
        }
    }
}

@Composable
fun MainActivityPage() {
    AndroidDevQuickSettingsTilesTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {
            Column {
                TopAppBar(
                    title = { Text(text = "hello") }
                )
                Greeting("Android!!")
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hellow $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainActivityPage()
}