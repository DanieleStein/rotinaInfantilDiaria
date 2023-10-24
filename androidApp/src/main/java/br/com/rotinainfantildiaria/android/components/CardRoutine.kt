package br.com.rotinainfantildiaria.android.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.FilterChip
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.rotinainfantildiaria.android.R
import br.com.rotinainfantildiaria.android.ui.theme.pinkBackground
import br.com.rotinainfantildiaria.android.ui.theme.pinkWriting

@Composable
fun CardRoutine(routine: String, image: @Composable () -> Unit) {
  Card {
    val checkedState = rememberSaveable { mutableStateOf(false) }

    Row(
      verticalAlignment = Alignment.CenterVertically,
      modifier = Modifier
        .background((pinkBackground))
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
        textAlign = TextAlign.Center
      )
      Spacer(modifier = Modifier.weight(1f))
      Checkbox(
        checked = checkedState.value,
        onCheckedChange = { checkedState.value = it },
        colors = CheckboxDefaults.colors(pinkWriting)
      )
    }
  }
}


@OptIn(ExperimentalMaterialApi::class, ExperimentalMaterial3Api::class)
@Composable
fun CardRoutineList(routine: String, image: @Composable () -> Unit) {

  var selected by rememberSaveable { mutableStateOf(false) }

  FilterChip(
    selected = selected,
    onClick = { selected = !selected },
    leadingIcon = {
      if (selected) {
        Icon(
          imageVector = Icons.Filled.Done,
          contentDescription = "Done icon",
          modifier = Modifier.size(FilterChipDefaults.IconSize)
        )
    }
    }
  ) {
    Card {
      Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
          .background((pinkBackground))
          .fillMaxWidth()
          .height(56.dp)
          .padding(horizontal = 3.dp, vertical = 3.dp)
          //.padding(end = 5.dp)
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
          textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.weight(1f))

      }
    }
  }
}


@Preview
@Composable
fun CardRoutinePreview() {
  CardRoutine(
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
fun CardRoutineListPreview() {
  CardRoutineList(
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


