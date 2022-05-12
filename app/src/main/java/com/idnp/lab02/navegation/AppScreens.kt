package com.idnp.lab02.navegation

sealed class AppScreens(val route: String){
    object RegionesScreen: AppScreens("regiones_screen")
    object PlatosScreen: AppScreens("platos_screen")
}
