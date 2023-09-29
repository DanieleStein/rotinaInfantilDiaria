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
  showDialog: MutableState<Boolean>,
  email: MutableState<TextFieldValue>
) {
  if (showDialog.value) {
    AlertDialog(
      contentColor = Color.White,
      backgroundColor = Color.Black,
      title = { Text(text = "Título") },
      text = { Text(text = "Olá ${email.value.text}") },
      onDismissRequest = { showDialog.value = false },
      confirmButton = {
        TextButton(
          onClick = {
            showDialog.value = false
          })
        {
          Text(text = "Ok")
        }
      }
    )
  }
}

@Preview
@Composable
fun AlertDialogComponentPreview() {
}

