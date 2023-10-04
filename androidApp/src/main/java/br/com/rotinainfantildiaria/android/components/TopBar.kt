package br.com.rotinainfantildiaria.android.components

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TopBar() {
  TopAppBar() {
    Text(text = "Routine")

  }
}

@Preview
@Composable
fun TopBarPreview() {
  TopBar()
}

