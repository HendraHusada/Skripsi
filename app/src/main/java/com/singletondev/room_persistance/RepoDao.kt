package com.singletondev.room_persistance

import android.arch.persistence.room.*

/**
 * Created by Randy Arba on 11/24/17.
 * This apps contains Room_persistance
 * @email randy.arba@gmail.com
 * @github https://github.com/Leviaran
 */

@Dao
interface RepoDao{

    @Query("SELECT * FROM repo")
    fun getAllRepo() : List<Repo>

    @Insert
    fun insertRepo(vararg repos : Repo)

    @Update
    fun updateRepo(vararg repos : Repo)

    @Delete
    fun deleteRepo(vararg repos : Repo)
}


