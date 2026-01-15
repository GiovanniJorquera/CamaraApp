package com.example.camaraapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.camaraapp.ui.theme.CamaraAppTheme
import com.example.camaraapp.view.screen.PerfilScreen
import com.example.camaraapp.viewmodel.PerfilViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
        CamaraAppTheme {
            val viewModel: PerfilViewModel = viewModel()
            PerfilScreen(viewModel)
        }

                }
            }
        }



