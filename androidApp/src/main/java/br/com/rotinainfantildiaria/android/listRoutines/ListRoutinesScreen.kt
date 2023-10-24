package br.com.rotinainfantildiaria.android.listRoutines

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.rotinainfantildiaria.android.MyApplicationTheme
import br.com.rotinainfantildiaria.android.components.CardRoutineList
import br.com.rotinainfantildiaria.android.components.FloatingButton
import br.com.rotinainfantildiaria.android.components.TopBarList

@Composable
fun ListRoutinesScreen(onSelectNavigate: () -> Unit) {
  MyApplicationTheme {
    Scaffold(
      floatingActionButton = { FloatingButton(onClick = onSelectNavigate) },
      topBar = { TopBarList(title = "Routine") }
    ) {
      LazyColumn(
        modifier = Modifier
          .padding(16.dp)
          .padding(it)
      ) {
        item { 
          CardRoutineList(routine = "Ir ao banheiro") {

          }
        }

      }
    }
  }
}

@Preview
@Composable
fun ListRoutinesScreenPreview() {
  ListRoutinesScreen(onSelectNavigate = {})
}

