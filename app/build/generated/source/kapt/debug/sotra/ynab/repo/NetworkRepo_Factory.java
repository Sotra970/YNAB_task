// Generated by Dagger (https://google.github.io/dagger).
package sotra.ynab.repo;

import dagger.internal.Factory;
import javax.inject.Provider;
import sotra.ynab.api.ApiService;

public final class NetworkRepo_Factory implements Factory<NetworkRepo> {
  private final Provider<ApiService> apiServiceProvider;

  public NetworkRepo_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public NetworkRepo get() {
    return provideInstance(apiServiceProvider);
  }

  public static NetworkRepo provideInstance(Provider<ApiService> apiServiceProvider) {
    return new NetworkRepo(apiServiceProvider.get());
  }

  public static NetworkRepo_Factory create(Provider<ApiService> apiServiceProvider) {
    return new NetworkRepo_Factory(apiServiceProvider);
  }

  public static NetworkRepo newNetworkRepo(ApiService apiService) {
    return new NetworkRepo(apiService);
  }
}