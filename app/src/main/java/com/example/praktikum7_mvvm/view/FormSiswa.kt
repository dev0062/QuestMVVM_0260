package com.example.praktikum7_mvvm.view

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import com.example.praktikum7_mvvm.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormSiswa(
    //edit 1 : parameter pilihanJK dan onSubmitButtonClicked
    pilihanJK: List<String>,
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    modifier: Modifier = Modifier
){
    Scaffold(modifier = Modifier,
        { TopAppBar(title = { Text(stringResource(id = R.string.app_name), color = Color.White)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(colorResource(id = R.color.purple_500))
        )
        }) { isiRuang ->

        Column(
            modifier = Modifier.padding(isiRuang),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
        }
    }
}
