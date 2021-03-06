// Generated by Dagger (https://dagger.dev).
package uk.endclothing.task.core.di;

import android.app.Application;
import android.content.Context;
import com.squareup.moshi.Moshi;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Converter;
import retrofit2.Retrofit;
import uk.endclothing.task.core.di.modules.ContextModule;
import uk.endclothing.task.core.di.modules.ContextModule_ProvideApplicationFactory;
import uk.endclothing.task.core.di.modules.ContextModule_ProvideContextFactory;
import uk.endclothing.task.core.di.modules.NetworkModule;
import uk.endclothing.task.core.di.modules.NetworkModule_ProvideCatalogDatasourceFactory;
import uk.endclothing.task.core.di.modules.NetworkModule_ProvideCatalogServiceFactory;
import uk.endclothing.task.core.di.modules.NetworkModule_ProvideHttpLoggingInterceptorFactory;
import uk.endclothing.task.core.di.modules.NetworkModule_ProvideMoshiConverterFactoryFactory;
import uk.endclothing.task.core.di.modules.NetworkModule_ProvideMoshiFactory;
import uk.endclothing.task.core.di.modules.NetworkModule_ProvideOKHttpClientFactory;
import uk.endclothing.task.core.di.modules.NetworkModule_ProvideRetrofitFactory;
import uk.endclothing.task.core.remote.datasource.CatalogDataSource;
import uk.endclothing.task.core.remote.repo.catalog.CatalogRepo;
import uk.endclothing.task.core.remote.repo.catalog.CatalogRepoImpl;
import uk.endclothing.task.core.remote.repo.catalog.CatalogRepoImpl_Factory;
import uk.endclothing.task.core.remote.services.CatalogService;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerCoreComponent implements CoreComponent {
  private final DaggerCoreComponent coreComponent = this;

  private Provider<Context> provideContextProvider;

  private Provider<Application> provideApplicationProvider;

  private Provider<HttpLoggingInterceptor> provideHttpLoggingInterceptorProvider;

  private Provider<OkHttpClient> provideOKHttpClientProvider;

  private Provider<Moshi> provideMoshiProvider;

  private Provider<Converter.Factory> provideMoshiConverterFactoryProvider;

  private Provider<Retrofit> provideRetrofitProvider;

  private Provider<CatalogService> provideCatalogServiceProvider;

  private Provider<CatalogDataSource> provideCatalogDatasourceProvider;

  private Provider<CatalogRepoImpl> catalogRepoImplProvider;

  private Provider<CatalogRepo> bindUserRepoProvider;

  private DaggerCoreComponent(ContextModule contextModuleParam, NetworkModule networkModuleParam) {

    initialize(contextModuleParam, networkModuleParam);

  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final ContextModule contextModuleParam,
      final NetworkModule networkModuleParam) {
    this.provideContextProvider = DoubleCheck.provider(ContextModule_ProvideContextFactory.create(contextModuleParam));
    this.provideApplicationProvider = DoubleCheck.provider(ContextModule_ProvideApplicationFactory.create(contextModuleParam));
    this.provideHttpLoggingInterceptorProvider = DoubleCheck.provider(NetworkModule_ProvideHttpLoggingInterceptorFactory.create(networkModuleParam));
    this.provideOKHttpClientProvider = DoubleCheck.provider(NetworkModule_ProvideOKHttpClientFactory.create(networkModuleParam, provideHttpLoggingInterceptorProvider));
    this.provideMoshiProvider = DoubleCheck.provider(NetworkModule_ProvideMoshiFactory.create(networkModuleParam));
    this.provideMoshiConverterFactoryProvider = DoubleCheck.provider(NetworkModule_ProvideMoshiConverterFactoryFactory.create(networkModuleParam, provideMoshiProvider));
    this.provideRetrofitProvider = DoubleCheck.provider(NetworkModule_ProvideRetrofitFactory.create(networkModuleParam, provideOKHttpClientProvider, provideMoshiConverterFactoryProvider));
    this.provideCatalogServiceProvider = DoubleCheck.provider(NetworkModule_ProvideCatalogServiceFactory.create(networkModuleParam, provideRetrofitProvider));
    this.provideCatalogDatasourceProvider = DoubleCheck.provider(NetworkModule_ProvideCatalogDatasourceFactory.create(networkModuleParam, provideCatalogServiceProvider, provideMoshiProvider));
    this.catalogRepoImplProvider = CatalogRepoImpl_Factory.create(provideCatalogDatasourceProvider);
    this.bindUserRepoProvider = DoubleCheck.provider((Provider) catalogRepoImplProvider);
  }

  @Override
  public Context context() {
    return provideContextProvider.get();
  }

  @Override
  public Application application() {
    return provideApplicationProvider.get();
  }

  @Override
  public CatalogRepo catalogRepo() {
    return bindUserRepoProvider.get();
  }

  public static final class Builder {
    private ContextModule contextModule;

    private NetworkModule networkModule;

    private Builder() {
    }

    public Builder contextModule(ContextModule contextModule) {
      this.contextModule = Preconditions.checkNotNull(contextModule);
      return this;
    }

    public Builder networkModule(NetworkModule networkModule) {
      this.networkModule = Preconditions.checkNotNull(networkModule);
      return this;
    }

    public CoreComponent build() {
      Preconditions.checkBuilderRequirement(contextModule, ContextModule.class);
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      return new DaggerCoreComponent(contextModule, networkModule);
    }
  }
}
