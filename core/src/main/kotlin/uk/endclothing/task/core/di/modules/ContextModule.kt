package uk.endclothing.task.core.di.modules

import uk.endclothing.task.core.di.scopes.AppScope
import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class ContextModule(private val app: Application) {

    @AppScope
    @Provides
    fun provideContext(): Context = app

    @AppScope
    @Provides
    fun provideApplication(): Application = app
}
