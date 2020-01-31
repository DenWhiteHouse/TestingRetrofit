package network

import retrofit2.http.GET

interface RetrofitService {

    @GET("/test")
    fun getTests():TestDto

}
