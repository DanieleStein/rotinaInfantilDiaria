package br.com.rotinainfantildiaria.android.components

import androidx.compose.material.AlertDialog
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun AlertDialogComponent(
  showDialog: Boolean,
  mensagem: String,
  onDismissRequest: () -> Unit
) {
  if (showDialog) {
    AlertDialog(
      contentColor = Color.White,
      backgroundColor = Color(0xFFFDE9AA),
      title = { Text(text = "Mensagem de Erro", color = Color.Red) },
      text = { Text(text = "$mensagem", color = Color(0xFFF46799)) },
      onDismissRequest = onDismissRequest,
      confirmButton = { TextButton(onClick = onDismissRequest) { Text(text = "Ok", color = Color(0xFFF46799) )}}
    )
  }
}

@Preview
@Composable
fun AlertDialogComponentPreview() {
  AlertDialogComponent(showDialog = true, mensagem = "Test", {})
}

