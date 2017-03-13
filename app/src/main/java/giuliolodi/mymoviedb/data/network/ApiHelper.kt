package giuliolodi.mymoviedb.data.network

import giuliolodi.mymoviedb.data.network.model.DiscoverMovieResult
import io.reactivex.Observable

interface ApiHelper {

    fun discoverMovies(): Observable<DiscoverMovieResult>

}