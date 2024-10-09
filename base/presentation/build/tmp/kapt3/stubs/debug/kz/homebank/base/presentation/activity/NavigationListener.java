package kz.homebank.base.presentation.activity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H&\u00a8\u0006\n"}, d2 = {"Lkz/homebank/base/presentation/activity/NavigationListener;", "", "navigateToTransfer", "", "navigation", "", "depDeal", "systemAttributeId", "navigateToWebView", "url", "v5.34.65(539)_debug"})
public abstract interface NavigationListener {
    
    public abstract void navigateToTransfer(@org.jetbrains.annotations.NotNull
    java.lang.String navigation, @org.jetbrains.annotations.NotNull
    java.lang.String depDeal, @org.jetbrains.annotations.NotNull
    java.lang.String systemAttributeId);
    
    public abstract void navigateToWebView(@org.jetbrains.annotations.NotNull
    java.lang.String url);
}