// Generated by Dagger (https://dagger.dev).
package uk.endclothing.task.core.di.modules;

import com.squareup.moshi.Moshi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Converter;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideMoshiConverterFactoryFactory implements Factory<Converter.Factory> {
  private final NetworkModule module;

  private final Provider<Moshi> moshiProvider;

  public NetworkModule_ProvideMoshiConverterFactoryFactory(NetworkModule module,
      Provider<Moshi> moshiProvider) {
    this.module = module;
    this.moshiProvider = moshiProvider;
  }

  @Override
  public Converter.Factory get() {
    return provideMoshiConverterFactory(module, moshiProvider.get());
  }

  public static NetworkModule_ProvideMoshiConverterFactoryFactory create(NetworkModule module,
      Provider<Moshi> moshiProvider) {
    return new NetworkModule_ProvideMoshiConverterFactoryFactory(module, moshiProvider);
  }

  public static Converter.Factory provideMoshiConverterFactory(NetworkModule instance,
      Moshi moshi) {
    return Preconditions.checkNotNullFromProvides(instance.provideMoshiConverterFactory(moshi));
  }
}
