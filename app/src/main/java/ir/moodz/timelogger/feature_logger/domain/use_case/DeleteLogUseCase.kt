package ir.moodz.timelogger.feature_logger.domain.use_case

import ir.moodz.timelogger.feature_logger.domain.model.TimeLog
import ir.moodz.timelogger.feature_logger.domain.repository.LogsRepository

class DeleteLogUseCase(
    private val logsRepository: LogsRepository
) {

    suspend operator fun invoke(timeLog: TimeLog){
        logsRepository.deleteLog(timeLog)
    }
}