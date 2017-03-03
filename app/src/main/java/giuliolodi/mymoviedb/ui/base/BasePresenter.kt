package giuliolodi.mymoviedb.ui.base

import giuliolodi.mymoviedb.data.DataManager
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

open class BasePresenter<V: BaseContract.View>: BaseContract.Presenter<V?> {

    private val mCompositeDisposable: CompositeDisposable

    private val mDataManager: DataManager

    private var mBaseView: V? = null

    @Inject
    constructor(compositeDisposable: CompositeDisposable, dataManager: DataManager) {
        this.mCompositeDisposable = compositeDisposable
        this.mDataManager= dataManager
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

    fun isViewAttached(): Boolean {
        return mBaseView != null
    }

    fun getView(): V? {
        return mBaseView
    }

}