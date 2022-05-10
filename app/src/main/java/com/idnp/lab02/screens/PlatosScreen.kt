package com.idnp.lab02.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.idnp.lab02.R

@Composable
fun PlatosScreen(navController: NavController){
    Scaffold {
        PlatosBodyContent()
    }
}

@Composable
fun PlatosBodyContent(){
    Platos(platos = platos)
    //Button(onClick = { navController.popBackStack() }) {
    //    Text( "Platos")
   // }
}
@Composable
fun Platos(platos: List<platoData>){
    LazyColumn(){
        items(platos){plato ->
            Plato(plato.title, plato.img)
        }
    }
}
@Composable
fun Plato(title: String, img: Int){
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .padding(all = 16.dp)
            .fillMaxWidth()
            .shadow(375.dp)
    ) {
        Row(
            modifier = Modifier.padding(all = 15.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(painter = painterResource(img), contentDescription = null, modifier = Modifier.size(50.dp))
            Spacer(modifier = Modifier.width(15.dp))
            Text(title, fontSize = 15.sp)
        }

    }
}

@Preview(showSystemUi = true)
@Preview(showBackground = true)
@Composable
fun PlatosDefaultPreview() {
    //Plato()
    PlatosBodyContent()
}

data class  platoData (val cod: String, val  img:  Int , val  title:  String )

private val platos: List<platoData> = listOf(
    platoData("co", R.drawable.ceviche,"Ceviche"),
    platoData("co",R.drawable.lomo,"Lomo Saltado"),
    platoData("co", R.drawable.parihuela, "Parihuela"),
    platoData("co", R.drawable.escabeche, "Escabeche"),
    platoData("si", R.drawable.cuy, "Cuy Chactado"),
    platoData("si", R.drawable.ajidegallina, "Aji de gallina"),
    platoData("si", R.drawable.pachamanca, "Pachamanca"),
    platoData("si", R.drawable.papahuancaina, "Papa huancaina"),
    platoData("si", R.drawable.rocoto, "Rocoto Relleno"),
    platoData("si", R.drawable.adobo, "Adobo Arequipeño"),
    platoData("se", R.drawable.juane, "Juane"),
    platoData("se", R.drawable.tacacho, "Tacacho con Cecina"),
    platoData("se", R.drawable.patarashca, "Patarascha"),

)
