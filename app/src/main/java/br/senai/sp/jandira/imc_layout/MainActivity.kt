package br.senai.sp.jandira.imc_layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
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
            .background(color = Color.White)
        ) {
            Card (
                modifier = Modifier
                    .width(300.dp)
                    .height(350.dp)
                    .align(Alignment.CenterHorizontally)
                    .offset(x = 0.dp, y = -35.dp)
            ){
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Seus dados",
                    textAlign = TextAlign.Center
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(350.dp)
                        .padding(12.dp),
                ) {
                    Text(
                        text = "Seu peso:"
                    )
                    OutlinedTextField(value = "", onValueChange = {})
                    Text(
                        text = "Sua altura:"
                    )
                    OutlinedTextField(value = "", onValueChange = {})
                    Button(onClick = { /*TODO*/ },
                        modifier = Modifier
                            .width(280.dp)
                            .height(45.dp)
                    ) {
                        Text(text = "CALCULAR")
                    }
                }
            }
            Card {
                Row {
                    Column {
                        Text(text = "Resultado")
                        Text(text = "Peso Ideal")
                    }
                    Text(text = "21.3")
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