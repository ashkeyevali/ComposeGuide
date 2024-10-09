package kz.homebank.base.presentation.di;

@dagger.Component(dependencies = {kz.homebank.base.presentation.di.PresentationDependencies.class})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0007"}, d2 = {"Lkz/homebank/base/presentation/di/PresentationComponent;", "Lkz/homebank/base/presentation/di/PresentationApi;", "serializer", "Lkz/homebank/libraries/kotlin/api/serialization/Serializer;", "getSerializer", "()Lkz/homebank/libraries/kotlin/api/serialization/Serializer;", "Companion", "v5.34.65(539)_debug"})
public abstract interface PresentationComponent extends kz.homebank.base.presentation.di.PresentationApi {
    @org.jetbrains.annotations.NotNull
    public static final kz.homebank.base.presentation.di.PresentationComponent.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    public abstract kz.homebank.libraries.kotlin.api.serialization.Serializer getSerializer();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lkz/homebank/base/presentation/di/PresentationComponent$Companion;", "", "()V", "initAndGet", "Lkz/homebank/base/presentation/di/PresentationComponent;", "deps", "Lkz/homebank/base/presentation/di/PresentationDependencies;", "v5.34.65(539)_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final kz.homebank.base.presentation.di.PresentationComponent initAndGet(@org.jetbrains.annotations.NotNull
        kz.homebank.base.presentation.di.PresentationDependencies deps) {
            return null;
        }
    }
}