package com.example.testapplication

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class person(var name: String, var family: String) {

}

@JsonClass(generateAdapter = true)
class Repo(@Json(name = "id") val id: Long) {
    @Json(name = "name")
    lateinit var name: String

    @Json(name = "full_name")
    var fullName: String? = null

    @Json(name = "html_url")
    var htmlUrl: String = ""

    @Json(name = "private")
    var private: Boolean = false
}


