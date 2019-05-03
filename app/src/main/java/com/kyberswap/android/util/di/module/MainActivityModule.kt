package com.kyberswap.android.util.di.module

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import com.kyberswap.android.presentation.main.MainActivity
import com.kyberswap.android.presentation.main.MainViewModel
import com.kyberswap.android.presentation.main.balance.*
import com.kyberswap.android.presentation.main.swap.SwapFragment
import com.kyberswap.android.presentation.main.swap.SwapViewModel
import com.kyberswap.android.presentation.main.swap.TokenSearchFragment
import com.kyberswap.android.presentation.main.swap.TokenSearchViewModel
import com.kyberswap.android.util.di.ViewModelKey
import com.kyberswap.android.util.di.scope.FragmentScoped
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
interface MainActivityModule {

    @Binds
    fun providesAppCompatActivity(mainActivity: MainActivity): AppCompatActivity

    @FragmentScoped
    @ContributesAndroidInjector
    fun contributeBalanceFragment(): BalanceFragment

    @FragmentScoped
    @ContributesAndroidInjector
    fun contributeKyberListFragment(): KyberListFragment

    @FragmentScoped
    @ContributesAndroidInjector
    fun contributeOtherFragment(): OtherFragment

    @FragmentScoped
    @ContributesAndroidInjector
    fun contributeBalanceAddressFragment(): BalanceAddressFragment

    @FragmentScoped
    @ContributesAndroidInjector
    fun contributeTokenSearchFragment(): TokenSearchFragment

    @FragmentScoped
    @ContributesAndroidInjector
    fun contributeSwapFragment(): SwapFragment

    @Binds
    @IntoMap
    @ViewModelKey(BalanceViewModel::class)
    fun bindBalanceViewModel(
        mainViewModel: BalanceViewModel
    ): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    fun bindMainViewModel(
        mainViewModel: MainViewModel
    ): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(KyberListViewModel::class)
    fun bindKyberListViewModel(
        kyberListViewModel: KyberListViewModel
    ): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(OtherViewModel::class)
    fun bindOtherViewModel(
        otherViewModel: OtherViewModel
    ): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(BalanceAddressViewModel::class)
    fun bindBalanceAddressViewModel(
        otherViewModel: BalanceAddressViewModel
    ): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SwapViewModel::class)
    fun bindSwapViewModel(
        swapViewModel: SwapViewModel
    ): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(TokenSearchViewModel::class)
    fun bindTokenSearchViewModel(
        tokenSearchViewModel: TokenSearchViewModel
    ): ViewModel
}
