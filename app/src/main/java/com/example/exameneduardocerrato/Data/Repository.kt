package com.example.exameneduardocerrato.Data

import android.content.Context
import androidx.lifecycle.LiveData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class Repository {
    companion object{
        var repository_database: dataBase? = null
        var mobles: LiveData<List<Mobles>>? = null

        //Función iniciar ls BD
        fun iniciarBD(context: Context) : dataBase{
            return dataBase.getDataBase(context)
        }

        //Funció crida insert alumne

        fun inserirMoble(context: Context, moble: Mobles){
            //Connectar a la BD
            repository_database = iniciarBD(context)

            CoroutineScope(IO).launch {
                repository_database!!.mobleDao().afegirMobles(moble)
            }
        }

        //Funció crida select alumnes

        fun obtenirMoble(context: Context) : LiveData<List<Mobles>>? {
            repository_database = iniciarBD(context)

            CoroutineScope(IO).launch {
                mobles = repository_database!!.mobleDao().obtenirMobles()
            }
            return mobles
        }
    }
}