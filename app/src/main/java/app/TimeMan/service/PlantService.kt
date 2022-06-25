package app.TimeMan.service

import android.app.Application
import android.content.ContentValues.TAG
import android.util.Log
import androidx.room.Room
import app.TimeMan.RetrofitClientInstance
import app.TimeMan.dao.IProfileDAO
import app.TimeMan.dao.ITaskDao
import app.TimeMan.dao.TaskDataBase
import app.TimeMan.dto.Task
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.withContext
import retrofit2.awaitResponse

interface IPlantService {
    suspend fun fetchPlants() : List<Task>?
    fun getLocalPlantDAO(): IProfileDAO
}

class PlantService(val application: Application) : IPlantService {

    lateinit var db: TaskDataBase

    override suspend fun fetchPlants() : List<Task>? {
        return withContext(Dispatchers.IO) {
            val service = RetrofitClientInstance.retrofitInstance?.create(ITaskDao::class.java)
            val plants = async {service?.getAllTasks()}
            var result = plants.await()?.awaitResponse()?.body()
            updateLocalPlants(result)
            return@withContext result
        }
    }

    private suspend fun updateLocalPlants(plants : ArrayList<Task>?) {
        try {
            plants?.let {
                val localPlantDAO = getLocalPlantDAO()
                localPlantDAO.insertAll(plants)
            }
        } catch (e: Exception) {
            Log.e(TAG, "error saving countries ${e.message}")
        }
    }

    override fun getLocalPlantDAO(): IProfileDAO {
        if (!this::db.isInitialized) {
            db = Room.databaseBuilder(application, TaskDataBase::class.java, "myplants").build()
        }
        return db.localTaskDAO()
    }
}