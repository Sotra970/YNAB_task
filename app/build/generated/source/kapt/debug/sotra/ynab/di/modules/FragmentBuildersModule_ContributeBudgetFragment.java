package sotra.ynab.di.modules;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import sotra.ynab.ui.budgetFragment.BudgetFragment;

@Module(
  subcomponents = FragmentBuildersModule_ContributeBudgetFragment.BudgetFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeBudgetFragment {
  private FragmentBuildersModule_ContributeBudgetFragment() {}

  @Binds
  @IntoMap
  @ClassKey(BudgetFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      BudgetFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface BudgetFragmentSubcomponent extends AndroidInjector<BudgetFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BudgetFragment> {}
  }
}
