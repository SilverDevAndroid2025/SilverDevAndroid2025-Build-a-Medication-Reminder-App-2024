package com.timerproject.alarmmanagerroomdnotifications.domain.repository

import com.timerproject.alarmmanagerroomdnotifications.domain.model.Reminder
import kotlinx.coroutines.flow.Flow

interface ReminderRepository {

    suspend fun insert(reminder: Reminder)
    suspend fun update(reminder: Reminder)
    suspend fun delete(reminder: Reminder)
    fun getAllReminders():Flow<List<Reminder>>
}