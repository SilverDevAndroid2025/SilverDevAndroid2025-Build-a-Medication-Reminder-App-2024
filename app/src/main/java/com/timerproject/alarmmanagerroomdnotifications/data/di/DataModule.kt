package com.timerproject.alarmmanagerroomdnotifications.data.di

import android.content.Context
import com.timerproject.alarmmanagerroomdnotifications.data.local.ReminderDao
import com.timerproject.alarmmanagerroomdnotifications.data.local.ReminderDatabase
import com.timerproject.alarmmanagerroomdnotifications.data.repository.ReminderRepoImpl
import com.timerproject.alarmmanagerroomdnotifications.domain.repository.ReminderRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DataModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context):ReminderDatabase{
        return ReminderDatabase.getInstance(context)
    }

    @Provides
    fun provideDao(reminderDatabase: ReminderDatabase):ReminderDao{
        return reminderDatabase.getReminderDao()
    }

    @Provides
    fun provideReminderRepo(reminderDao: ReminderDao): ReminderRepository{
        return ReminderRepoImpl(reminderDao)
    }

}