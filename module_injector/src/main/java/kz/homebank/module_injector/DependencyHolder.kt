package kz.homebank.module_injector

interface BaseDependencyHolder<D : BaseDependencies> {
    val dependencies: D
}

abstract class DependencyHolder0<D : BaseDependencies>(
) : BaseDependencyHolder<D> {
    abstract val block: (BaseDependencyHolder<D>) -> D

    override val dependencies: D
        get() = block(this)
}

abstract class DependencyHolder1<D : BaseDependencies, A1 : BaseApi>(
    private val api1: A1,
) : BaseDependencyHolder<D> {
    abstract val block: (BaseDependencyHolder<D>, A1) -> D

    override val dependencies: D
        get() = block(this, api1)
}

abstract class DependencyHolder2<D : BaseDependencies, A1 : BaseApi, A2 : BaseApi>(
    private val api1: A1,
    private val api2: A2,
) : BaseDependencyHolder<D> {
    abstract val block: (BaseDependencyHolder<D>, A1, A2) -> D

    override val dependencies: D
        get() = block(this, api1, api2)
}

abstract class DependencyHolder3<D : BaseDependencies, A1 : BaseApi, A2 : BaseApi, A3 : BaseApi>(
    private val api1: A1,
    private val api2: A2,
    private val api3: A3,
) : BaseDependencyHolder<D> {
    abstract val block: (dependencyHolder: BaseDependencyHolder<D>, A1, A2, A3) -> D

    override val dependencies: D
        get() = block(this, api1, api2, api3)
}

abstract class DependencyHolder4<
        D : BaseDependencies,
        A1 : BaseApi,
        A2 : BaseApi,
        A3 : BaseApi,
        A4 : BaseApi>(
    private val api1: A1,
    private val api2: A2,
    private val api3: A3,
    private val api4: A4
) : BaseDependencyHolder<D> {
    abstract val block: (dependencyHolder: BaseDependencyHolder<D>, A1, A2, A3, A4) -> D

    override val dependencies: D
        get() = block(this, api1, api2, api3, api4)
}

abstract class DependencyHolder5<
        D : BaseDependencies,
        A1 : BaseApi,
        A2 : BaseApi,
        A3 : BaseApi,
        A4 : BaseApi,
        A5 : BaseApi>(
    private val api1: A1,
    private val api2: A2,
    private val api3: A3,
    private val api4: A4,
    private val api5: A5,
) : BaseDependencyHolder<D> {
    abstract val block: (dependencyHolder: BaseDependencyHolder<D>, A1, A2, A3, A4, A5) -> D

    override val dependencies: D
        get() = block(this, api1, api2, api3, api4, api5)
}

abstract class DependencyHolder6<
        D : BaseDependencies,
        A1 : BaseApi,
        A2 : BaseApi,
        A3 : BaseApi,
        A4 : BaseApi,
        A5 : BaseApi,
        A6 : BaseApi>(
    private val api1: A1,
    private val api2: A2,
    private val api3: A3,
    private val api4: A4,
    private val api5: A5,
    private val api6: A6,
) : BaseDependencyHolder<D> {
    abstract val block: (dependencyHolder: BaseDependencyHolder<D>, A1, A2, A3, A4, A5, A6) -> D

    override val dependencies: D
        get() = block(this, api1, api2, api3, api4, api5, api6)
}

abstract class DependencyHolder7<
        D : BaseDependencies,
        A1 : BaseApi,
        A2 : BaseApi,
        A3 : BaseApi,
        A4 : BaseApi,
        A5 : BaseApi,
        A6 : BaseApi,
        A7 : BaseApi>(
    private val api1: A1,
    private val api2: A2,
    private val api3: A3,
    private val api4: A4,
    private val api5: A5,
    private val api6: A6,
    private val api7: A7,
) : BaseDependencyHolder<D> {
    abstract val block: (dependencyHolder: BaseDependencyHolder<D>, A1, A2, A3, A4, A5, A6, A7) -> D

    override val dependencies: D
        get() = block(this, api1, api2, api3, api4, api5, api6, api7)
}


abstract class DependencyHolder8<
        D : BaseDependencies,
        A1 : BaseApi,
        A2 : BaseApi,
        A3 : BaseApi,
        A4 : BaseApi,
        A5 : BaseApi,
        A6 : BaseApi,
        A7 : BaseApi,
        A8 : BaseApi
        >(
    private val api1: A1,
    private val api2: A2,
    private val api3: A3,
    private val api4: A4,
    private val api5: A5,
    private val api6: A6,
    private val api7: A7,
    private val api8: A8,
) : BaseDependencyHolder<D> {
    abstract val block: (dependencyHolder: BaseDependencyHolder<D>, A1, A2, A3, A4, A5, A6, A7, A8) -> D

    override val dependencies: D
        get() = block(this, api1, api2, api3, api4, api5, api6, api7, api8)
}

abstract class DependencyHolder9<
        D : BaseDependencies,
        A1 : BaseApi,
        A2 : BaseApi,
        A3 : BaseApi,
        A4 : BaseApi,
        A5 : BaseApi,
        A6 : BaseApi,
        A7 : BaseApi,
        A8 : BaseApi,
        A9 : BaseApi
        >(
    private val api1: A1,
    private val api2: A2,
    private val api3: A3,
    private val api4: A4,
    private val api5: A5,
    private val api6: A6,
    private val api7: A7,
    private val api8: A8,
    private val api9: A9,
) : BaseDependencyHolder<D> {
    abstract val block: (dependencyHolder: BaseDependencyHolder<D>, A1, A2, A3, A4, A5, A6, A7, A8, A9) -> D
    override val dependencies: D
        get() = block(this, api1, api2, api3, api4, api5, api6, api7, api8, api9)

}

abstract class DependencyHolder10<
        D : BaseDependencies,
        A1 : BaseApi,
        A2 : BaseApi,
        A3 : BaseApi,
        A4 : BaseApi,
        A5 : BaseApi,
        A6 : BaseApi,
        A7 : BaseApi,
        A8 : BaseApi,
        A9 : BaseApi,
        A10 : BaseApi
        >(
    private val api1: A1,
    private val api2: A2,
    private val api3: A3,
    private val api4: A4,
    private val api5: A5,
    private val api6: A6,
    private val api7: A7,
    private val api8: A8,
    private val api9: A9,
    private val api10: A10,
) : BaseDependencyHolder<D> {
    abstract val block: (dependencyHolder: BaseDependencyHolder<D>, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10) -> D

    override val dependencies: D
        get() = block(this, api1, api2, api3, api4, api5, api6, api7, api8, api9, api10)
}

abstract class DependencyHolder11<
        D : BaseDependencies,
        A1 : BaseApi,
        A2 : BaseApi,
        A3 : BaseApi,
        A4 : BaseApi,
        A5 : BaseApi,
        A6 : BaseApi,
        A7 : BaseApi,
        A8 : BaseApi,
        A9 : BaseApi,
        A10 : BaseApi,
        A11 : BaseApi,
        >(
    private val api1: A1,
    private val api2: A2,
    private val api3: A3,
    private val api4: A4,
    private val api5: A5,
    private val api6: A6,
    private val api7: A7,
    private val api8: A8,
    private val api9: A9,
    private val api10: A10,
    private val api11: A11,
) : BaseDependencyHolder<D> {
    abstract val block: (dependencyHolder: BaseDependencyHolder<D>, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11) -> D

    override val dependencies: D
        get() = block(this, api1, api2, api3, api4, api5, api6, api7, api8, api9, api10, api11)
}

abstract class DependencyHolder12<
        D : BaseDependencies,
        A1 : BaseApi,
        A2 : BaseApi,
        A3 : BaseApi,
        A4 : BaseApi,
        A5 : BaseApi,
        A6 : BaseApi,
        A7 : BaseApi,
        A8 : BaseApi,
        A9 : BaseApi,
        A10 : BaseApi,
        A11 : BaseApi,
        A12 : BaseApi,
        >(
    private val api1: A1,
    private val api2: A2,
    private val api3: A3,
    private val api4: A4,
    private val api5: A5,
    private val api6: A6,
    private val api7: A7,
    private val api8: A8,
    private val api9: A9,
    private val api10: A10,
    private val api11: A11,
    private val api12: A12,
) : BaseDependencyHolder<D> {
    abstract val block: (dependencyHolder: BaseDependencyHolder<D>, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12) -> D

    override val dependencies: D
        get() = block(this, api1, api2, api3, api4, api5, api6, api7, api8, api9, api10, api11, api12)
}

