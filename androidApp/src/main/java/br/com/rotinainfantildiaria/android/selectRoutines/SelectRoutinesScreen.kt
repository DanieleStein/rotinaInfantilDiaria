package br.com.rotinainfantildiaria.android.selectRoutines

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.rotinainfantildiaria.android.MyApplicationTheme
import br.com.rotinainfantildiaria.android.components.CardRoutine
import br.com.rotinainfantildiaria.android.R

@Composable
fun SelectRoutinesScreen(onBack: () -> Unit) {
  MyApplicationTheme {
    Surface(
      modifier = Modifier.fillMaxSize(),
      color = Color.White
    ) {

      LazyColumn(
        modifier = Modifier.padding(16.dp),
      ) {

        item {
          Text(
            text = "Divirta-se, monte a rotina do seu pequeno!",
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            fontSize = 35.sp,
            color = Color(0xFFF46799),
            textAlign = TextAlign.Center
          )
          Spacer(modifier = Modifier.height(16.dp))
        }

        item {
            CardRoutine(
              routine = "Ir ao banheiro",
              image = {
                Image(
                  modifier = Modifier.width(50.dp),
                  painter = painterResource(id = R.drawable.banheiro1),
                  contentDescription = "banheiro",
                  alignment = Alignment.Center,
                  contentScale = ContentScale.FillWidth
                )
              }
            )
          Spacer(modifier = Modifier.height(5.dp))
        }

        item {
          CardRoutine(
            routine = "Tomar banho",
            image = {
              Image(
                modifier = Modifier.width(50.dp),
                painter = painterResource(id = R.drawable.banho1),
                contentDescription = "banho",
                alignment = Alignment.Center,
                contentScale = ContentScale.FillWidth
              )
            }
          )
          Spacer(modifier = Modifier.height(5.dp))
        }

        item {
          CardRoutine(
            routine = "Brincar",
            image = {
              Image(
                modifier = Modifier.width(50.dp),
                painter = painterResource(id = R.drawable.brincar1),
                contentDescription = "brincar",
                alignment = Alignment.Center,
                contentScale = ContentScale.FillWidth
              )
            }
          )
          Spacer(modifier = Modifier.height(5.dp))
        }

        item {
          CardRoutine(
            routine = "Guardar os brinquedos",
            image = {
              Image(
                modifier = Modifier.width(50.dp),
                painter = painterResource(id = R.drawable.guardarbrinquedo1),
                contentDescription = "guardar",
                alignment = Alignment.Center,
                contentScale = ContentScale.FillWidth
              )
            }
          )
          Spacer(modifier = Modifier.height(5.dp))
        }

        item {
          CardRoutine(
            routine = "Tomar café da manhã",
            image = {
              Image(
                modifier = Modifier.width(50.dp),
                painter = painterResource(id = R.drawable.tomarcafe1),
                contentDescription = "cafe",
                alignment = Alignment.Center,
                contentScale = ContentScale.FillWidth
              )
            }
          )
          Spacer(modifier = Modifier.height(5.dp))
        }

        item {
          CardRoutine(
            routine = "Escovar os dentes",
            image = {
              Image(
                modifier = Modifier.width(50.dp),
                painter = painterResource(id = R.drawable.escovardentes),
                contentDescription = "dentes",
                alignment = Alignment.Center,
                contentScale = ContentScale.FillWidth
              )
            }
          )
          Spacer(modifier = Modifier.height(5.dp))
        }

        item {
          CardRoutine(
            routine = "Refeição em família",
            image = {
              Image(
                modifier = Modifier.width(50.dp),
                painter = painterResource(id = R.drawable.refeicaofamilia1),
                contentDescription = "refeicao",
                alignment = Alignment.Center,
                contentScale = ContentScale.FillWidth
              )
            }
          )
          Spacer(modifier = Modifier.height(5.dp))
        }

      }
    }
  }
}

@Preview
@Composable
fun SelectRoutineScreenPreview() {
  SelectRoutinesScreen {}
}
