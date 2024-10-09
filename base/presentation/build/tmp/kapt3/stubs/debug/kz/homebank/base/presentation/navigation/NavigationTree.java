package kz.homebank.base.presentation.navigation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lkz/homebank/base/presentation/navigation/NavigationTree;", "", "()V", "AuthNavigation", "MoviesNavigation", "v5.34.65(539)_debug"})
public final class NavigationTree {
    @org.jetbrains.annotations.NotNull
    public static final kz.homebank.base.presentation.navigation.NavigationTree INSTANCE = null;
    
    private NavigationTree() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lkz/homebank/base/presentation/navigation/NavigationTree$AuthNavigation;", "", "(Ljava/lang/String;I)V", "AuthFlow", "Login", "Register", "ForgotPassword", "v5.34.65(539)_debug"})
    public static enum AuthNavigation {
        /*public static final*/ AuthFlow /* = new AuthFlow() */,
        /*public static final*/ Login /* = new Login() */,
        /*public static final*/ Register /* = new Register() */,
        /*public static final*/ ForgotPassword /* = new ForgotPassword() */;
        
        AuthNavigation() {
        }
        
        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.EnumEntries<kz.homebank.base.presentation.navigation.NavigationTree.AuthNavigation> getEntries() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lkz/homebank/base/presentation/navigation/NavigationTree$MoviesNavigation;", "", "(Ljava/lang/String;I)V", "Populars", "MovieDetail", "v5.34.65(539)_debug"})
    public static enum MoviesNavigation {
        /*public static final*/ Populars /* = new Populars() */,
        /*public static final*/ MovieDetail /* = new MovieDetail() */;
        
        MoviesNavigation() {
        }
        
        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.EnumEntries<kz.homebank.base.presentation.navigation.NavigationTree.MoviesNavigation> getEntries() {
            return null;
        }
    }
}