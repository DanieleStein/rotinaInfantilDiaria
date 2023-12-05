package br.com.rotinainfantildiaria.android.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
import br.com.rotinainfantildiaria.android.ui.theme.violet

@Composable
fun TopBarGirl(title: String) {
  TopAppBar(
    backgroundColor = violet,
    /*navigationIcon = {
      IconButton(onClick = { /*TODO*/ }) {
        Icon(Icons.Filled.Menu, "Menu", tint = pinkWriting)
      }
    }*/
    title = {
      Text(
        text = title,
        color = Color.White,
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
          colorFilter = ColorFilter.tint(color = Color.White)
        )
      }
    }
  )
}

@Composable
fun BottomAppBarGirl(title: String, onClick: () -> Unit) {
  BottomAppBar(
    backgroundColor = violet
  ) {
    TextButton(onClick = onClick) {
      Text(
        text = title,
        color = Color.White,
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
fun FloatingButtonGirl(onClick: () -> Unit) {
  FloatingActionButton(
    onClick = onClick,
    backgroundColor = violet,
  ) {
    Image(
      imageVector = ImageVector.vectorResource(R.drawable.ic_add),
      contentDescription = "adicionar",
      modifier = Modifier.size(40.dp),
      colorFilter = ColorFilter.tint(Color.White)
    )
  }
}

@Composable
fun TopBarBoy (title: String) {
  TopAppBar(
    backgroundColor = violet,
    /*navigationIcon = {
      IconButton(onClick = { /*TODO*/ }) {
        Icon(Icons.Filled.Menu, "Menu", tint = pinkWriting)
      }
    }*/
    title = {
      Text(
        text = title,
        color = Color.White,
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
          colorFilter = ColorFilter.tint(color = Color.White)
        )
      }
    }
  )
}

@Composable
fun FloatingButtonBoy(onClick: () -> Unit) {
  FloatingActionButton(
    onClick = onClick,
    backgroundColor = violet,
  ) {
    Image(
      imageVector = ImageVector.vectorResource(R.drawable.ic_add),
      contentDescription = "adicionar",
      modifier = Modifier.size(40.dp),
      colorFilter = ColorFilter.tint(Color.White)
    )
  }
}

@Composable
fun BottomAppBarBoy(title: String, onClick: () -> Unit) {
  BottomAppBar(
    backgroundColor = violet
  ) {
    TextButton(onClick = onClick) {
      Text(
        text = title,
        color = Color.White,
        fontFamily = FontFamily.Cursive,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp,
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.End

      )
    }
  }
}


@Preview
@Composable
fun TopBarGirlPreview() {
  TopBarGirl("Routine")
}

@Preview
@Composable
fun BottomAppBarGirltPreview() {
  BottomAppBarGirl("Confirmar", onClick = {})
}

@Preview
@Composable
fun FloatingButtonGirlPreview() {
  FloatingButtonGirl {}
}

@Preview
@Composable
fun TopBarBoyPreview() {
  TopBarBoy(title = "Routine")
}

@Preview
@Composable
fun BottomAppBarBoytPreview() {
  BottomAppBarBoy("Confirmar", onClick = {})
}

@Preview
@Composable
fun FloatingButtonBoyPreview() {
  FloatingButtonBoy {}
}

