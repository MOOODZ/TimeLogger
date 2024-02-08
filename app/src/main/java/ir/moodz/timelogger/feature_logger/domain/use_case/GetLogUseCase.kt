package ir.moodz.timelogger.feature_logger.domain.use_case

import ir.moodz.timelogger.feature_logger.domain.model.TimeLog
import ir.moodz.timelogger.feature_logger.domain.repository.LogsRepository

class GetLogUseCase(
    private val logsRepository: LogsRepository
) {
    suspend operator fun invoke(id:Int) : TimeLog?{
        return logsRepository.getLogById(id)
    }
}