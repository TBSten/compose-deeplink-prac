package me.tbsten.prac.deeplink

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navDeepLink
import me.tbsten.prac.deeplink.components.Center

private const val URI = "https://compose-deeplink.prac.tbsten.me"

@Composable
fun Test2Screen() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable(
            route = "home",
        ) {
            Center {
                Text("home screen")
            }
        }
        composable(
            route = "hoge",
            deepLinks = listOf(navDeepLink { uriPattern = "$URI/hoge.html" }),
        ) {
            Center {
                Text("hoge screen")
            }
        }
        composable(
            route = "fuga",
            deepLinks = listOf(navDeepLink { uriPattern = "$URI/fuga.html" }),
        ) {
            Center {
                Text("fuga screen")
            }
        }
    }
}