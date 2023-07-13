package com.example.quizRenja2010046.App
import com.example.quizRenja2010046.Model.MahasiswaModel
import com.example.quizRenja2010046.Model.ResponModel
import retrofit2.Call
import retrofit2.http.*
interface ApiService {
    @FormUrlEncoded
    @POST("mahasiswa/save")
    fun saveBarang(
        @Body data: MahasiswaModel,
    ):Call<ResponModel>
    @GET("mahasiswa")
    fun getMahasiswa():Call<ResponModel>
}

