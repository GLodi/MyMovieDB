package giuliolodi.mymoviedb.data

import android.content.Context
import giuliolodi.mymoviedb.data.api.Response
import giuliolodi.mymoviedb.di.AppContext
import rx.Observable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DataManagerImpl: DataManager {

    private val mContext: Context

    @Inject
    constructor(@AppContext context: Context) {
        mContext = context
    }

    override fun getData(): Observable<Response> {

        var observable: Observable<Response> = Observable.create {  }

        return observable

    }

}