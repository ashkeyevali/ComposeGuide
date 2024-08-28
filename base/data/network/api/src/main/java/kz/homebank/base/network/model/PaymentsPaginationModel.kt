package kz.homebank.base.network.model

import kotlinx.serialization.Serializable
import androidx.annotation.Keep

abstract class BasePaginationModel<T>{
    abstract val allCount: Int
    abstract val currentPage: Int
    abstract val pageSize: Int
    abstract val pagesAmount: Int
    abstract val list: List<T>
}

@Keep
@Serializable
data class PaymentsPaginationModel<T>(
    override val allCount: Int,
    override val currentPage: Int,
    override val pageSize: Int,
    override val pagesAmount: Int,
    override val list: List<T>,
): BasePaginationModel<T>()

@Keep
@Serializable
data class ExtendedPaymentsPaginationModel<T, S>(
    override val allCount: Int,
    override val currentPage: Int,
    override val pageSize: Int,
    override val pagesAmount: Int,
    override val list: List<T>,
    val additionalList: List<S>?
): BasePaginationModel<T>()
