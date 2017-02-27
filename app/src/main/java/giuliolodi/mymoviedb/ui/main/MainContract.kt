package giuliolodi.mymoviedb.ui.main

import giuliolodi.mymoviedb.di.PerActivity
import giuliolodi.mymoviedb.ui.base.BaseContract

interface MainContract {

    interface View: BaseContract.View {

        fun setLoading()

        fun hideLoading()

        fun showContent()

        fun hideContent()

    }

    @PerActivity
    interface Presenter<V: MainContract.View>: BaseContract.Presenter<V?> {

        fun subscribe()

    }

}