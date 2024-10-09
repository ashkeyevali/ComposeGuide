package kz.homebank.base.presentation.dialog;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\"\u0010\u001c\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00042\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fJ\"\u0010\u001e\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fR\u0012\u0010\u0003\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014\u00a8\u0006\u001f"}, d2 = {"Lkz/homebank/base/presentation/dialog/AlertBuilder;", "", "()V", "btnPrimaryRes", "", "btnSecondaryRes", "ivRes", "getIvRes", "()I", "setIvRes", "(I)V", "onPrimaryBtnClick", "Lkotlin/Function0;", "", "onSecondaryBtnClick", "tvSubtitle", "", "getTvSubtitle", "()Ljava/lang/String;", "setTvSubtitle", "(Ljava/lang/String;)V", "tvTitle", "getTvTitle", "setTvTitle", "build", "Landroidx/appcompat/app/AlertDialog;", "context", "Landroid/content/Context;", "setPrimaryBtn", "onBtnClick", "setSecondaryBtn", "v5.34.65(539)_debug"})
public final class AlertBuilder {
    @androidx.annotation.DrawableRes
    private int ivRes = 0;
    @org.jetbrains.annotations.Nullable
    private java.lang.String tvTitle;
    @org.jetbrains.annotations.Nullable
    private java.lang.String tvSubtitle;
    @androidx.annotation.StringRes
    private int btnPrimaryRes = 0;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryBtnClick;
    @androidx.annotation.StringRes
    private int btnSecondaryRes = 0;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryBtnClick;
    
    public AlertBuilder() {
        super();
    }
    
    public final int getIvRes() {
        return 0;
    }
    
    public final void setIvRes(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTvTitle() {
        return null;
    }
    
    public final void setTvTitle(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTvSubtitle() {
        return null;
    }
    
    public final void setTvSubtitle(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public final void setPrimaryBtn(@androidx.annotation.StringRes
    int btnPrimaryRes, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> onBtnClick) {
    }
    
    public final void setSecondaryBtn(@androidx.annotation.StringRes
    int btnSecondaryRes, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> onBtnClick) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.appcompat.app.AlertDialog build(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
}