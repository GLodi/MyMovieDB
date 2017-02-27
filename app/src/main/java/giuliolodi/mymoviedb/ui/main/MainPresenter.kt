package giuliolodi.mymoviedb.ui.main

import giuliolodi.mymoviedb.ui.base.BasePresenter
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class MainPresenter<V: MainContract.View>: BasePresenter<V>, MainContract.Presenter<V> {

    @Inject
    constructor(compositeDisposable: CompositeDisposable): super(compositeDisposable)

    override fun subscribe() {
    }

}