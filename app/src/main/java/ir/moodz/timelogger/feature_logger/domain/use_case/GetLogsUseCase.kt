package ir.moodz.timelogger.feature_logger.domain.use_case

import ir.moodz.timelogger.feature_logger.domain.model.TimeLog
import ir.moodz.timelogger.feature_logger.domain.repository.LogsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetLogsUseCase(
    private val logsRepository: LogsRepository
) {
    operator fun invoke() : Flow<List<TimeLog>>{
        return logsRepository.getLogs().map {logs ->
            logs.sortedBy { it.timestamp }
        }
    }
}