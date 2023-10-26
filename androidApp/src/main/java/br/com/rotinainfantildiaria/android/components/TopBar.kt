package br.com.rotinainfantildiaria.android.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.rotinainfantildiaria.android.R
import br.com.rotinainfantildiaria.android.ui.theme.pinkWriting
import br.com.rotinainfantildiaria.android.ui.theme.yellow

@Composable
fun TopBarSelect(title: String) {
  TopAppBar(
    backgroundColor = yellow,
    /*navigationIcon = {
      IconButton(onClick = { /*TODO*/ }) {
        Icon(Icons.Filled.Menu, "Menu", tint = pinkWriting)
      }
    }*/
    title = {
      Text(
        text = title,
        color = pinkWriting,
        fontFamily = FontFamily.Cursive,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp,
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center
      )
    },
    actions = {
      IconButton(onClick = { /*TODO*/ }) {
        Image(
          imageVector = ImageVector.vectorResource(R.drawable.ic_profile),
          contentDescription = "profile",
          contentScale = ContentScale.FillWidth,
          modifier = Modifier.size(30.dp),
          colorFilter = ColorFilter.tint(color = pinkWriting)
        )
      }
    }
  )
}

@Composable
fun BottomAppBarSelect(title: String, onClick: () -> Unit) {
  BottomAppBar(
    backgroundColor = yellow
  ) {
    TextButton(onClick = onClick) {
      Text(
        text = title,
        color = pinkWriting,
        fontFamily = FontFamily.Cursive,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp,
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.End

      )
    }
  }
}

@Composable
fun TopBarList(title: String) {
  TopAppBar(
    backgroundColor = yellow
  ) {
    Text(
      text = title,
      color = (pinkWriting),
      fontSize = 30.sp,
      fontWeight = FontWeight.Bold,
      fontFamily = FontFamily.Cursive,
      modifier = Modifier.fillMaxWidth(),
      textAlign = TextAlign.Center
    )
  }
}

@Composable
fun FloatingButton(onClick: () -> Unit) {
  FloatingActionButton(
    onClick = onClick,
    backgroundColor = yellow,
  ) {
    Image(
      imageVector = ImageVector.vectorResource(R.drawable.ic_add),
      contentDescription = "adicionar",
      modifier = Modifier.size(40.dp),
      colorFilter = ColorFilter.tint(pinkWriting)
    )
  }
}


@Preview
@Composable
fun TopBarSelectPreview() {
  TopBarSelect("Routine")
}

@Preview
@Composable
fun BottomAppBarSelectPreview() {
  BottomAppBarSelect("Confirmar", onClick = {})
}

@Preview
@Composable
fun TopBarListPreview() {
  TopBarList(title = "Routine")
}

@Preview
@Composable
fun FloatingButtonPreview() {
  FloatingButton {}
}

