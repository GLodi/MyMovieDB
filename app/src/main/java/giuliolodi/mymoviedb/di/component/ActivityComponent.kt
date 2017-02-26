package giuliolodi.mymoviedb.di.component

import dagger.Component
import giuliolodi.mymoviedb.di.PerActivity
import giuliolodi.mymoviedb.di.module.ActivityModule
import giuliolodi.mymoviedb.ui.main.MainActivity

@PerActivity
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)

}