package kz.homebank.base.presentation.activity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lkz/homebank/base/presentation/activity/TransfersListener;", "", "navigateToMain", "", "navigateToRequests", "showToolbar", "show", "", "v5.34.65(539)_debug"})
public abstract interface TransfersListener {
    
    public abstract void showToolbar(boolean show);
    
    public abstract void navigateToRequests();
    
    public abstract void navigateToMain();
}