package giuliolodi.mymoviedb.data

import android.content.Context
import giuliolodi.mymoviedb.data.network.ApiHelper
import giuliolodi.mymoviedb.data.network.model.DiscoverMovieResult
import giuliolodi.mymoviedb.di.AppContext
import io.reactivex.Observable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DataManagerImpl: DataManager {

    private val mContext: Context
    private val mApiHelper: ApiHelper

    @Inject
    constructor(@AppContext context: Context,
                apiHelper: ApiHelper) {
        mContext = context
        mApiHelper = apiHelper
    }

    override fun discoverMovies(): Observable<DiscoverMovieResult> {
        return mApiHelper.discoverMovies()
    }

}