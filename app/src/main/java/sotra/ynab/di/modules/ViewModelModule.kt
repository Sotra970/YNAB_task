/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sotra.ynab.di.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import sotra.i.chachingdemo.di.ViewModelKey
import sotra.io.digistask.util.ViewModelFactory
import sotra.ynab.ui.accountsFragment.AccountViewModel
import sotra.ynab.ui.budgetFragment.BudgetViewModel
import sotra.ynab.ui.transactions.TransactionsFragment
import sotra.ynab.ui.transactions.TransactionsViewModel

@Suppress("unused")
@Module
abstract class ViewModelModule {
  @Binds
  @IntoMap
  @ViewModelKey(BudgetViewModel::class)
  abstract fun bindBudgetViewModel(vm: BudgetViewModel): ViewModel

  @Binds
  @IntoMap
  @ViewModelKey(AccountViewModel::class)
  abstract fun bindAccountViewModel(vm: AccountViewModel): ViewModel


  @Binds
  @IntoMap
  @ViewModelKey(TransactionsViewModel::class)
  abstract fun bindTransactionsViewModel(vm: TransactionsViewModel): ViewModel

  @Binds
  abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}
