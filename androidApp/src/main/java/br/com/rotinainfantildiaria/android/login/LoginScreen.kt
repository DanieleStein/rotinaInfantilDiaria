package br.com.rotinainfantildiaria.android.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.rotinainfantildiaria.android.MyApplicationTheme
import br.com.rotinainfantildiaria.android.R
import br.com.rotinainfantildiaria.android.components.AlertDialogComponent

@Composable
fun LoginScreen() {

  val email = remember { mutableStateOf(TextFieldValue()) }
  val senha = remember { mutableStateOf(TextFieldValue()) }
  val showDialog = remember { mutableStateOf(false) }

  MyApplicationTheme() {
    Surface(
      modifier = Modifier.fillMaxSize(),
      //color = Color(0xFFFFEDED)
    ) {

      Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
      ) {

        Image(
          painter = painterResource(R.drawable.routine2),
          contentDescription = "Routine",
          contentScale = ContentScale.FillWidth,
          modifier = Modifier.width(300.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
          modifier = Modifier.fillMaxWidth(),
          label = { Text(text = "Email") },
          value = email.value,
          onValueChange = { email.value = it },
          keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )

        OutlinedTextField(
          modifier = Modifier.fillMaxWidth(),
          label = { Text(text = "Senha") },
          value = senha.value,
          onValueChange = { senha.value = it },
          keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )

        Row(
          verticalAlignment = Alignment.CenterVertically
        ) {
          TextButton(
            onClick = { /*TODO*/ }) {
            Text(
              text = "CADASTRAR CONTA",
              fontSize = 12.sp,
              color = Color(0xFFF46799)
            )
          }

          Spacer(modifier = Modifier.weight(1f))
          TextButton(
            onClick = { /*TODO*/ }) {
            Text(
              text = "ESQUECI SENHA",
              fontSize = 12.sp,
              color = Color(0xFFF46799)
            )
          }
        }

        Button(
          onClick = { showDialog.value = true },
          colors = ButtonDefaults.buttonColors(Color(0xFFFDE9AA)),
          modifier = Modifier.fillMaxWidth()
        ) {
          Text(text = "Entrar", color = Color(0xFFF46799))
        }
        AlertDialogComponent(showDialog = showDialog, email = email)
      }
    }
  }
}

@Preview
@Composable
fun LoginScreenPreview() {
  LoginScreen()
}
