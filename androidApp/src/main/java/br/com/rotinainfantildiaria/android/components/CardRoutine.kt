package br.com.rotinainfantildiaria.android.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.rotinainfantildiaria.android.R
import br.com.rotinainfantildiaria.android.ui.theme.blue
import br.com.rotinainfantildiaria.android.ui.theme.blueDisabled
import br.com.rotinainfantildiaria.android.ui.theme.pink
import br.com.rotinainfantildiaria.android.ui.theme.pinkBackground
import br.com.rotinainfantildiaria.android.ui.theme.pinkWriting

@Composable
fun CardRoutineSelect(routine: String, image: @Composable () -> Unit) {
  Card {
    val checkedState = remember { mutableStateOf(false) }

    Row(
      verticalAlignment = Alignment.CenterVertically,
      modifier = Modifier
        .background((pink))
        .fillMaxWidth()
        .height(56.dp)
        //.toggleable(
        //value = checkedState,
        //onValueChange = { onStateChange(!checkedState) },
        //role = Role.Checkbox
        //)
        .padding(horizontal = 3.dp, vertical = 3.dp)
        .padding(end = 5.dp)
    ) {
      Column(
        verticalArrangement = Arrangement.Center,
      ) {
        image()
      }
      Spacer(modifier = Modifier.width(15.dp))
      Text(
        text = routine,
        fontSize = 20.sp,
        fontFamily = FontFamily.Cursive,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        color = Color.White
      )
      Spacer(modifier = Modifier.weight(1f))
      Checkbox(
        checked = checkedState.value,
        onCheckedChange = { checkedState.value = it },
        colors = CheckboxDefaults.colors(
          checkedColor = pinkWriting,
          uncheckedColor = Color.White,
          checkmarkColor = Color.White
        )
      )
    }
  }
}

@Composable
fun CardRoutineSelect2(routine: String, image: @Composable () -> Unit) {
  Card {
    val checkedState = remember { mutableStateOf(false) }

    Row(
      verticalAlignment = Alignment.CenterVertically,
      modifier = Modifier
        .background((blue))
        .fillMaxWidth()
        .height(56.dp)
        //.toggleable(
        //value = checkedState,
        //onValueChange = { onStateChange(!checkedState) },
        //role = Role.Checkbox
        //)
        .padding(horizontal = 3.dp, vertical = 3.dp)
        .padding(end = 5.dp)
    ) {
      Column(
        verticalArrangement = Arrangement.Center,
      ) {
        image()
      }
      Spacer(modifier = Modifier.width(15.dp))
      Text(
        text = routine,
        fontSize = 20.sp,
        fontFamily = FontFamily.Cursive,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        color = Color.White
      )
      Spacer(modifier = Modifier.weight(1f))
      Checkbox(
        checked = checkedState.value,
        onCheckedChange = { checkedState.value = it },
        colors = CheckboxDefaults.colors(
          checkedColor = blueDisabled,
          uncheckedColor = Color.White,
          checkmarkColor = Color.White
        )
      )
    }
  }
}


@Composable
fun CardRoutineListGirl(routine: String, image: @Composable () -> Unit) {
  Card {
    Row(
      verticalAlignment = Alignment.CenterVertically,
      modifier = Modifier
        .background((pink))
        .fillMaxWidth()
        .height(56.dp)
        .padding(horizontal = 3.dp, vertical = 3.dp)
        .padding(end = 5.dp)
    ) {
      Column(
        verticalArrangement = Arrangement.Center,
      ) {
        image()
      }
      Spacer(modifier = Modifier.width(15.dp))
      Text(
        text = routine,
        fontSize = 20.sp,
        fontFamily = FontFamily.Cursive,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        color = Color.White
      )
    }
  }
}

@Composable
fun CardRoutineListBoy(routine: String, image: @Composable () -> Unit) {
  Card {
    Row(
      verticalAlignment = Alignment.CenterVertically,
      modifier = Modifier
        .background((blue))
        .fillMaxWidth()
        .height(56.dp)
        .padding(horizontal = 3.dp, vertical = 3.dp)
        .padding(end = 5.dp)
    ) {
      Column(
        verticalArrangement = Arrangement.Center,
      ) {
        image()
      }
      Spacer(modifier = Modifier.width(15.dp))
      Text(
        text = routine,
        fontSize = 20.sp,
        fontFamily = FontFamily.Cursive,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        color = Color.White
      )
    }
  }
}




@Preview
@Composable
fun CardRoutineSelectPreview() {
  CardRoutineSelect(
    routine = "Ir ao banheiro",
    image = {
      Image(
        modifier = Modifier.width(50.dp),
        painter = painterResource(id = R.drawable.banheiro3),
        contentDescription = "banheiro",
        alignment = Alignment.Center,
        contentScale = ContentScale.FillWidth
      )
    }
  )
}

@Preview
@Composable
fun CardRoutineSelect2Preview() {
  CardRoutineSelect2(
    routine = "Ir ao banheiro",
    image = {
      Image(
        modifier = Modifier.width(50.dp),
        painter = painterResource(id = R.drawable.banheiro3),
        contentDescription = "banheiro",
        alignment = Alignment.Center,
        contentScale = ContentScale.FillWidth
      )
    }
  )
}

@Preview
@Composable
fun CardRoutineListGirlPreview() {
  CardRoutineListGirl(
    routine = "Ir ao banheiro",
    image = {
      Image(
        modifier = Modifier.width(50.dp),
        painter = painterResource(id = R.drawable.banheiro3),
        contentDescription = "banheiro",
        alignment = Alignment.Center,
        contentScale = ContentScale.FillWidth
      )
    }
  )
}

@Preview
@Composable
fun CardRoutineListBoyPreview() {
  CardRoutineListBoy(
    routine = "Ir ao banheiro",
    image = {
      Image(
        modifier = Modifier.width(50.dp),
        painter = painterResource(id = R.drawable.banheiro3),
        contentDescription = "banheiro",
        alignment = Alignment.Center,
        contentScale = ContentScale.FillWidth
      )
    }
  )
}


