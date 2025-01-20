package com.example.exameneduardocerrato.Data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface MobleDAO {
    //Consultas

    //Afegir Moble
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun afegirMobles(moble: Mobles)

    //Buscar tots els Mobles
    @Query("SELECT * FROM Moble ORDER BY moble_name DESC")
    fun obtenirMobles(): LiveData<List<Mobles>>

//    // Actualiztar Moble
//    @Query("")
//    fun actualitzarMoble(): LiveData<List<Mobles>>

}