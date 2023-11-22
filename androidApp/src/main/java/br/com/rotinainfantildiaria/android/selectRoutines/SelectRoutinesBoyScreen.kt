package br.com.rotinainfantildiaria.android.selectRoutines

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import br.com.rotinainfantildiaria.android.R
import br.com.rotinainfantildiaria.android.components.BottomAppBarBoy
import br.com.rotinainfantildiaria.android.components.CardRoutineSelect
import br.com.rotinainfantildiaria.android.components.CardRoutineSelect2
import br.com.rotinainfantildiaria.android.components.TopBarBoy

@Composable
fun SelectRoutinesBoyScreen() {
  MyApplicationTheme {
    Scaffold(
      topBar = { TopBarBoy(title = "Routine") },
      bottomBar = { BottomAppBarBoy(title = "Adicionar", onClick = {}) }
    ) {

      LazyColumn(
        modifier = Modifier
          .padding(16.dp)
          .padding(it)
      ) {

        item {
          Text(
            text = "Divirta-se, monte a rotina do seu pequeno!",
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            fontSize = 35.sp,
            color = Color.Black,
            textAlign = TextAlign.Center
          )
          Spacer(modifier = Modifier.height(16.dp))
        }

        item {
          CardRoutineSelect2(
            routine = "Ir ao banheiro",
            image = {
              Image(
                modifier = Modifier.width(50.dp),
                painter = painterResource(id = R.drawable.banheiro3),
                contentDescription = "banheiro",
                alignment = Alignment.Center,
                contentScale = ContentScale.FillWidth
              )
            }
          )
          Spacer(modifier = Modifier.height(8.dp))
        }

        item {
          CardRoutineSelect2(
            routine = "Tomar banho",
            image = {
              Image(
                modifier = Modifier.width(50.dp),
                painter = painterResource(id = R.drawable.banho),
                contentDescription = "banho",
                alignment = Alignment.Center,
                contentScale = ContentScale.FillWidth
              )
            }
          )
          Spacer(modifier = Modifier.height(8.dp))
        }

        item {
          CardRoutineSelect2(
            routine = "Brincar",
            image = {
              Image(
                modifier = Modifier.width(50.dp),
                painter = painterResource(id = R.drawable.brincar),
                contentDescription = "brincar",
                alignment = Alignment.Center,
                contentScale = ContentScale.FillWidth
              )
            }
          )
          Spacer(modifier = Modifier.height(8.dp))
        }

        item {
          CardRoutineSelect2(
            routine = "Guardar os brinquedos",
            image = {
              Image(
                modifier = Modifier.width(50.dp),
                painter = painterResource(id = R.drawable.guardarbrinquedo),
                contentDescription = "guardar",
                alignment = Alignment.Center,
                contentScale = ContentScale.FillWidth
              )
            }
          )
          Spacer(modifier = Modifier.height(8.dp))
        }

        item {
          CardRoutineSelect2(
            routine = "Tomar café da manhã",
            image = {
              Image(
                modifier = Modifier.width(50.dp),
                painter = painterResource(id = R.drawable.tomarcafe),
                contentDescription = "cafe",
                alignment = Alignment.Center,
                contentScale = ContentScale.FillWidth
              )
            }
          )
          Spacer(modifier = Modifier.height(8.dp))
        }

        item {
          CardRoutineSelect2(
            routine = "Escovar os dentes",
            image = {
              Image(
                modifier = Modifier.width(50.dp),
                painter = painterResource(id = R.drawable.escovardentes1),
                contentDescription = "dentes",
                alignment = Alignment.Center,
                contentScale = ContentScale.FillWidth
              )
            }
          )
          Spacer(modifier = Modifier.height(8.dp))
        }


      }
    }
  }
}

@Preview
@Composable
fun SelectRoyinesBoyScreenPreview() {
  SelectRoutinesBoyScreen()
}
