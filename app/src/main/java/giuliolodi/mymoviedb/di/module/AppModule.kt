package giuliolodi.mymoviedb.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import giuliolodi.mymoviedb.di.AppContext

@Module
class AppModule(private val application: Application) {

    @Provides @AppContext
    fun provideContext(): Context {
        return application
    }

}