package kz.homebank.base.presentation.dialog.status;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lkz/homebank/base/presentation/dialog/status/StatusWebArg;", "Landroid/os/Parcelable;", "header", "", "link", "(Ljava/lang/String;Ljava/lang/String;)V", "getHeader", "()Ljava/lang/String;", "getLink", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "v5.34.65(539)_debug"})
@kotlinx.parcelize.Parcelize
public final class StatusWebArg implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable
    private final java.lang.String header = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String link = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_STATUS_ARG = "status_arg";
    @org.jetbrains.annotations.NotNull
    public static final kz.homebank.base.presentation.dialog.status.StatusWebArg.Companion Companion = null;
    
    public StatusWebArg(@org.jetbrains.annotations.Nullable
    java.lang.String header, @org.jetbrains.annotations.NotNull
    java.lang.String link) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getHeader() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLink() {
        return null;
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lkz/homebank/base/presentation/dialog/status/StatusWebArg$Companion;", "", "()V", "EXTRA_STATUS_ARG", "", "v5.34.65(539)_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}