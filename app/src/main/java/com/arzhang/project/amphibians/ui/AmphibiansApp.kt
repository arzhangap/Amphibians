package com.arzhang.project.amphibians.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.lifecycle.viewmodel.compose.viewModel
import com.arzhang.project.amphibians.ui.screens.AmphibiansViewModel
import com.arzhang.project.amphibians.ui.screens.HomeScreen

@Composable
fun AmphibiansApp() {
        Surface(
            modifier = Modifier
                .fillMaxSize()
        ) {
            val amphibiansViewModel: AmphibiansViewModel =
                viewModel(factory = AmphibiansViewModel.Factory)
            HomeScreen(
                amphibianUiState = amphibiansViewModel.amphibianUiState,
                retryAction = amphibiansViewModel::getAmphibianData
            )
        }
    }
