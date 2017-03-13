package giuliolodi.mymoviedb.data.network

import android.content.Context
import com.rx2androidnetworking.Rx2AndroidNetworking
import giuliolodi.mymoviedb.data.network.model.DiscoverMovieResult
import giuliolodi.mymoviedb.di.AppContext
import io.reactivex.Observable
import javax.inject.Inject

class ApiHelperImpl: ApiHelper {

    val mContext: Context

    @Inject
    constructor(@AppContext context: Context) {
        mContext = context
    }

    override fun discoverMovies(): Observable<DiscoverMovieResult> {
        return Rx2AndroidNetworking.get(ApiEndpoint.ApiEndpoint.BASE_URL + ApiEndpoint.ApiEndpoint.DISCOVER_MOVIE + ApiEndpoint.ApiEndpoint.API_KEY)
                .build()
                .getObjectObservable(DiscoverMovieResult::class.java)
    }

}