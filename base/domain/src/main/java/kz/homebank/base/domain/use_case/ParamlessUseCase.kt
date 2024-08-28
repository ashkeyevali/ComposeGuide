package kz.homebank.base.domain.use_case

import kz.homebank.base.domain.result.Result

abstract class ParamlessUseCase<out R> {
    suspend operator fun invoke(): Result<R> {
        return try {
            Result.Success(execute())
        } catch (e: Exception) {
            Result.Error(e)
        }
    }

    abstract suspend fun execute(): R
}