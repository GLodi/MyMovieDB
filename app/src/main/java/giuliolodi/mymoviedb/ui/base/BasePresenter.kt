package giuliolodi.mymoviedb.ui.base

import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

open class BasePresenter<V: BaseContract.View>: BaseContract.Presenter<V> {

    val mCompositeDisposable: CompositeDisposable

    @Inject
    constructor(compositeDisposable: CompositeDisposable) {
        this.mCompositeDisposable = compositeDisposable
    }

    fun getCompositeDisposable(): CompositeDisposable {
        return mCompositeDisposable
    }

    override fun onAttach(view: V) {
    }

    override fun onDetach() {
    }

}