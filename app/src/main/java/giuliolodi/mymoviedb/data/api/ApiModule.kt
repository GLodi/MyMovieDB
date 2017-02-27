package giuliolodi.mymoviedb.data.api

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module
class ApiModule {

    @Provides @Singleton @Named("base_url")
    fun provideBaseUrl(): String {
        return "http://api.themoviedb.org/"
    }

    @Provides @Singleton
    fun provideApi(retrofit: Retrofit): MovieDbApi {
        return retrofit.create(MovieDbApi::class.java)
    }

}