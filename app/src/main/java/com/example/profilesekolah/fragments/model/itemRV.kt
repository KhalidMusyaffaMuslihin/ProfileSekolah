package com.example.profilesekolah.fragments.model

import com.squareup.moshi.Json

data class itemRV (

    @Json(name = "urlGambar")
    var urlGambar : String = "",
    @Json(name = "title")
    var title :String = "",
    @Json(name = "description")
    var description :String = "",
    var tipe :String = ""

)
