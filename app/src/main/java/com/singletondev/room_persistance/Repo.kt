package com.singletondev.room_persistance

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.support.annotation.NonNull

/**
 * Created by Randy Arba on 11/24/17.
 * This apps contains Room_persistance
 * @email randy.arba@gmail.com
 * @github https://github.com/Leviaran
 */

@Entity
data class Repo(val name : String, val url : String = "randy" ){
    @PrimaryKey(autoGenerate = true) var id : Int = 0
}