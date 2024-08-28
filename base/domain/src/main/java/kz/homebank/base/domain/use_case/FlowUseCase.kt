package kz.homebank.base.domain.use_case

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.*
import kz.homebank.base.domain.result.Result

abstract class FlowUseCase<P, R>(private val dispatcher: CoroutineDispatcher) {
    operator fun invoke(param: P): Flow<Result<R>> {
        return execute(param)
            .asResult()
            .flowOn(dispatcher)
    }

    abstract fun execute(param: P): Flow<R>
}

fun <R> Flow<R>.asResult(): Flow<Result<R>> {
    return this
        .map<R, Result<R>> { Result.Success(it) }
        .onStart { emit(Result.Loading) }
        .catch { emit(Result.Error(it)) }
}
