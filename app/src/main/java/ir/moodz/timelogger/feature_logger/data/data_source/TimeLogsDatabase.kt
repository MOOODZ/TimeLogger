package ir.moodz.timelogger.feature_logger.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import ir.moodz.timelogger.feature_logger.domain.model.TimeLog

@Database(
    entities = [TimeLog::class],
    version = 1
)
abstract class TimeLogsDatabase : RoomDatabase() {

    abstract val timeLogsDao: TimeLogsDao

    companion object{
        const val DATABASE_NAME = "log_database"
    }

}