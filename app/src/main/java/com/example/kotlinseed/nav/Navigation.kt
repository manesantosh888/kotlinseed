package com.example.kotlinseed.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.kotlinseed.ui.DetailScreen
import com.example.kotlinseed.ui.MainScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route){
        composable(
            route = Screen.MainScreen.route
        ){
            MainScreen(navController = navController)
        }
        composable(
            route = Screen.DetailScreen.route + "/{name}",
            arguments = listOf(
                navArgument("name"){
                    type = NavType.StringType
                    defaultValue = "Sam"
                    nullable = true
                }
            )
        ){entry ->
            DetailScreen(name = entry.arguments?.getString("name"))
        }
    }
}