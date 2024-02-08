package ir.moodz.timelogger.feature_logger.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class TimeLog(
    @PrimaryKey val id :Int? = null,
    val timestamp: Long,
    val entrance: Boolean,
    val exit: Boolean
)

class InvalidLogException(message:String):Exception(message)
