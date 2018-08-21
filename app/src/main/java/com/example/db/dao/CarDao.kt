package com.example.db.dao

import android.arch.persistence.room.*
import com.example.model.Car
import io.reactivex.Single

@Dao
interface CarDao {
    @Query("SELECT * FROM car")
    fun findAll(): Single<List<Car>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(car: Car): Long

    @Update
    fun update(car: Car)

    @Delete
    fun delete(car: Car)
}
