package kz.homebank.base.presentation.navigation

object NavigationTree {

    enum class AuthNavigation {
        AuthFlow,
        Login,
        Register,
        ForgotPassword
    }

    enum class MoviesNavigation {
        Populars,
        MovieDetail
    }
}