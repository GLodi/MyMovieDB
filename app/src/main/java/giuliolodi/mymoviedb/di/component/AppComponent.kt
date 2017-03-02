package giuliolodi.mymoviedb.di.component

import android.content.Context
import dagger.Component
import giuliolodi.mymoviedb.MyMovieDB
import giuliolodi.mymoviedb.data.DataManager
import giuliolodi.mymoviedb.di.AppContext
import giuliolodi.mymoviedb.di.module.AppModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun inject(app: MyMovieDB)

    @AppContext
    fun getContext(): Context

    fun getDataManager(): DataManager

}