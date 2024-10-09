package kz.homebank.base.presentation.di

import dagger.Component
import kz.homebank.libraries.kotlin.api.serialization.Serializer

@Component(
    dependencies = [PresentationDependencies::class]
)
internal interface PresentationComponent : PresentationApi {
    companion object {
        fun initAndGet(deps: PresentationDependencies): PresentationComponent {
            return DaggerPresentationComponent.builder()
                .presentationDependencies(deps)
                .build()
        }
    }

    val serializer: Serializer
}