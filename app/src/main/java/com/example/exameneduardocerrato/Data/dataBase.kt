package com.example.exameneduardocerrato.Data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [Mobles::class],
    version = 2,
    exportSchema = false
)

// Tercer archivo
abstract class dataBase : RoomDatabase() {

    abstract fun mobleDao() : MobleDAO

    companion object{

        @Volatile
        private var INSTANCE: dataBase? = null

        fun getDataBase(context: Context): dataBase{
            if(INSTANCE == null){
                synchronized(this){
                    INSTANCE = buildDatabase(context)
                }
            }
            return INSTANCE!!
        }

        private fun buildDatabase(context: Context): dataBase {
            return Room.databaseBuilder(
                context.applicationContext,
                dataBase::class.java,
                "moble_database"
            ).createFromAsset("databases/moble_database.db")
                .build()
        }
    }
}
