package uk.endclothing.task.core.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Luk/endclothing/task/core/di/modules/RepositoryModule;", "", "()V", "bindUserRepo", "Luk/endclothing/task/core/remote/repo/catalog/CatalogRepo;", "repo", "Luk/endclothing/task/core/remote/repo/catalog/CatalogRepoImpl;", "core_devDebug"})
@dagger.Module()
public abstract class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    @uk.endclothing.task.core.di.scopes.AppScope()
    public abstract uk.endclothing.task.core.remote.repo.catalog.CatalogRepo bindUserRepo(@org.jetbrains.annotations.NotNull()
    uk.endclothing.task.core.remote.repo.catalog.CatalogRepoImpl repo);
}