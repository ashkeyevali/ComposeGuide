package di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c1\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Ldi/MoviesProviderModule;", "", "()V", "providePaymentServicesApiService", "Lkz/homebank/feature/movie/impl/data/repository/MovieApiService;", "factory", "Lkz/homebank/base/network/api/network_client/ApiServiceFactory;", "v5.34.65(539)_debug"})
public final class MoviesProviderModule {
    @org.jetbrains.annotations.NotNull
    public static final di.MoviesProviderModule INSTANCE = null;
    
    private MoviesProviderModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final kz.homebank.feature.movie.impl.data.repository.MovieApiService providePaymentServicesApiService(@org.jetbrains.annotations.NotNull
    kz.homebank.base.network.api.network_client.ApiServiceFactory factory) {
        return null;
    }
}