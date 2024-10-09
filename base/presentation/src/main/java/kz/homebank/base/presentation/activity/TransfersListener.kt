package kz.homebank.base.presentation.activity

interface TransfersListener {

    fun showToolbar(show: Boolean)
    fun navigateToRequests()
    fun navigateToMain()
}