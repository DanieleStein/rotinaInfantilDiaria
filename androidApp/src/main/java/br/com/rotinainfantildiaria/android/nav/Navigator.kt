package br.com.rotinainfantildiaria.android.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.rotinainfantildiaria.android.login.LoginScreen
import br.com.rotinainfantildiaria.android.selectRoutines.SelectRoutinesScreen


enum class Route {
  LOGIN, HOME
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
      LoginScreen { navHostController.navigate(Route.HOME.name) }
    }

    composable(Route.HOME.name) {
      SelectRoutinesScreen { navHostController.popBackStack() }
    }

  }

}
