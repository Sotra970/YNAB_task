// Generated by Dagger (https://google.github.io/dagger).
package sotra.ynab.ui.transactions;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class TransactionsFragment_MembersInjector
    implements MembersInjector<TransactionsFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public TransactionsFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<TransactionsFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new TransactionsFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(TransactionsFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      TransactionsFragment instance, ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}