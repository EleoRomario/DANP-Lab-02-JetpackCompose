package com.idnp.lab02.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.idnp.lab02.screens.PlatosScreen
import com.idnp.lab02.screens.RegionesScreen

@Composable
fun AppNavigation (){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.RegionesScreen.route){
        composable(route = AppScreens.RegionesScreen.route){
            RegionesScreen(navController)
        }
        composable(route = AppScreens.PlatosScreen.route + "/{region}", arguments = listOf(
            navArgument(name = "region"){
                type = NavType.StringType
            })){
            PlatosScreen(navController, it.arguments?.getString("region"))
        }
    }
}