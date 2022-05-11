package com.idnp.lab02.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.idnp.lab02.R
import com.idnp.lab02.navegation.AppNavigation
import com.idnp.lab02.navegation.AppScreens
import com.idnp.lab02.ui.theme.Lab02Theme

@Composable
fun RegionesScreen(navController: NavController){
    Scaffold (
        modifier = Modifier.padding(20.dp)
            ){
        BodyContent(navController)
    }
}
@Composable
fun BodyContent(navController: NavController){
    Column() {
        Text("Regiones", fontSize = 30.sp)
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            RegionCosta(navController)
            RegionSierra(navController)
            RegionSelva(navController)
        }
    }
}
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun RegionCosta(navController: NavController){
    Card(
        shape = RoundedCornerShape(30),
        elevation = 4.dp,
        modifier = Modifier.padding(5.dp),
        onClick = {
            navController.navigate(route = AppScreens.PlatosScreen.route + "/Costa")
        }
        ) {

        Column(
            modifier = Modifier.padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,

        ) {
            Image(painterResource(R.drawable.ceviche),"Principal", modifier = Modifier
                .padding(1.dp)
                .size(60.dp))
            Text("Costa", fontSize = 20.sp)
        }
    }
}
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun RegionSierra(navController: NavController){
    Card(
        shape = RoundedCornerShape(30),
        elevation = 4.dp,
        modifier = Modifier.padding(5.dp),
        onClick = {
            navController.navigate(route = AppScreens.PlatosScreen.route + "/Sierra")
        }
    ) {

        Column(
            modifier = Modifier.padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            Image(painterResource(R.drawable.rocoto),"Principal", modifier = Modifier
                .padding(1.dp)
                .size(60.dp))
            Text("Sierra", fontSize = 20.sp)
        }
    }
}
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun RegionSelva(navController: NavController){
    Card(
        shape = RoundedCornerShape(30),
        elevation = 4.dp,
        modifier = Modifier.padding(5.dp),
        onClick = {
            navController.navigate(route = AppScreens.PlatosScreen.route + "/Selva")
        }
    ) {

        Column(
            modifier = Modifier.padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            Image(painterResource(R.drawable.tacacho),"Principal", modifier = Modifier
                .padding(1.dp)
                .size(60.dp))
            Text("Selva", fontSize = 20.sp)
        }
    }
}
@Preview(showSystemUi = true)
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    //RegionesScreen()
}