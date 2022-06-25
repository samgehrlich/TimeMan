package app.TimeMan.dao

import app.TimeMan.dto.Task
import retrofit2.Call
import retrofit2.http.GET

interface ITaskDao {

    @GET("/perl/mobile/viewplantsjsonarray.pl")
    fun getAllPlants() : Call<ArrayList<Task>>

}