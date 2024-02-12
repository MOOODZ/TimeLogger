package ir.moodz.timelogger.feature_logger.presentation.logs

import ir.moodz.timelogger.feature_logger.domain.model.TimeLog

sealed class LogsEvent {
    data class SubmitTimeLog(val timeStamp:Long): LogsEvent()
    data class DeleteTimeLog(val timeLog: TimeLog): LogsEvent()

}