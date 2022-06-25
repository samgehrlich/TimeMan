package app.TimeMan.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import app.TimeMan.dto.Task

@Database(entities=arrayOf(Task::class), version =1)
abstract class TaskDataBase : RoomDatabase() {
    abstract fun localPlantDAO() : IProfileDAO
}