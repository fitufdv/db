package com.example.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.example.db.dao.CarDao
import com.example.db.dao.DriverDao
import com.example.model.Car
import com.example.model.Driver

@Database(entities = [Car::class, Driver::class], version = 1, exportSchema = false)
abstract class TestDb : RoomDatabase() {

    abstract fun carDao(): CarDao

    abstract fun driverDao(): DriverDao

    companion object {
        const val NAME = "TEST_DB"
    }
}
