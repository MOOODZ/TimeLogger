package ir.moodz.timelogger.feature_logger.domain.use_case

import ir.moodz.timelogger.feature_logger.domain.model.TimeLog
import ir.moodz.timelogger.feature_logger.domain.repository.LogsRepository

class SubmitLogUseCase(
    private val repository: LogsRepository
) {

    suspend operator fun invoke (timeLog: TimeLog){

        /*TODO Handle nullability in submitted log later and use created invalid message */
        repository.insertLog(timeLog)
    }


}