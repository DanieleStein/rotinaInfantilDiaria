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
import br.com.rotinainfantildiaria.android.R
import br.com.rotinainfantildiaria.android.components.BottomAppBarGirl
import br.com.rotinainfantildiaria.android.components.CardRoutineSelect
import br.com.rotinainfantildiaria.android.components.TopBarGirl

@Composable
fun SelectRoutinesGirlScreen(onListNavigate: () -> Unit) {
  MyApplicationTheme {
    Scaffold(
      topBar = { TopBarGirl(title = "Routine") },
      bottomBar = { BottomAppBarGirl(title = "Adicionar", onClick = onListNavigate) }
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
            CardRoutineSelect(
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
          CardRoutineSelect(
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
          CardRoutineSelect(
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
          CardRoutineSelect(
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
          CardRoutineSelect(
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
          CardRoutineSelect(
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
          CardRoutineSelect(
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
          CardRoutineSelect(
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
          CardRoutineSelect(
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
          CardRoutineSelect(
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
          CardRoutineSelect(
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
          CardRoutineSelect(
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
          CardRoutineSelect(
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
          CardRoutineSelect(
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
          CardRoutineSelect(
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
          CardRoutineSelect(
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
          CardRoutineSelect(
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
          CardRoutineSelect(
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
fun SelectRoutineScreenPreview() {
  SelectRoutinesGirlScreen {}
}
