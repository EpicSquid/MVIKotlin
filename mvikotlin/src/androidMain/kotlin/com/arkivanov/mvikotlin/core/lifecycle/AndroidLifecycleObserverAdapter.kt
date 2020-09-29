package com.arkivanov.mvikotlin.core.lifecycle

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

internal class AndroidLifecycleObserverAdapter(
    private val delegate: Lifecycle.Callbacks
) : DefaultLifecycleObserver {

    override fun onCreate(owner: LifecycleOwner) {
        delegate.onCreate()
    }

    override fun onStart(owner: LifecycleOwner) {
        delegate.onStart()
    }

    override fun onResume(owner: LifecycleOwner) {
        delegate.onResume()
    }

    override fun onPause(owner: LifecycleOwner) {
        delegate.onPause()
    }

    override fun onStop(owner: LifecycleOwner) {
        delegate.onStop()
    }

    override fun onDestroy(owner: LifecycleOwner) {
        delegate.onDestroy()
    }
}
