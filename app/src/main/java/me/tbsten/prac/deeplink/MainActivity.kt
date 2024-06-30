package me.tbsten.prac.deeplink

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import me.tbsten.prac.deeplink.ui.theme.DeeplinkPracTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DeeplinkPracTheme {
//                Test1Screen(action = intent?.action, data = intent?.data)
                Test2Screen()
            }
        }
    }
}
