package com.example.eyedroptracker.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(@PrimaryKey val uid: Int,
                @ColumnInfo(name="f_name") val firstName: String?,
                @ColumnInfo(name = "l_name") val lastName: String?
)