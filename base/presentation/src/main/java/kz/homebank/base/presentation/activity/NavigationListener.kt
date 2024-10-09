package kz.homebank.base.presentation.activity

interface NavigationListener {

    fun navigateToTransfer(
        navigation: String,
        depDeal: String,
        systemAttributeId: String,
    )

    fun navigateToWebView(
        url: String,
    )
}