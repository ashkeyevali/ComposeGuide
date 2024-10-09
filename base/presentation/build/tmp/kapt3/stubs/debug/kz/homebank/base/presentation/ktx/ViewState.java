package kz.homebank.base.presentation.ktx;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lkz/homebank/base/presentation/ktx/ViewState;", "T", "", "()V", "Data", "Error", "Loading", "Lkz/homebank/base/presentation/ktx/ViewState$Data;", "Lkz/homebank/base/presentation/ktx/ViewState$Error;", "Lkz/homebank/base/presentation/ktx/ViewState$Loading;", "v5.34.65(539)_debug"})
public abstract class ViewState<T extends java.lang.Object> {
    
    private ViewState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\n\b\u0001\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0013\u0010\u0004\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lkz/homebank/base/presentation/ktx/ViewState$Data;", "T", "", "Lkz/homebank/base/presentation/ktx/ViewState;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lkz/homebank/base/presentation/ktx/ViewState$Data;", "equals", "", "other", "hashCode", "", "toString", "", "v5.34.65(539)_debug"})
    public static final class Data<T extends java.lang.Object> extends kz.homebank.base.presentation.ktx.ViewState<T> {
        @org.jetbrains.annotations.NotNull
        private final T data = null;
        
        public Data(@org.jetbrains.annotations.NotNull
        T data) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final T getData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final T component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final kz.homebank.base.presentation.ktx.ViewState.Data<T> copy(@org.jetbrains.annotations.NotNull
        T data) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\n\b\u0001\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00018\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lkz/homebank/base/presentation/ktx/ViewState$Error;", "T", "", "Lkz/homebank/base/presentation/ktx/ViewState;", "error", "", "errorData", "(Ljava/lang/Throwable;Ljava/lang/Object;)V", "getError", "()Ljava/lang/Throwable;", "getErrorData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Ljava/lang/Throwable;Ljava/lang/Object;)Lkz/homebank/base/presentation/ktx/ViewState$Error;", "equals", "", "other", "hashCode", "", "toString", "", "v5.34.65(539)_debug"})
    public static final class Error<T extends java.lang.Object> extends kz.homebank.base.presentation.ktx.ViewState<T> {
        @org.jetbrains.annotations.NotNull
        private final java.lang.Throwable error = null;
        @org.jetbrains.annotations.Nullable
        private final T errorData = null;
        
        public Error(@org.jetbrains.annotations.NotNull
        java.lang.Throwable error, @org.jetbrains.annotations.Nullable
        T errorData) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.Throwable getError() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final T getErrorData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.Throwable component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final T component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final kz.homebank.base.presentation.ktx.ViewState.Error<T> copy(@org.jetbrains.annotations.NotNull
        java.lang.Throwable error, @org.jetbrains.annotations.Nullable
        T errorData) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lkz/homebank/base/presentation/ktx/ViewState$Loading;", "Lkz/homebank/base/presentation/ktx/ViewState;", "", "()V", "v5.34.65(539)_debug"})
    public static final class Loading extends kz.homebank.base.presentation.ktx.ViewState {
        @org.jetbrains.annotations.NotNull
        public static final kz.homebank.base.presentation.ktx.ViewState.Loading INSTANCE = null;
        
        private Loading() {
        }
    }
}