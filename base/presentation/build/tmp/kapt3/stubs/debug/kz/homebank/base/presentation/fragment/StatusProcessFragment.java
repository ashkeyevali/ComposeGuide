package kz.homebank.base.presentation.fragment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lkz/homebank/base/presentation/fragment/StatusProcessFragment;", "Lkz/homebank/base/presentation/fragment/BaseFragment;", "()V", "binding", "Lkz/homebank/base/presentation/databinding/FragmentStatusProcessBinding;", "getBinding", "()Lkz/homebank/base/presentation/databinding/FragmentStatusProcessBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "v5.34.65(539)_debug"})
public final class StatusProcessFragment extends kz.homebank.base.presentation.fragment.BaseFragment {
    @org.jetbrains.annotations.NotNull
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    private static final java.lang.String TAG = null;
    @org.jetbrains.annotations.Nullable
    private static kotlin.jvm.functions.Function0<kotlin.Unit> btnCancelClicked;
    @org.jetbrains.annotations.Nullable
    private static kotlin.jvm.functions.Function0<kotlin.Unit> btnContinueClicked;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String KEY_IMAGE = "image";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String KEY_TITLE = "title";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String KEY_DESCRIPTION = "description";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String KEY_BTN_CANCEL_TEXT = "btnCancelText";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String KEY_BTN_CONTINUE_TEXT = "btnContinueText";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String KEY_BTN_CANCEL_VISIBLE = "btnCancelVisible";
    @org.jetbrains.annotations.NotNull
    public static final kz.homebank.base.presentation.fragment.StatusProcessFragment.Companion Companion = null;
    
    public StatusProcessFragment() {
        super(0);
    }
    
    private final kz.homebank.base.presentation.databinding.FragmentStatusProcessBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002Jd\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\n \u000b*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lkz/homebank/base/presentation/fragment/StatusProcessFragment$Companion;", "", "()V", "KEY_BTN_CANCEL_TEXT", "", "KEY_BTN_CANCEL_VISIBLE", "KEY_BTN_CONTINUE_TEXT", "KEY_DESCRIPTION", "KEY_IMAGE", "KEY_TITLE", "TAG", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "btnCancelClicked", "Lkotlin/Function0;", "", "btnContinueClicked", "newInstance", "Lkz/homebank/base/presentation/fragment/StatusProcessFragment;", "image", "", "title", "description", "btnCancelText", "btnContinueText", "btnCancelClick", "btnContinueClick", "toolbarVisible", "", "btnCancelVisible", "v5.34.65(539)_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final java.lang.String getTAG() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final kz.homebank.base.presentation.fragment.StatusProcessFragment newInstance(int image, @org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.NotNull
        java.lang.String description, @org.jetbrains.annotations.NotNull
        java.lang.String btnCancelText, @org.jetbrains.annotations.NotNull
        java.lang.String btnContinueText, @org.jetbrains.annotations.Nullable
        kotlin.jvm.functions.Function0<kotlin.Unit> btnCancelClick, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function0<kotlin.Unit> btnContinueClick, boolean toolbarVisible, boolean btnCancelVisible) {
            return null;
        }
    }
}