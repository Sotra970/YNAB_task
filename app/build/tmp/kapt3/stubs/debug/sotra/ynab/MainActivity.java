package sotra.ynab;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0016"}, d2 = {"Lsotra/ynab/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Ldagger/android/support/HasSupportFragmentInjector;", "()V", "dispatchingAndroidInjector", "Ldagger/android/DispatchingAndroidInjector;", "Landroidx/fragment/app/Fragment;", "getDispatchingAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setDispatchingAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "network", "Lsotra/ynab/repo/NetworkRepo;", "getNetwork", "()Lsotra/ynab/repo/NetworkRepo;", "setNetwork", "(Lsotra/ynab/repo/NetworkRepo;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "supportFragmentInjector", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements dagger.android.support.HasSupportFragmentInjector {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<androidx.fragment.app.Fragment> dispatchingAndroidInjector;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public sotra.ynab.repo.NetworkRepo network;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<androidx.fragment.app.Fragment> getDispatchingAndroidInjector() {
        return null;
    }
    
    public final void setDispatchingAndroidInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<androidx.fragment.app.Fragment> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.DispatchingAndroidInjector<androidx.fragment.app.Fragment> supportFragmentInjector() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final sotra.ynab.repo.NetworkRepo getNetwork() {
        return null;
    }
    
    public final void setNetwork(@org.jetbrains.annotations.NotNull()
    sotra.ynab.repo.NetworkRepo p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public MainActivity() {
        super();
    }
}