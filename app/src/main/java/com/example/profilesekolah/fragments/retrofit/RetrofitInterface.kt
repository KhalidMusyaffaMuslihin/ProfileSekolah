package com.example.profilesekolah.fragments.retrofit

import retrofit2.Response
import retrofit2.http.GET

/**
 *
 *
 * retrofitinterfaces digunakan untuk menemukan alamat lengkap dari url
 */

interface RetrofitInterface {

    @GET( "data/eksul.json")
    fun getDataEksul()


}