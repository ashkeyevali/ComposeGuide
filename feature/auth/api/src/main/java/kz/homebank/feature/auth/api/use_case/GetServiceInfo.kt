package kz.homebank.feature.payments.services.api.use_case

import kz.homebank.base.domain.use_case.UseCase
import kz.homebank.feature.payments.services.api.data.ServiceInfo

abstract class GetServiceInfo: UseCase<String, ServiceInfo>()
