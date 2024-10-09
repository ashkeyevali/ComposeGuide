package kz.homebank.base.android.constants

import kz.homebank.base.android.impl.di.AndroidComponentHolder

object EnvironmentConstants {
    val movieDbApiUrl = "https://api.themoviedb.org/3/"



    val isTestEnvironment = AndroidComponentHolder.getComponent().isTestEnvironment
    val hbApiUrl = if (isTestEnvironment) "https://testapi2.homebank.kz/" else "https://api2.homebank.kz/"

    val apiContext = if (isTestEnvironment) "homebank-api" else "hbapi"

    val hbApiFullUrlV1 = "$hbApiUrl/$apiContext/api/v1/"
    val hbApiFullUrlV2 = "$hbApiUrl/$apiContext/api/v2/"

    val hbApiFullUrlV4 = "$hbApiUrl/$apiContext/api/v4/"

    val hbApiFullUrlV5 = "$hbApiUrl$apiContext/api/v5/"
    val hbApiFullUrlV6 = "$hbApiUrl$apiContext/api/v6/"
    val hbApiFullUrlV3 = "$hbApiUrl$apiContext/api/v3/"

    val oauthApiUrl = if (isTestEnvironment) "https://193.93.58.37/" else "https://193.93.56.173/"

    val authApiUrl = if (isTestEnvironment) "https://testoauth.homebank.kz/" else ""

    val hbSocketUrl = if (isTestEnvironment) "wss://testevents.homebank.kz/" else "wss://events.homebank.kz/"

    val adaptivePlusApiUrl = if (isTestEnvironment) {
        "https://test-adaptive-api2.homebank.kz/v1/"
    } else {
        "https://adaptive-api2.homebank.kz/v1/"
    }

    val halykClubApiUrl = if (isTestEnvironment) {
        "https://test-pelican-api.homebank.kz/halykclub-api/"
    } else {
        "https://pelican-api.homebank.kz/halykclub-api/"
    }

    val halykInvestApiUrl = if (isTestEnvironment) "https://test-invest-api.homebank.kz/" else "https://invest-api.homebank.kz/"

    val clientSecret = if (isTestEnvironment) {
        "zqHbgi@rV\$wi@dGmt)dpW5IPskb&XW%$"
    } else {
        "e88bDn*VM^WU8LzKALIi\$cci6djVcBrB"
    }

    val tjClientSecret = if (isTestEnvironment) {
        "l^qXyaLAC6dO^!L&TCoZMnh48(QBh8wO"
    } else {
        "geAhY85RIEgrEtmqDzlGdT0pGkLzmipv"
    }

    val halykIdDeepLinkApiUrl = if (isTestEnvironment) {
        "test-halykid.homebank.kz"
    } else {
        "halykid.halykbank.kz"
    }

    val halykIdAuthApiUrl = if (isTestEnvironment) {
        "https://testoauth-eco.homebank.kz/halykid/"
    } else {
        "https://oauth-eco.homebank.kz/halykid/"
    }

    val koronaPayUrl = if (isTestEnvironment) "https://test-w4m.homebank.kz/transfers/koronapay" else "https://w4m.homebank.kz/transfers/koronapay"

    val ncfUrl = if (isTestEnvironment) "https://test-w4m.homebank.kz/government/national-fund-children?OS=Android" else "https://w4m.homebank.kz/government/national-fund-children?OS=Android"


    val depositUrl = if (isTestEnvironment) {
        "https://test-w4m.homebank.kz/deposits?OS=Android"
    } else {
        "https://w4m.homebank.kz/deposits?OS=Android"
    }

    val massInstallmentsWebViewUrl = if (isTestEnvironment) {
        "https://test-halyk.homebank.kz/installment/application"
    } else {
        "https://halyk.homebank.kz/installment/application"
    }

    const val MERGED_CARD_STATEMENT_ENDPOINT = "/api-cards-statement/api/v1/cards/{id}/statement"

    const val MERGED_CORP_CARD_STATEMENT_ENDPOINT = "/api-cards-statement/api/v1/cards/{cardid}/corporate/statement"


    val installmentHalykMarketWebUrl = if (isTestEnvironment) {
        "https://test-halyk.homebank.kz/installment-halykmarket/main"
    } else {
        "https://halyk.homebank.kz/installment-halykmarket/main"
    }

    val creditUrl = if (isTestEnvironment) {
        "https://test-halyk.homebank.kz"
    } else {
        "https://halyk.homebank.kz"
    }

    val certificateUrl = if (isTestEnvironment) {
        "https://test-w4m.homebank.kz/documents/account-certificate?OS=Android"
    } else {
        "https://w4m.homebank.kz/documents/account-certificate?OS=Android"
    }
}