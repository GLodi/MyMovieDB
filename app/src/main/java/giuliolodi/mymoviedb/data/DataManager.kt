package giuliolodi.mymoviedb.data

import android.content.Context
import giuliolodi.mymoviedb.di.AppContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DataManager {

    private val mContext: Context

    @Inject
    constructor(@AppContext context: Context) {
        mContext = context
    }

}