package com.example.db.di

import android.arch.persistence.room.Room
import android.content.Context
import com.example.db.TestDb
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
@Singleton
class DbModule {
    @Provides
    internal fun provideRoomDb(context: Context): TestDb {
        return Room.databaseBuilder(context, TestDb::class.java, TestDb.NAME).build()
    }
}
