package com.example.libraryapp

data class Book (
    var title : String = "",
    var type : String = "",
    var writer : String = "",
    var description : String = "",
    var cover : Int = 0,
    var rateBar : Float = 0.0F,
    var rateValue : Float = 0.0F
)

data class WishBook (
    var title : String = "",
    var writer : String = "",
    var cover : Int = 0
)