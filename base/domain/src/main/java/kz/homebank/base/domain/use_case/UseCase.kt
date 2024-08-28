package kz.homebank.base.domain.use_case

import kz.homebank.base.domain.result.Result

abstract class UseCase<in P, out R> {
    suspend operator fun invoke(param: P): Result<R> {
        return try {
            Result.Success(execute(param))
        } catch (e: Throwable) {
            Result.Error(e)
        }
    }

    abstract suspend fun execute(param: P): R
}