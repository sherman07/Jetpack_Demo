package com.example.jetpack_demo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Email(emailData: EmailData){
    Column(modifier = Modifier.padding(20.dp)) {
        Text(text = emailData.title, color = Color.Blue)

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = emailData.message)

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = emailData.regards)

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = emailData.endName)

    }

}
