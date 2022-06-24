package app.TimeMan.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import app.TimeMan.dto.Plant

@Database(entities=arrayOf(Plant::class), version =1)
abstract class PlantDatabase : RoomDatabase() {
    abstract fun localPlantDAO() : ILocalPlantDAO
}