package giuliolodi.mymoviedb.di.component

import dagger.Component
import giuliolodi.mymoviedb.MyMovieDB
import giuliolodi.mymoviedb.di.module.AppModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun inject(app: MyMovieDB)

}