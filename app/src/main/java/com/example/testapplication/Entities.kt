package com.example.testapplication

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class person(var name: String, var family: String) {

}

@JsonClass(generateAdapter = true)
class Repo(@Json(name = "id") val id: Long) {
    @Json(name = "name")
    var name: String? = null

    @Json(name = "full_name")
    var fullName: String? = null

    @Json(name = "private")
    var private: Boolean = false
}


