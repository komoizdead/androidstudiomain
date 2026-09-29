package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.example.myapplication.ui.*
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    private val viewModel: HomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                val currentScreen by viewModel.currentScreen.collectAsState()

                when (currentScreen) {
                    is Screen.Home -> HomeScreen(
                        onNavigate = { screen -> viewModel.navigateTo(screen) }
                    )
                    is Screen.Alphabet -> AlphabetScreen(
                        onBack = { viewModel.navigateBack() }
                    )
                    is Screen.Number -> NumberScreen(
                        onBack = { viewModel.navigateBack() }
                    )
                    is Screen.Color -> ColorScreen(
                        onBack = { viewModel.navigateBack() }
                    )
                }
            }
        }
    }
}
