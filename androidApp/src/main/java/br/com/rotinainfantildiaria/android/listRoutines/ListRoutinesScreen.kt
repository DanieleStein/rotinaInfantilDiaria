package br.com.rotinainfantildiaria.android.listRoutines

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.rotinainfantildiaria.android.MyApplicationTheme
import br.com.rotinainfantildiaria.android.components.BottomAppBarHome

@Composable
fun ListRoutinesScreen(onBack: () -> Unit) {
  MyApplicationTheme {
    Scaffold(
      bottomBar = { BottomAppBarHome(title = "Voltar", onClick = onBack) }
    ) {
      LazyColumn(
        modifier = Modifier
          .padding(16.dp)
          .padding(it)
      ) {

      }
    }
  }
}

@Preview
@Composable
fun ListRoutinesScreenPreview() {
  ListRoutinesScreen(onBack = {})
}

