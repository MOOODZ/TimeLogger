package ir.moodz.timelogger.feature_logger.domain.repository

import ir.moodz.timelogger.feature_logger.domain.model.TimeLog
import kotlinx.coroutines.flow.Flow

interface LogsRepository {

    fun getLogs() : Flow<List<TimeLog>>

    suspend fun insertLog(timeLog: TimeLog)

    suspend fun deleteLog(timeLog: TimeLog)

    suspend fun getLogById(id:Int): TimeLog?


}