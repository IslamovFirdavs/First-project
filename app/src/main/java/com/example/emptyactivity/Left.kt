package com.example.emptyactivity

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun LeftPage(
    navController: NavController
) {
    Row(
        modifier = Modifier.padding(top = 250.dp)
    ) {
        Image(
            modifier = Modifier.width(300.dp).height(300.dp).rotate(180f),
            painter = painterResource(id = R.drawable.pxi2),
            contentDescription = null
        )
    }
}