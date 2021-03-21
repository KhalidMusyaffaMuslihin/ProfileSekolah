package com.example.profilesekolah.fragments.retrofit

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitService {
    // fungsi HttpLoggingInterceptor adalah mengecek status response dari server
    // keterangan status server di LogCat :
    // 200 = respose sukses
    // 404 = url not found
    // 401 = tidak ada otorisasi / API Key belum dimasukkan
    // 500 = Masalah di server
//    private fun interceptor(): Interceptor {
//        val interceptor = HttpLoggingInterceptor()
//        interceptor.level = HttpLoggingInterceptor.Level.BASIC
//        return interceptor
//    }

    // client bertugas sebagai alat penghubung ke server
    // di sini tempat kita memasukkan Interceptor
    private val client = OkHttpClient.Builder()
//        .addInterceptor(interceptor())
        .build()

    // retrofit bertugas sebagai pengatur client
    private val retrofit = Retrofit.Builder()
        // masukkan baseUrl sesuai alamat server
        .baseUrl("https://newsapi.org/")
        .addConverterFactory(MoshiConverterFactory.create())
            //masukan client yang digunakan
        .client(client)
        .build()


    fun <T> buildService(service: Class<T>): T {
        return retrofit.create(service)
    }
}

