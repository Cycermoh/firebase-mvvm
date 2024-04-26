package com.maureen.firebase_morning.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambda
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
//import com.maureen.firebase_morning.ui.theme.screens.home.HomeScreen
import com.maureen.firebase_morning.ui.theme.screens.home.Homescreen
import com.maureen.firebase_morning.ui.theme.screens.login.LoginScreen
import com.maureen.firebase_morning.ui.theme.screens.produictus.UpdateProductsScreen
import com.maureen.firebase_morning.ui.theme.screens.produictus.ViewProductsScreen
import com.maureen.firebase_morning.ui.theme.screens.produictus.ViewUploadsScreen
//import com.maureen.firebase_morning.ui.theme.screens.produictus.AddProductsScreen
//import com.maureen.firebase_morning.ui.theme.screens.produictus.UpdateProductsScreen
//import com.maureen.firebase_morning.ui.theme.screens.produictus.ViewProductsScreen
//import com.maureen.firebase_morning.ui.theme.screens.produictus.ViewUploadsScreen
import com.maureen.firebase_morning.ui.theme.screens.register.RegisterScreen


@Composable
fun AppNavHost(modifier: Modifier =Modifier, navController: NavHostController = rememberNavController(), startDestination:String= ROUTE_LOGIN) {

    NavHost(
        navController = navController,
        modifier = Modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_LOGIN) {
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER) {
            RegisterScreen(navController)
        }

        composable(ROUTE_HOME) {
            Homescreen(navController)
        }
        composable(ROUTE_LOGIN) {
            LoginScreen(navController)
        }
        composable(ROUTE_VIEW_PRODUCT) {
            ViewProductsScreen(navController)
        }
        composable("$ROUTE_UPDATE_PRODUCT/{id}") { passedData ->
            UpdateProductsScreen(navController, passedData.arguments?.getString("id")!!)
        }
        composable(ROUTE_VIEW_UPLOAD) {
            ViewUploadsScreen(navController)
//        }
    }
//
//

        }
    }
