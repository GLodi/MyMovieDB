package giuliolodi.mymoviedb.ui.base

import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

open class BasePresenter<V: BaseContract.View>: BaseContract.Presenter<V?> {

    val mCompositeDisposable: CompositeDisposable

    var mBaseView: V? = null

    @Inject
    constructor(compositeDisposable: CompositeDisposable) {
        this.mCompositeDisposable = compositeDisposable
    }

    fun getCompositeDisposable(): CompositeDisposable {
        return mCompositeDisposable
    }

    override fun onAttach(view: V?) {
        this.mBaseView = view
    }

    override fun onDetach() {
        mCompositeDisposable.dispose()
        mBaseView = null
    }

}