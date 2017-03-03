package giuliolodi.mymoviedb.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import giuliolodi.mymoviedb.data.api.MovieDbApi
import giuliolodi.mymoviedb.di.AppContext
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module
class AppModule(private val application: Application) {

    @Provides @AppContext
    fun provideContext(): Context {
        return application
    }

    @Provides @Singleton @Named("base_url")
    fun provideBaseUrl(): String {
        return "http://api.themoviedb.org/"
    }

    @Provides @Singleton
    fun provideApi(retrofit: Retrofit): MovieDbApi {
        return retrofit.create(MovieDbApi::class.java)
    }

}