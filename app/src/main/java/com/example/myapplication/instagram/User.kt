package com.example.myapplication.instagram

import java.io.Serializable

class User(
        var username: String? = null,
        var token: String? = null
) : Serializable