package br.com.rotinainfantildiaria.android.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.rotinainfantildiaria.android.MyApplicationTheme
import br.com.rotinainfantildiaria.android.R

@Composable
fun LoginScreen() {

  val email = remember { mutableStateOf(TextFieldValue()) }
  val senha = remember { mutableStateOf(TextFieldValue()) }

  MyApplicationTheme() {
    Surface(
      color = Color(0XFFFFEDED),
      modifier = Modifier.fillMaxSize(),

    )
    {
      Column(
        modifier = Modifier
          .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

      ) {

        Image(
          painter = painterResource(R.drawable.routine),
          contentDescription = "Routine")

        Text(
          text = "Rotina Diária Infantil",
          color = Color.White,
          fontWeight = FontWeight.Bold,
          fontSize = 32.sp)

        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
          modifier = Modifier.fillMaxWidth(),
          label = {Text(text = "Email")},
          value = email.value,
          onValueChange = {email.value = it}
          )

        OutlinedTextField(
          modifier = Modifier.fillMaxWidth(),
          label = {Text(text = "Senha")},
          value = senha.value,
          onValueChange = {senha.value = it})

        Spacer(modifier = Modifier.height(5.dp))
        Button(onClick = { /*TODO*/ }) {
          Text(text = "Entrar")
        }
      }
    }
  }
}

@Preview
@Composable
fun LoginScreenPreview() {
  LoginScreen()
}
