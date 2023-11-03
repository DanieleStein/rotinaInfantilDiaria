package br.com.rotinainfantildiaria.android.selectGender

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import br.com.rotinainfantildiaria.android.MyApplicationTheme
import br.com.rotinainfantildiaria.android.ui.theme.blueDisabled
import br.com.rotinainfantildiaria.android.ui.theme.blueSelected
import br.com.rotinainfantildiaria.android.ui.theme.pinkDisabled
import br.com.rotinainfantildiaria.android.ui.theme.pinkSelected

@Composable
fun SelectGenderScreen(selectedGenderNavigate: () -> Unit) {
  MyApplicationTheme {
    Scaffold(
    ) {
      Column(
        modifier = Modifier
          .padding(it)
          .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
      ) {

        val menina = remember { mutableStateOf(false) }
        val menino = remember { mutableStateOf(false) }

        Row(
          verticalAlignment = Alignment.CenterVertically
        ) {
          RadioButton(
            selected = menina.value,
            onClick = { menina.value = menina.value.not() },
            colors = RadioButtonDefaults.colors(
              unselectedColor = pinkDisabled,
              selectedColor = pinkSelected
            )
          )
          Text(text = "Menina", fontFamily = FontFamily.Cursive, fontSize = 30.sp, fontWeight = FontWeight.Bold, color = pinkSelected)
        }

        Row(
          verticalAlignment = Alignment.CenterVertically
        ) {
          RadioButton(
            selected = menino.value,
            onClick = { menino.value = menino.value.not() },
            colors = RadioButtonDefaults.colors(
              unselectedColor = blueDisabled,
              selectedColor = blueSelected
            )
          )
          Text(text = "Menino", fontFamily = FontFamily.Cursive, fontSize = 30.sp, fontWeight = FontWeight.Bold, color = blueSelected)
        }

        Button(onClick = {
          if(menina.value) {
            selectedGenderNavigate
          }
          if (menino.value) {

          }
        }) {

        }
      }
    }
  }
}


@Preview
@Composable
fun SelectGenderScreenPreview() {
  SelectGenderScreen {}
}
