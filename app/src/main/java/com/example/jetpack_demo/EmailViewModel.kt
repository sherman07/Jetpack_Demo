package com.example.jetpack_demo

import androidx.lifecycle.ViewModel

class EmailViewModel: ViewModel() {

    val email = buildEmailData("Jack", "Jason")
    private fun buildEmailData(toName: String, writerName: String): EmailData{

        return EmailData(

            title = "Hello $toName",
            message = "My name is $writerName, I like to play basketball ...",
            regards = "Thanks",
            endName = writerName
        )
    }
}