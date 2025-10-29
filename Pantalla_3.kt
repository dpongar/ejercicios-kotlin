package com.example.pantalla3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.pantalla3.ui.theme.Pantalla3Theme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pantalla3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   Screen3(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Screen3(modifier: Modifier = Modifier){
    Column(modifier = modifier.fillMaxSize()){

        Row(modifier = Modifier.weight(1f)){
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color.Magenta),
                contentAlignment = Alignment.Center
            ){
              ContenidoCuadrante(
                  title = "Text composable",
                  description = "Displays text and follows the recommended Material Design guidelines."
              )
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color.Cyan),
                contentAlignment = Alignment.Center
            ){
                ContenidoCuadrante(
                    title = "Image composable",
                    description = "Creates a composable that lays out and draws a given Painter class object."
                    )
            }
        }
        Row(modifier = Modifier.weight(1f)){
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color.Green),
                contentAlignment = Alignment.Center
            ){
                ContenidoCuadrante(
                    title = "Row composable",
                    description = "A layout composable that places its children in a horizontal sequence."
                )


            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color.Yellow),
                contentAlignment = Alignment.Center
            ){
                ContenidoCuadrante(
                    title = "Column composable",
                    description = "A layout composable that places its children in a vertical sequence."
                )
            }
        }


    }
}
@Composable
fun ContenidoCuadrante(title: String, description: String){
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 8.dp),
            fontSize = 16.sp
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

