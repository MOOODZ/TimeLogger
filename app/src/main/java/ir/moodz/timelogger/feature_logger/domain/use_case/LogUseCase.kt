package ir.moodz.timelogger.feature_logger.domain.use_case

data class LogUseCase(
    val getLogsUseCase: GetLogsUseCase,
    val getLogUseCase: GetLogUseCase,
    val submitLogUseCase: SubmitLogUseCase,
    val deleteLogUseCase: DeleteLogUseCase
)
