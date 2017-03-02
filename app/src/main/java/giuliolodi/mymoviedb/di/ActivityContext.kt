package giuliolodi.mymoviedb.di

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Qualifier
import javax.inject.Scope

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
annotation class ActivityContext