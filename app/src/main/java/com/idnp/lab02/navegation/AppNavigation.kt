package com.idnp.lab02.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.idnp.lab02.screens.PlatosScreen
import com.idnp.lab02.screens.RegionesScreen

@Composable
fun AppNavigation (){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.RegionesScreen.route){
        composable(route = AppScreens.RegionesScreen.route){
            RegionesScreen(navController)
        }
        composable(route = AppScreens.PlatosScreen.route){
            PlatosScreen(navController)
        }
    }
}