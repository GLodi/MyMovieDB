package giuliolodi.mymoviedb.ui.main

import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import giuliolodi.mymoviedb.R
import giuliolodi.mymoviedb.data.network.model.Movie
import giuliolodi.mymoviedb.ui.base.BaseActivity
import kotlinx.android.synthetic.main.main_activity.*
import javax.inject.Inject

class MainActivity : BaseActivity(), MainContract.View {

    @Inject
    lateinit var mPresenter: MainContract.Presenter<MainContract.View>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        getActivityComponent().inject(this)

        initLayout()

        mPresenter.onAttach(this)

        mPresenter.subscribe()
    }

    private fun initLayout() {
        val layoutManager = GridLayoutManager(applicationContext, 2)
        main_activity_rv.layoutManager = layoutManager
        main_activity_rv.setHasFixedSize(true)
        main_activity_rv.adapter = MainAdapter()
    }

    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun showContent(movies: List<Movie>) {
        (main_activity_rv.adapter as MainAdapter).addMovies(movies)
    }

    override fun onDestroy() {
        mPresenter.onDetach()
        super.onDestroy()
    }

}