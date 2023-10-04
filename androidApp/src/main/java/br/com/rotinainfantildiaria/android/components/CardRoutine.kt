package br.com.rotinainfantildiaria.android.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CardRoutine(routine: String, image: @Composable () -> Unit) {
  Column(
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier
      .background(Color.White)
      .padding(horizontal = 115.dp, vertical = 35.dp)
  ) {
    Card() {
      Row() {
        Column() {
          image()
        }

        Spacer(modifier = Modifier.width(20.dp))
        Text(text = routine)
      }
    }
  }
}

@Preview
@Composable
fun CardRoutinePreview() {
  CardRoutine(routine = "Teste", image = {})
}


