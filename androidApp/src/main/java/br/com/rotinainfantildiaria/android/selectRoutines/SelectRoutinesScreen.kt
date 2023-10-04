package br.com.rotinainfantildiaria.android.selectRoutines

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.rotinainfantildiaria.android.MyApplicationTheme

@Composable
fun SelectRoutinesScreen(onBack: () -> Unit) {

  MyApplicationTheme() {
    Surface(
      modifier = Modifier.fillMaxSize(),
      color = Color(0xFFFFEDED)
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
        }

        item {
          Button(onClick = onBack) {
            Text(text = "Voltar")
          }
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
