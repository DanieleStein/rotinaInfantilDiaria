package br.com.rotinainfantildiaria.android.selectRoutines

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.rotinainfantildiaria.android.MyApplicationTheme
import br.com.rotinainfantildiaria.android.components.BottomAppBarSelect
import br.com.rotinainfantildiaria.android.components.TopBarSelect

@Composable
fun SelectRoutinesBoyScreen() {
  MyApplicationTheme {
    Scaffold(
      topBar = { TopBarSelect(title = "Routine") },
      bottomBar = { BottomAppBarSelect(title = "Adicionar", onClick = {}) }
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
fun SelectRoyinesBoyScreenPreview() {
  SelectRoutinesBoyScreen()
}
