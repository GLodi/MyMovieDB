package giuliolodi.mymoviedb.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import giuliolodi.mymoviedb.data.DataManager
import giuliolodi.mymoviedb.data.DataManagerImpl
import giuliolodi.mymoviedb.di.AppContext
import javax.inject.Singleton

@Module
class AppModule(private val application: Application) {

    @Provides @AppContext
    fun provideContext(): Context {
        return application
    }

    @Provides
    fun provideApplication(): Application {
        return application
    }

    @Provides
    @Singleton
    fun provideDataManager(dataManagerImpl: DataManagerImpl): DataManager {
        return dataManagerImpl
    }

}