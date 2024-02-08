package ir.moodz.timelogger.feature_logger.data.data_source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ir.moodz.timelogger.feature_logger.domain.model.TimeLog
import kotlinx.coroutines.flow.Flow


@Dao
interface TimeLogsDao {

    @Query("SELECT * FROM TimeLog")
    fun getTimeLogs(): Flow<List<TimeLog>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertLog(timeLog: TimeLog)

    @Delete
    suspend fun deleteLog(timeLog: TimeLog)

    @Query("SELECT * FROM timelog WHERE id = :id")
    suspend fun getLogByID (id:Int) : TimeLog?

}