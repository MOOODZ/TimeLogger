package ir.moodz.timelogger.feature_logger.presentation.logs

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import ir.moodz.timelogger.feature_logger.domain.model.TimeLog
import ir.moodz.timelogger.feature_logger.domain.use_case.LogUseCase
import javax.inject.Inject

class LogsViewModel @Inject constructor(
    private val logUseCase: LogUseCase
) : ViewModel() {

    private val _listState = mutableStateListOf<TimeLog>()
    val listState = _listState

    fun onEvent(event: LogsEvent){

        when (event){
            is LogsEvent.SubmitTimeLog ->{



            }
            is LogsEvent.DeleteTimeLog -> {


            }
        }

    }


}