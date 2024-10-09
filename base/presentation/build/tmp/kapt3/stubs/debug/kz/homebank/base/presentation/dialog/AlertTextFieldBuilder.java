package kz.homebank.base.presentation.dialog;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ(\u0010\u001b\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00042\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rJ\"\u0010\u001d\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010R\u0012\u0010\u0003\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Lkz/homebank/base/presentation/dialog/AlertTextFieldBuilder;", "", "()V", "btnPrimaryRes", "", "btnSecondaryRes", "hintText", "", "getHintText", "()Ljava/lang/String;", "setHintText", "(Ljava/lang/String;)V", "onPrimaryBtnClick", "Lkotlin/Function1;", "", "onSecondaryBtnClick", "Lkotlin/Function0;", "text", "getText", "setText", "tvTitleText", "getTvTitleText", "setTvTitleText", "build", "Landroidx/appcompat/app/AlertDialog;", "context", "Landroid/content/Context;", "setPrimaryBtn", "onBtnClick", "setSecondaryBtn", "v5.34.65(539)_debug"})
public final class AlertTextFieldBuilder {
    @org.jetbrains.annotations.Nullable
    private java.lang.String tvTitleText;
    @org.jetbrains.annotations.Nullable
    private java.lang.String hintText;
    @org.jetbrains.annotations.Nullable
    private java.lang.String text;
    @androidx.annotation.StringRes
    private int btnPrimaryRes = 0;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onPrimaryBtnClick;
    @androidx.annotation.StringRes
    private int btnSecondaryRes = 0;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryBtnClick;
    
    public AlertTextFieldBuilder() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTvTitleText() {
        return null;
    }
    
    public final void setTvTitleText(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getHintText() {
        return null;
    }
    
    public final void setHintText(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getText() {
        return null;
    }
    
    public final void setText(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public final void setPrimaryBtn(@androidx.annotation.StringRes
    int btnPrimaryRes, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onBtnClick) {
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