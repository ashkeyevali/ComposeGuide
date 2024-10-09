package kz.homebank.base.presentation.activity

interface PDFFileRequestListener {

    fun getPdf(
        iban: String,
        fromDate: String,
        toDate: String,
        loading: (Boolean) -> Unit = {},
    )

    fun getPdfNotifications(
        iban: String,
        loading: (Boolean) -> Unit = {},
    ) { }
}