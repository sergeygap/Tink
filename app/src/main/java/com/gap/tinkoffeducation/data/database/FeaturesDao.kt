package com.gap.tinkoffeducation.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface FeaturesDao {
    @Query("SELECT * FROM features")
    suspend fun getListFeatures(): List<FeaturesDbModel>
    @Query("SELECT EXISTS (SELECT 1 FROM features WHERE id = :id) != 0")
    suspend fun getFeaturesById(id: Int): FeaturesDbModel

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addFeatures(features: FeaturesDbModel)

    @Delete
    suspend fun deleteFeatures(features: FeaturesDbModel)

    @Query("DELETE FROM features")
    suspend fun deleteAllFeatures()
}