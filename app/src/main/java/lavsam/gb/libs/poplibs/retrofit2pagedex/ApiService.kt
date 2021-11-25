package lavsam.gb.libs.poplibs.retrofit2pagedex

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

//    @GET("users")
//    @GET("pokemon")
    @GET("3/discover/movie?language=en&sort_by=popularity.desc&api_key=dc14a9f3b0182612c3b5a4e43393fb15")

    fun getUsers(@Query("page") page:Int): Call<UserResponse>

}