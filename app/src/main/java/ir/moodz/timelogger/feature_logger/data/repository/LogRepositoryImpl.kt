package ir.moodz.timelogger.feature_logger.data.repository

import ir.moodz.timelogger.feature_logger.data.data_source.TimeLogsDao
import ir.moodz.timelogger.feature_logger.domain.model.TimeLog
import ir.moodz.timelogger.feature_logger.domain.repository.LogsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LogRepositoryImpl @Inject constructor(
    private val timeLogsDao: TimeLogsDao
) : LogsRepository{
    override fun getLogs(): Flow<List<TimeLog>> {
        return timeLogsDao.getTimeLogs()
    }

    override suspend fun insertLog(timeLog: TimeLog) {
        return timeLogsDao.insertLog(timeLog)
    }

    override suspend fun deleteLog(timeLog: TimeLog) {
        return timeLogsDao.deleteLog(timeLog)
    }

    override suspend fun getLogById(id: Int): TimeLog? {
        return timeLogsDao.getLogByID(id)
    }

}