package br.com.rotinainfantildiaria.android.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.rotinainfantildiaria.android.MyApplicationTheme
import br.com.rotinainfantildiaria.android.R
import br.com.rotinainfantildiaria.android.components.AlertDialogComponent
import br.com.rotinainfantildiaria.android.ui.theme.pinkWriting
import br.com.rotinainfantildiaria.android.ui.theme.yellow
import br.com.rotinainfantildiaria.model.Login

@Composable
fun LoginScreen(onHomeNavigate: () -> Unit) {

  val email = remember { mutableStateOf(TextFieldValue()) }
  val senha = remember { mutableStateOf(TextFieldValue()) }
  val senhaVisivel = remember { mutableStateOf(false) }
  val showDialog = remember { mutableStateOf(false) }

  MyApplicationTheme {
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
          colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = (pinkWriting),
            focusedLabelColor = (pinkWriting),
            unfocusedBorderColor = (pinkWriting),
            unfocusedLabelColor = (pinkWriting)
          ),
          shape = CircleShape,
          label = { Text(text = "E-mail") },
          value = email.value,
          onValueChange = { email.value = it },
          keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )

        OutlinedTextField(
          modifier = Modifier.fillMaxWidth(),
          colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = (pinkWriting),
            focusedLabelColor = (pinkWriting),
            unfocusedBorderColor = (pinkWriting),
            unfocusedLabelColor = (pinkWriting)
          ),
          shape = CircleShape,
          label = { Text(text = "Senha") },
          value = senha.value,
          onValueChange = { senha.value = it },
          keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
          visualTransformation =
          if (senhaVisivel.value.not()) {
            VisualTransformation.None
          } else {
            PasswordVisualTransformation()
          },
          trailingIcon = {
            val description = if (senhaVisivel.value.not()) "Visível" else "Invisível"
            val icone =
              if (senhaVisivel.value.not()) Icons.Filled.Visibility else Icons.Filled.VisibilityOff
            IconButton(onClick = { senhaVisivel.value = senhaVisivel.value.not() }) {
              Icon(imageVector = icone, contentDescription = description, tint = (pinkWriting))
            }
          }
        )

        Row(
          verticalAlignment = Alignment.CenterVertically
        ) {
          TextButton(
            onClick = { /*TODO*/ })
          {
            Text(
              text = "CADASTRAR CONTA",
              fontSize = 12.sp,
              color = (pinkWriting),
            )
          }

          Spacer(modifier = Modifier.weight(1f))
          TextButton(
            onClick = { /*TODO*/ }) {
            Text(
              text = "ESQUECI SENHA",
              fontSize = 12.sp,
              color = (pinkWriting)
            )
          }
        }

        Button(
          shape = CircleShape,
          onClick = {
            val loginUser = Login(
              email = email.value.text,
              senha = senha.value.text
            )
            if (loginUser.validator()) {
              onHomeNavigate()
            } else {
              showDialog.value = true
            }
          },
          colors = ButtonDefaults.buttonColors(yellow),
          modifier = Modifier.fillMaxWidth()
        ) {
          Text(text = "Entrar", color = pinkWriting)
        }

        AlertDialogComponent(
          showDialog = showDialog.value,
          mensagem = "Usuário e, ou senha inválida!",
          onDismissRequest = { showDialog.value = false }
        )
      }
    }
  }
}

@Preview
@Composable
fun LoginScreenPreview() {
  LoginScreen { }
}
