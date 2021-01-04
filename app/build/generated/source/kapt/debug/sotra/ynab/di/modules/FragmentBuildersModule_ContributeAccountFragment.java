package sotra.ynab.di.modules;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import sotra.ynab.ui.accountsFragment.AccountFragment;

@Module(
  subcomponents = FragmentBuildersModule_ContributeAccountFragment.AccountFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeAccountFragment {
  private FragmentBuildersModule_ContributeAccountFragment() {}

  @Binds
  @IntoMap
  @ClassKey(AccountFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AccountFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface AccountFragmentSubcomponent extends AndroidInjector<AccountFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<AccountFragment> {}
  }
}
