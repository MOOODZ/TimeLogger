package ir.moodz.timelogger.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ir.moodz.timelogger.feature_logger.data.data_source.TimeLogsDatabase
import ir.moodz.timelogger.feature_logger.data.repository.LogRepositoryImpl
import ir.moodz.timelogger.feature_logger.domain.repository.LogsRepository
import ir.moodz.timelogger.feature_logger.domain.use_case.DeleteLogUseCase
import ir.moodz.timelogger.feature_logger.domain.use_case.GetLogUseCase
import ir.moodz.timelogger.feature_logger.domain.use_case.GetLogsUseCase
import ir.moodz.timelogger.feature_logger.domain.use_case.LogUseCase
import ir.moodz.timelogger.feature_logger.domain.use_case.SubmitLogUseCase
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLogsDatabase(app: Application): TimeLogsDatabase{
        return Room.databaseBuilder(
            app,
            TimeLogsDatabase::class.java,
            TimeLogsDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideLogRepository(db: TimeLogsDatabase) : LogsRepository{
        return LogRepositoryImpl(db.timeLogsDao)
    }

    @Provides
    @Singleton
    fun provideLogUseCase(repository: LogsRepository): LogUseCase{
        return LogUseCase(
            getLogUseCase = GetLogUseCase(repository),
            getLogsUseCase = GetLogsUseCase(repository),
            deleteLogUseCase = DeleteLogUseCase(repository),
            submitLogUseCase = SubmitLogUseCase(repository)
        )
    }

}