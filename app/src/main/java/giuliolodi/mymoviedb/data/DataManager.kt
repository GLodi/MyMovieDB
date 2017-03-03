package giuliolodi.mymoviedb.data

import android.content.Context
import giuliolodi.mymoviedb.data.api.Response
import giuliolodi.mymoviedb.di.AppContext
import rx.Observable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DataManager {

    private val mContext: Context

    @Inject
    constructor(@AppContext context: Context) {
        mContext = context
    }

    fun getData(): Observable<Response> {

        var observable: Observable<Response> = Observable.create {  }

        return observable

    }

}