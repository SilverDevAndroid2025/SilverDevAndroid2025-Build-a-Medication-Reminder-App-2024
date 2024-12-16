package com.timerproject.alarmmanagerroomdnotifications.domain.use_cases

import com.timerproject.alarmmanagerroomdnotifications.domain.model.Reminder
import com.timerproject.alarmmanagerroomdnotifications.domain.repository.ReminderRepository
import javax.inject.Inject

class DeleteUseCase @Inject constructor(private val reminderRepository: ReminderRepository) {
    suspend operator fun invoke(reminder: Reminder) = reminderRepository.delete(reminder)
}