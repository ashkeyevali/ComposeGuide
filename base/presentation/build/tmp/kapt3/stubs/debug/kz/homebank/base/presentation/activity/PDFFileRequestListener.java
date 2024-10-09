package kz.homebank.base.presentation.activity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\tH&J&\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\tH\u0016\u00a8\u0006\f"}, d2 = {"Lkz/homebank/base/presentation/activity/PDFFileRequestListener;", "", "getPdf", "", "iban", "", "fromDate", "toDate", "loading", "Lkotlin/Function1;", "", "getPdfNotifications", "v5.34.65(539)_debug"})
public abstract interface PDFFileRequestListener {
    
    public abstract void getPdf(@org.jetbrains.annotations.NotNull
    java.lang.String iban, @org.jetbrains.annotations.NotNull
    java.lang.String fromDate, @org.jetbrains.annotations.NotNull
    java.lang.String toDate, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> loading);
    
    public abstract void getPdfNotifications(@org.jetbrains.annotations.NotNull
    java.lang.String iban, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> loading);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        public static void getPdfNotifications(@org.jetbrains.annotations.NotNull
        kz.homebank.base.presentation.activity.PDFFileRequestListener $this, @org.jetbrains.annotations.NotNull
        java.lang.String iban, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> loading) {
        }
    }
}