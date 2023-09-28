package br.com.rotinainfantildiaria.android.selectRoutines

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.rotinainfantildiaria.android.MyApplicationTheme

@Composable
fun SelectRoutinesScreen() {

  MyApplicationTheme() {
    Surface(
      modifier = Modifier.fillMaxSize(),
      color = Color(0xFFFFEDED)
    ) {

      LazyColumn(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
      ) {

        item {
          OutlinedTextField(value = "Ioodnd", onValueChange = {}, modifier = Modifier.fillMaxWidth())
        }

      }
    }
  }
}

@Preview
@Composable
fun SelectRoutineScreenPreview() {
  SelectRoutinesScreen()
}
