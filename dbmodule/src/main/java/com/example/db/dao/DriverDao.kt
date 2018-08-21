package com.example.db.dao

import android.arch.persistence.room.*
import com.example.model.Driver
import io.reactivex.Single

@Dao
interface DriverDao {
    @Query("SELECT * FROM driver")
    fun findAll(): Single<List<Driver>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(driver: Driver): Long

    @Update
    fun update(driver: Driver)

    @Delete
    fun delete(driver: Driver)
}
