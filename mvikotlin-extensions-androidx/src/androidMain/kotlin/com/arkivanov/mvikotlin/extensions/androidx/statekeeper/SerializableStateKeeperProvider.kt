package com.arkivanov.mvikotlin.extensions.androidx.statekeeper

import android.os.Bundle
import androidx.savedstate.SavedStateRegistryOwner
import com.arkivanov.mvikotlin.core.statekeeper.ExperimentalStateKeeperApi
import com.arkivanov.mvikotlin.core.statekeeper.StateKeeperProvider
import java.io.Serializable

@Deprecated(
    "Use getSerializableStateKeeperRegistry() from the 'keepers' module",
    ReplaceWith("getSerializableStateKeeperRegistry()", "com.arkivanov.mvikotlin.keepers.statekeeper.getSerializableStateKeeperRegistry")
)
@ExperimentalStateKeeperApi
fun SavedStateRegistryOwner.getSerializableStateKeeperProvider(): StateKeeperProvider<Serializable> =
    object : AndroidStateKeeper<Serializable>(savedStateRegistry) {
        @Suppress("UNCHECKED_CAST")
        override fun <S : Serializable> Bundle.getValue(key: String): S? = getSerializable(key) as S?

        override fun Bundle.putValue(key: String, value: Serializable) {
            putSerializable(key, value)
        }
    }
