package giuliolodi.mymoviedb.data.network

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class ApiModule {

    @Provides @Singleton @Named("base_url")
    fun provideBaseUrl(): String {
        return "http://api.themoviedb.org/"
    }



}