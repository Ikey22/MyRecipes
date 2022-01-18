package app.isolvetech.myrecipes.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "recipes")
data class Recipes(
    @PrimaryKey(autoGenerate = true)
    var id:Int,
    @ColumnInfo(name = "dishName")
    var dishName: String
) : Serializable