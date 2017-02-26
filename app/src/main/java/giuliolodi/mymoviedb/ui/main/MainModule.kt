package giuliolodi.mymoviedb.ui.main

import dagger.Module
import dagger.Provides

@Module
class MainModule(view: MainContract.View) {

    val mView: MainContract.View = view

    @Provides
    fun proideMainView(): MainContract.View {
        return mView
    }

}