package br.senai.sp.jandira.imc_layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.imc_layout.ui.theme.ImcLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImcLayoutTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .background(color = Color(0xFFEE2062))
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(painter = painterResource(id = R.drawable.bmi_icon),
                contentDescription = "Icon de balança com a sigla BMI (Imc em inglês)",
                modifier = Modifier.size(width = 60.dp, height = 60.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Calculadora IMC",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                fontFamily = FontFamily.SansSerif
            )
        }
        Column(modifier = Modifier
            .fillMaxWidth()
            .height(600.dp)
            .background(color = Color.White),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card (
                modifier = Modifier
                    .height(380.dp)
                    .width(320.dp)
                    .offset(x = 0.dp, y = -35.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFE9E7E7)
                ),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 20.dp
                )
            ){
                Text(
                    modifier = Modifier
                        .padding(vertical = 12.dp)
                        .fillMaxWidth()
                        .height(30.dp)
                        .offset(x = 0.dp, y = 15.dp),
                    text = "Seus dados",
                    textAlign = TextAlign.Center,
                    color = Color(0xFFEE2062),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(350.dp)
                        .padding(horizontal = 12.dp, vertical = 16.dp),
                    verticalArrangement = Arrangement.SpaceAround,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 8.dp),
                        text = "Seu peso:",
                        color = Color(0xFFEE2062)
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        placeholder = { Text(
                            text = "Seu peso em Kg",
                            color = Color(0xFFB7B8B8)
                        )},
                        colors = OutlinedTextFieldDefaults
                            .colors(
                                unfocusedBorderColor = Color(0xFFEE2062),
                                unfocusedContainerColor = Color.White
                            ),
                        modifier = Modifier
                            .height(52.dp)
                    )
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 8.dp),
                        text = "Sua altura:",
                        color = Color(0xFFEE2062)
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        placeholder = { Text(
                            text = "Sua altura em cm",
                            color = Color(0xFFB7B8B8)
                        )},
                        colors = OutlinedTextFieldDefaults
                            .colors(
                                unfocusedBorderColor = Color(0xFFEE2062),
                                unfocusedContainerColor = Color.White
                            ),
                        modifier = Modifier
                            .height(50.dp)
                        )
                    Button(onClick = { /*TODO*/ },
                        modifier = Modifier
                            .width(280.dp)
                            .height(55.dp)
                            .offset(x = 0.dp, y = 5.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFEE2062)
                        ),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Text(
                            text = "CALCULAR",
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp
                            )
                    }
                }
            }
            Card (
                modifier = Modifier
                    .width(320.dp)
                    .height(110.dp)
                    .offset(x = 0.dp, y = -32.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF65B168)
                ),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 20.dp
                )
            ){
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    Column (
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(120.dp),
                        verticalArrangement = Arrangement.SpaceEvenly,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Text(
                            text = "Resultado",
                            color = Color.White,
                            modifier = Modifier
                                .offset(x = 0.dp, y = 14.dp)
                        )
                        Text(
                            text = "Peso Ideal",
                            color = Color.White,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier
                                .offset(x = 0.dp, y = -10.dp)
                        )
                    }
                    Text(
                        text = "21.3",
                        color = Color.White,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 36.sp
                    )
                }
            }
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ImcLayoutTheme {
        Greeting()
    }
}