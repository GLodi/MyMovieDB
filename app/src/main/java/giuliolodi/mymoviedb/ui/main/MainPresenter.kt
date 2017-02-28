package giuliolodi.mymoviedb.ui.main

import giuliolodi.mymoviedb.data.api.Response
import giuliolodi.mymoviedb.ui.base.BasePresenter
import io.reactivex.disposables.CompositeDisposable
import rx.Observable
import javax.inject.Inject

class MainPresenter<V: MainContract.View>: BasePresenter<V>, MainContract.Presenter<V> {

    @Inject
    constructor(compositeDisposable: CompositeDisposable): super(compositeDisposable)

    override fun subscribe() {

        var observable: Observable<Response>


    }

    private fun onGetMoviesSuccess(response: Response?) {

    }

    private fun onGetMoviesFailure(e: Throwable?) {

    }

}