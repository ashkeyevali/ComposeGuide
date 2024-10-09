package kz.homebank.base.presentation.dialog.status;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015\u00a8\u0006\""}, d2 = {"Lkz/homebank/base/presentation/dialog/status/StatusArg;", "Landroid/os/Parcelable;", "header", "", "ivRes", "", "title", "subtitle", "btnPrimaryRes", "btnSecondaryRes", "backBtnEnabled", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Z)V", "getBackBtnEnabled", "()Z", "getBtnPrimaryRes", "()I", "getBtnSecondaryRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeader", "()Ljava/lang/String;", "getIvRes", "setIvRes", "(I)V", "getSubtitle", "getTitle", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "v5.34.65(539)_debug"})
@kotlinx.parcelize.Parcelize
public final class StatusArg implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable
    private final java.lang.String header = null;
    private int ivRes;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String subtitle = null;
    private final int btnPrimaryRes = 0;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer btnSecondaryRes = null;
    private final boolean backBtnEnabled = false;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_STATUS_ARG = "status_arg";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String RESULT_PRIMARY_BTN_CLICK = "primary_btn_click";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String RESULT_SECONDARY_BTN_CLICK = "secondary_btn_click";
    @org.jetbrains.annotations.NotNull
    public static final kz.homebank.base.presentation.dialog.status.StatusArg.Companion Companion = null;
    
    public StatusArg(@org.jetbrains.annotations.Nullable
    java.lang.String header, @androidx.annotation.DrawableRes
    int ivRes, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String subtitle, @androidx.annotation.StringRes
    int btnPrimaryRes, @androidx.annotation.StringRes
    @org.jetbrains.annotations.Nullable
    java.lang.Integer btnSecondaryRes, boolean backBtnEnabled) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getHeader() {
        return null;
    }
    
    public final int getIvRes() {
        return 0;
    }
    
    public final void setIvRes(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSubtitle() {
        return null;
    }
    
    public final int getBtnPrimaryRes() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getBtnSecondaryRes() {
        return null;
    }
    
    public final boolean getBackBtnEnabled() {
        return false;
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lkz/homebank/base/presentation/dialog/status/StatusArg$Companion;", "", "()V", "EXTRA_STATUS_ARG", "", "RESULT_PRIMARY_BTN_CLICK", "RESULT_SECONDARY_BTN_CLICK", "v5.34.65(539)_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}