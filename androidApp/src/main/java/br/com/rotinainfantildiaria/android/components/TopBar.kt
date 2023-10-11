package br.com.rotinainfantildiaria.android.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.rotinainfantildiaria.android.R

@Composable
fun TopBarHome(title: String) {
  TopAppBar(
    backgroundColor = Color(0xFFFDE9AA),
    navigationIcon = {
      IconButton(onClick = { /*TODO*/ }) {
        Icon(Icons.Filled.Menu, "Menu", tint = Color(0xFFF46799))
      }
    },
    title = {
      Text(
        text = title,
        color = Color(0xFFF46799),
        fontFamily = FontFamily.Cursive,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp
      )
    },
    actions = {
      IconButton(onClick = { /*TODO*/ }) {
        Image(
          painter = painterResource(R.drawable.ic_profile),
          contentDescription = "profile",
          contentScale = ContentScale.FillWidth,
          modifier = Modifier.size(30.dp),
          colorFilter = ColorFilter.tint(color = Color(0xFFF46799))
        )
      }
    }
  )
}

@Composable
fun BottomAppBarHome(title: String, onClick: () -> Unit) {
  BottomAppBar(
    backgroundColor = Color(0xFFFDE9AA)
  ) {
    TextButton(onClick = onClick) {
      Text(
        text = title,
        color = Color(0xFFF46799),
        fontFamily = FontFamily.Cursive,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp,
        textAlign = TextAlign.End,
        modifier = Modifier.fillMaxWidth()
      )
    }
  }
}





@Preview
@Composable
fun TopBarPerfilPreview() {
  TopBarHome("Routine")
}

@Preview
@Composable
fun BottomAppBarHomePreview() {
  BottomAppBarHome("Confirmar", onClick = {})
}

