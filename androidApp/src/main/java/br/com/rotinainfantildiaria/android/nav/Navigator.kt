package br.com.rotinainfantildiaria.android.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.rotinainfantildiaria.android.listRoutines.ListRoutinesBoyScreen
import br.com.rotinainfantildiaria.android.listRoutines.ListRoutinesGirlScreen
import br.com.rotinainfantildiaria.android.login.LoginScreen
import br.com.rotinainfantildiaria.android.selectGender.SelectGenderScreen
import br.com.rotinainfantildiaria.android.selectRoutines.SelectRoutinesBoyScreen
import br.com.rotinainfantildiaria.android.selectRoutines.SelectRoutinesGirlScreen


enum class Route {
  LOGIN, SELECT, LIST, GENDER, LISTB, SELECTB
}


@Composable
fun Navigator(
  navHostController: NavHostController = rememberNavController(),
  initial: Route = Route.LOGIN
) {
  NavHost(
    navController = navHostController,
    startDestination = initial.name
  ) {

    composable(Route.LOGIN.name) {
      LoginScreen { navHostController.navigate(Route.GENDER.name) }
    }

    composable(Route.GENDER.name) {
      SelectGenderScreen(
        selectedGenderBoyNavigate = { navHostController.navigate(Route.LISTB.name) },
        selectedGenderGirlNavigate = { navHostController.navigate(Route.LIST.name) }
      )
    }

    composable(Route.LIST.name) {
      ListRoutinesGirlScreen { navHostController.navigate(Route.SELECT.name) }
    }

    composable(Route.SELECT.name) {
      SelectRoutinesGirlScreen { navHostController.navigate(Route.LIST.name) }
    }

    composable(Route.LISTB.name) {
      ListRoutinesBoyScreen { navHostController.navigate(Route.SELECTB.name) }
    }

    composable(Route.SELECTB.name) {
      SelectRoutinesBoyScreen { navHostController.navigate(Route.LISTB.name) }
    }

  }
}
