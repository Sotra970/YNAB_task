package sotra.ynab.di.modules;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import sotra.ynab.ui.transactions.TransactionsFragment;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeTransactionsFragment.TransactionsFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeTransactionsFragment {
  private FragmentBuildersModule_ContributeTransactionsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(TransactionsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TransactionsFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface TransactionsFragmentSubcomponent extends AndroidInjector<TransactionsFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TransactionsFragment> {}
  }
}
