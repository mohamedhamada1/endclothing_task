// Generated by Dagger (https://dagger.dev).
package uk.endclothing.task.core.remote.repo.catalog;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import uk.endclothing.task.core.remote.datasource.CatalogDataSource;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CatalogRepoImpl_Factory implements Factory<CatalogRepoImpl> {
  private final Provider<CatalogDataSource> remoteProvider;

  public CatalogRepoImpl_Factory(Provider<CatalogDataSource> remoteProvider) {
    this.remoteProvider = remoteProvider;
  }

  @Override
  public CatalogRepoImpl get() {
    return newInstance(remoteProvider.get());
  }

  public static CatalogRepoImpl_Factory create(Provider<CatalogDataSource> remoteProvider) {
    return new CatalogRepoImpl_Factory(remoteProvider);
  }

  public static CatalogRepoImpl newInstance(CatalogDataSource remote) {
    return new CatalogRepoImpl(remote);
  }
}
