package kz.homebank.base.network.domain.use_case


import kz.homebank.base.domain.use_case.UseCase
import kz.homebank.base.network.other_source.OtherSourceStatus
import java.io.IOException
import javax.inject.Inject

internal class SendNetworkErrorToAnalytics: UseCase<SendNetworkErrorToAnalytics.Param, Unit>() {

    override suspend fun execute(param: Param) {

    }

    class Param(
        val initialException: IOException,
        val otherSourceStatuses: List<Pair<String, OtherSourceStatus>>
    )
}