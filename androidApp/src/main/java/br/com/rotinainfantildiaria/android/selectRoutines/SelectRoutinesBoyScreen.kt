package br.com.rotinainfantildiaria.android.selectRoutines

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
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
import br.com.rotinainfantildiaria.android.components.CardRoutineSelect2
import br.com.rotinainfantildiaria.android.components.TopBarBoy

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SelectRoutinesBoyScreen(function: () -> Unit) {
  MyApplicationTheme{
    Scaffold(
      topBar = { TopBarBoy(title = "Routine") },
      bottomBar = { BottomAppBarBoy(title = "Adicionar", onClick = function) }
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
            color = Color(0x802C73D2),
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

        item {
          CardRoutineSelect2(
            routine = "Refeição em família",
            image = {
              Image(
                modifier = Modifier.width(50.dp),
                painter = painterResource(id = R.drawable.refeicaofamilia),
                contentDescription = "refeicao",
                alignment = Alignment.Center,
                contentScale = ContentScale.FillWidth
              )
            }
          )
          Spacer(modifier = Modifier.height(8.dp))
        }

        item {
          CardRoutineSelect2(
            routine = "Se arrumar",
            image = {
              Image(
                modifier = Modifier.width(50.dp),
                painter = painterResource(id = R.drawable.arrumar2),
                contentDescription = "arrumar",
                alignment = Alignment.Center,
                contentScale = ContentScale.FillWidth
              )
            }
          )
          Spacer(modifier = Modifier.height(8.dp))
        }

        item {
          CardRoutineSelect2(
            routine = "Ir dormir",
            image = {
              Image(
                modifier = Modifier.width(50.dp),
                painter = painterResource(id = R.drawable.dormir5),
                contentDescription = "dormir",
                alignment = Alignment.Center,
                contentScale = ContentScale.FillWidth
              )
            }
          )
          Spacer(modifier = Modifier.height(8.dp))
        }

        item {
          CardRoutineSelect2(
            routine = "Fazer uma oração",
            image = {
              Image(
                modifier = Modifier.size(50.dp),
                painter = painterResource(id = R.drawable.oracao1),
                contentDescription = "oracao",
                alignment = Alignment.Center,
                contentScale = ContentScale.FillWidth
              )
            }
          )
          Spacer(modifier = Modifier.height(8.dp))
        }

        item {
          CardRoutineSelect2(
            routine = "Ler uma história",
            image = {
              Image(
                modifier = Modifier.size(50.dp),
                painter = painterResource(id = R.drawable.lerlivro),
                contentDescription = "historia",
                alignment = Alignment.Center,
                contentScale = ContentScale.FillWidth
              )
            }
          )
          Spacer(modifier = Modifier.height(8.dp))
        }

        item {
          CardRoutineSelect2(
            routine = "Ecolinha de futebol",
            image = {
              Image(
                modifier = Modifier.size(50.dp),
                painter = painterResource(id = R.drawable.futebol),
                contentDescription = "futebol",
                alignment = Alignment.Center,
                contentScale = ContentScale.FillWidth
              )
            }
          )
          Spacer(modifier = Modifier.height(8.dp))
        }

        item {
          CardRoutineSelect2(
            routine = "Aula de balé",
            image = {
              Image(
                modifier = Modifier.size(50.dp),
                painter = painterResource(id = R.drawable.bale),
                contentDescription = "bale",
                alignment = Alignment.Center,
                contentScale = ContentScale.FillWidth
              )
            }
          )
          Spacer(modifier = Modifier.height(8.dp))
        }

        item {
          CardRoutineSelect2(
            routine = "Aula de música",
            image = {
              Image(
                modifier = Modifier.size(50.dp),
                painter = painterResource(id = R.drawable.musica1),
                contentDescription = "musica",
                alignment = Alignment.Center,
                contentScale = ContentScale.FillWidth
              )
            }
          )
          Spacer(modifier = Modifier.height(8.dp))
        }

        item {
          CardRoutineSelect2(
            routine = "Ir para a escola",
            image = {
              Image(
                modifier = Modifier.size(50.dp),
                painter = painterResource(id = R.drawable.escola1),
                contentDescription = "escola",
                alignment = Alignment.Center,
                contentScale = ContentScale.FillWidth
              )
            }
          )
          Spacer(modifier = Modifier.height(8.dp))
        }

        item {
          CardRoutineSelect2(
            routine = "Brincar/cuidar do seu bichinho",
            image = {
              Image(
                modifier = Modifier.size(50.dp),
                painter = painterResource(id = R.drawable.bichinhos),
                contentDescription = "bichinho",
                alignment = Alignment.Center,
                contentScale = ContentScale.FillWidth
              )
            }
          )
          Spacer(modifier = Modifier.height(8.dp))
        }

        item {
          CardRoutineSelect2(
            routine = "Almoçar",
            image = {
              Image(
                modifier = Modifier.size(50.dp),
                painter = painterResource(id = R.drawable.almocar),
                contentDescription = "almocar",
                alignment = Alignment.Center,
                contentScale = ContentScale.FillWidth
              )
            }
          )
          Spacer(modifier = Modifier.height(8.dp))
        }

        item {
          CardRoutineSelect2(
            routine = "Jantar",
            image = {
              Image(
                modifier = Modifier.size(50.dp),
                painter = painterResource(id = R.drawable.jantar),
                contentDescription = "jantar",
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
  SelectRoutinesBoyScreen { }
}
