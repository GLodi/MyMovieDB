package giuliolodi.mymoviedb.ui.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import giuliolodi.mymoviedb.MyMovieDB
import giuliolodi.mymoviedb.di.component.ActivityComponent
import giuliolodi.mymoviedb.di.component.DaggerActivityComponent
import giuliolodi.mymoviedb.di.module.ActivityModule

abstract class BaseActivity: AppCompatActivity(), BaseContract.View {

    lateinit var mActivityComponent: ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val app: MyMovieDB = application as MyMovieDB

        mActivityComponent = DaggerActivityComponent.builder()
                .activityModule(ActivityModule(this))
                .appComponent(app.getAppComponent())
                .build()
    }

    fun getActivityComponent(): ActivityComponent {
        return mActivityComponent
    }

}