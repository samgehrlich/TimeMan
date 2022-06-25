package app.TimeMan.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import app.TimeMan.dto.Task

@Dao
interface IProfileDAO {

    @Query("SELECT * FROM plants")
    fun getAllTasks() : LiveData<List<Task>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(plants: ArrayList<Task>)

    @Delete
    fun delete(plant : Task)

}