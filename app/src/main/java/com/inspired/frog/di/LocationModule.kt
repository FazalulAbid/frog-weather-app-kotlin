package com.inspired.frog.di

import com.inspired.frog.data.remote.location.DefaultLocationTracker
import com.inspired.frog.domain.location.LocationTracker
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Singleton


@ExperimentalCoroutinesApi
@Module
@InstallIn(SingletonComponent::class)
abstract  class LocationModule {


    @Binds
    @Singleton
    abstract fun BindLocalTracker(defaultLocationTracker: DefaultLocationTracker):LocationTracker
}