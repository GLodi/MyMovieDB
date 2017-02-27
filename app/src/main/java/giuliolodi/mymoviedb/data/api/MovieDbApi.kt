package giuliolodi.mymoviedb.data.api

import retrofit2.http.GET
import retrofit2.http.QueryMap
import rx.Observable

interface MovieDbApi {

    @GET("/3/discover/movie")
    fun getMovies(@QueryMap map: Map<String,String>): Observable<Response>

}