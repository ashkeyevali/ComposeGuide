package kz.homebank.base.presentation.fragment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\u0003H\u0007J\b\u0010\n\u001a\u00020\u000bH\u0004J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\u001a\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0002J\u001f\u0010\u0017\u001a\u00020\u000b2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b0\u0019\u00a2\u0006\u0002\b\u001bJ\b\u0010\u001c\u001a\u00020\u000bH\u0004J\u000e\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lkz/homebank/base/presentation/fragment/BaseFragment;", "Landroidx/fragment/app/Fragment;", "layoutId", "", "(I)V", "alert", "Landroidx/appcompat/app/AlertDialog;", "loader", "Landroid/app/Dialog;", "getStatusBarHeight", "hideLoader", "", "isProtectFragment", "", "onDestroyView", "onStart", "onStop", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupToolbar", "showAlert", "builderAction", "Lkotlin/Function1;", "Lkz/homebank/base/presentation/dialog/AlertBuilder;", "Lkotlin/ExtensionFunctionType;", "showLoader", "showToast", "msg", "", "v5.34.65(539)_debug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable
    private android.app.Dialog loader;
    @org.jetbrains.annotations.Nullable
    private androidx.appcompat.app.AlertDialog alert;
    
    public BaseFragment(@androidx.annotation.LayoutRes
    int layoutId) {
        super();
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    public void onStart() {
    }
    
    @java.lang.Override
    public void onStop() {
    }
    
    public boolean isProtectFragment() {
        return false;
    }
    
    private final void setupToolbar() {
    }
    
    protected final void showLoader() {
    }
    
    protected final void hideLoader() {
    }
    
    public final void showAlert(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super kz.homebank.base.presentation.dialog.AlertBuilder, kotlin.Unit> builderAction) {
    }
    
    public final void showToast(@org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
    
    @android.annotation.SuppressLint(value = {"InternalInsetResource", "DiscouragedApi"})
    public final int getStatusBarHeight() {
        return 0;
    }
}