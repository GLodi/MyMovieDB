package giuliolodi.mymoviedb.ui.main

import android.util.Log
import giuliolodi.mymoviedb.data.DataManager
import giuliolodi.mymoviedb.data.network.model.DiscoverMovieResult
import giuliolodi.mymoviedb.ui.base.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MainPresenter<V: MainContract.View>: BasePresenter<V>, MainContract.Presenter<V> {

    val TAG = "MainPresenter"

    @Inject
    constructor(mCompositeDisposable: CompositeDisposable, mDataManager: DataManager): super(mCompositeDisposable, mDataManager)

    override fun subscribe() {
        getView().showLoading()
        getCompositeDisposable().add(getDataManager()
                .discoverMovies()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { discoverMovieResult -> onSuccess(discoverMovieResult) },
                        { throwable -> onError(throwable) }
                ))
    }

    fun onSuccess(discoverMovieResult: DiscoverMovieResult) {
        Log.d(TAG, "Results taken")
    }

    fun onError(throwable: Throwable) {
        Log.d(TAG, "Error")
    }

}