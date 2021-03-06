package giuliolodi.mymoviedb

import android.app.Application
import giuliolodi.mymoviedb.data.DataManager
import giuliolodi.mymoviedb.di.component.AppComponent
import giuliolodi.mymoviedb.di.component.DaggerAppComponent
import giuliolodi.mymoviedb.di.module.AppModule
import javax.inject.Inject

class MyMovieDB : Application() {

    lateinit var mAppComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        mAppComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()

        mAppComponent.inject(this)

    }

    fun getAppComponent(): AppComponent {
        return mAppComponent
    }

}