package br.com.rotinainfantildiaria.android.listRoutines

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.rotinainfantildiaria.android.MyApplicationTheme
import br.com.rotinainfantildiaria.android.components.FloatingButtonGirl
import br.com.rotinainfantildiaria.android.components.TopBarGirl

@Composable
fun ListRoutinesGirlScreen(onSelectNavigate: () -> Unit) {
  MyApplicationTheme {
    Scaffold(
      floatingActionButton = { FloatingButtonGirl(onClick = onSelectNavigate) },
      topBar = { TopBarGirl(title = "Routine") }
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
  ListRoutinesGirlScreen(onSelectNavigate = {})
}

