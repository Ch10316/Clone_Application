package com.example.myapplication.instagram

import java.io.Serializable

class Register(
        var username: String? = null,
        var password1: String? = null,
        var password2: String? = null
) : Serializable