package giuliolodi.mymoviedb.ui.main

import giuliolodi.mymoviedb.data.DataManager
import giuliolodi.mymoviedb.ui.base.BasePresenter
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class MainPresenter<V: MainContract.View>: BasePresenter<V>, MainContract.Presenter<V> {

    @Inject
    constructor(mCompositeDisposable: CompositeDisposable, mDataManager: DataManager): super(mCompositeDisposable, mDataManager)

    override fun subscribe() {


    }

}