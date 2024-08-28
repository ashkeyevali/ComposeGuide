package kz.homebank.libraries.kotlin.api.event

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.receiveAsFlow

class SingleShotEvent<E> {
    private val _events = Channel<E>()
    val events: Flow<E> = _events.receiveAsFlow()

    /** Posts event synchronously, but doesn't guarantee that posted event trigger [events] collector.
     * Posting event can fail when there is no collector of [events] in this moment */
    fun postEventSync(event: E) {
        _events.trySend(event)
    }

    suspend fun postEventAsync(event: E) {
        _events.send(event)
    }
}