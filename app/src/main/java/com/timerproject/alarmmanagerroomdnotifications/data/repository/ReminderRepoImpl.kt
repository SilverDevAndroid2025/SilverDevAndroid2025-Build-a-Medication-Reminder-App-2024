package com.timerproject.alarmmanagerroomdnotifications.data.repository

import com.timerproject.alarmmanagerroomdnotifications.data.local.ReminderDao
import com.timerproject.alarmmanagerroomdnotifications.domain.model.Reminder
import com.timerproject.alarmmanagerroomdnotifications.domain.repository.ReminderRepository
import kotlinx.coroutines.flow.Flow

class ReminderRepoImpl(private val reminderDao: ReminderDao) : ReminderRepository {
    override suspend fun insert(reminder: Reminder) {
        reminderDao.insert(reminder)
    }

    override suspend fun update(reminder: Reminder) {
        reminderDao.update(reminder)
    }

    override suspend fun delete(reminder: Reminder) {
        reminderDao.delete(reminder)
    }

    override fun getAllReminders(): Flow<List<Reminder>> = reminderDao.getAllReminder()

}