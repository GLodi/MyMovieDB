package giuliolodi.mymoviedb.ui.main

import android.util.Log
import giuliolodi.mymoviedb.data.DataManager
import giuliolodi.mymoviedb.data.network.model.DiscoverMovieResult
import giuliolodi.mymoviedb.ui.base.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MainPresenter<V: MainContract.View>: BasePresenter<V>, MainContract.Presenter<V> {

    val TAG = "MainPresenter"

    @Inject
    constructor(mCompositeDisposable: CompositeDisposable, mDataManager: DataManager): super(mCompositeDisposable, mDataManager)

    override fun subscribe() {
        getCompositeDisposable().add(getDataManager()
                .discoverMovies()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object: Consumer<DiscoverMovieResult> {
                    override fun accept(t: DiscoverMovieResult) {
                        Log.d(TAG, "DiscoverMovieResult")
                    }
                }, object: Consumer<Throwable> {
                    override fun accept(t: Throwable?) {
                        Log.d(TAG, "Throwable: " + t.toString())
                    }
                }))
    }

}