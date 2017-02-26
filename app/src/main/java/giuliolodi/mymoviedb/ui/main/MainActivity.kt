package giuliolodi.mymoviedb.ui.main

import android.content.Context
import android.os.Bundle
import giuliolodi.mymoviedb.R
import giuliolodi.mymoviedb.ui.base.BaseActivity
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class MainActivity : BaseActivity(), MainContract.View {

    @Inject
    lateinit var mPresenter: MainContract.Presenter<MainContract.View>

    @Inject
    lateinit var mCompositeDisposable: CompositeDisposable

    @Inject
    lateinit var mActivityContext: Context


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        getActivityComponent().inject(this)

    }

    override fun setLoading() {
    }

    override fun hideLoading() {
    }

    override fun showContent() {
    }

    override fun isNetworkAvailable() {
    }
}
