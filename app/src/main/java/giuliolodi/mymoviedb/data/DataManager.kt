package giuliolodi.mymoviedb.data

import giuliolodi.mymoviedb.data.api.Response
import rx.Observable

interface DataManager {

    fun getData(): Observable<Response>

}