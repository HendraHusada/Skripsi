package com.singletondev.room_persistance

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context

/**
 * Created by Randy Arba on 11/24/17.
 * This apps contains Room_persistance
 * @email randy.arba@gmail.com
 * @github https://github.com/Leviaran
 */

@Database(entities = arrayOf(Repo::class),version = 1)
abstract class RepoDatabase : RoomDatabase() {

    companion object {

        val DBNAME = "repoDatabase.db"
        @Volatile var instance : RepoDatabase? = null

        private fun create(context: Context) = context.let { Room.databaseBuilder(it,RepoDatabase::class.java, DBNAME).build() }
        @Synchronized fun getIntances(context : Context) : RepoDatabase = instance ?: create(context)

    }

    abstract fun getRepoDao() : RepoDao

}

