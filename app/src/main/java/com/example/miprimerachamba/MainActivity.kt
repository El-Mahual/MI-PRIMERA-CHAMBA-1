package com.example.miprimerachamba
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.miprimerachamba.ui.theme.MIPRIMERACHAMBATheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MIPRIMERACHAMBATheme  {
                CertificatingCoursePreview()

            }
        }
    }
}

@Composable
fun CertificatingCourse(nombre:String, horas:String, curso:String, modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()

        //  horizontalAlignment = Alignment.CenterHorizontally
        ) {


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                painter = painterResource(id = R.drawable.avengersa), // Imagen del escudo izquierdo
                contentDescription = null,
                modifier = modifier.size(50.dp,50.dp) // Tamaño del escudo
                     )
               Spacer(modifier = Modifier.width(25.dp))
               Text(
                text = "SHIELD Hero Academy",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                   )
                Spacer(modifier = Modifier.width(25.dp))
                Image(
                painter = painterResource(id = R.drawable.shield), // Imagen del escudo derecho
                contentDescription = null,
                modifier = modifier.size(50.dp,50.dp) // Tamaño del escudo
                )


               }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 1.dp),
            horizontalArrangement = Arrangement.Center

            ) {

            Text(
                text = "This certificate is presented to:",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,

                )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
        Text(
            text = "$nombre",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = modifier.fillMaxWidth()
        )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Has completed a $horas hours course on ",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = modifier.fillMaxWidth()
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "$curso",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = modifier.fillMaxWidth()
            )
        }


        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp
                    ),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.firma2), // Imagen del escudo izquierdo
                            contentDescription = null,
                            modifier = modifier.size(100.dp,50.dp)// Tamaño del escudo
                        )
                        Text(
                            text = "Nicholas Joseph Fury.",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(top = 4.dp)
                        )
                    }
//w
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.firmados), // Imagen del escudo derecho
                            contentDescription = null,
                            modifier = modifier.size(100.dp,50.dp)
                        )
                        Text(
                            text = "Anthony Edward Stark.",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(top = 4.dp)
                        )
                    }
                }
            }
        }








    }
}

@Composable
@Preview(showBackground = true)
fun CertificatingCoursePreview(){

    CertificatingCourse(nombre = "Jesús Manuel Hernández García ", horas = "2800", curso = " Assistant SuperHero")
}
