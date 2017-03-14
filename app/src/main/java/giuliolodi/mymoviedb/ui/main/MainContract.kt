package giuliolodi.mymoviedb.ui.main

import giuliolodi.mymoviedb.data.network.model.Movie
import giuliolodi.mymoviedb.di.PerActivity
import giuliolodi.mymoviedb.ui.base.BaseContract

interface MainContract {

    interface View: BaseContract.View {

        fun showLoading()

        fun hideLoading()

        fun showContent(movies: List<Movie>)

    }

    @PerActivity
    interface Presenter<V: MainContract.View>: BaseContract.Presenter<V> {

        fun subscribe()

    }

}