package com.timerproject.alarmmanagerroomdnotifications.domain.use_cases

import com.timerproject.alarmmanagerroomdnotifications.domain.repository.ReminderRepository
import javax.inject.Inject

class GetAllReminderUseCase @Inject constructor(private val reminderRepository: ReminderRepository) {
    operator fun invoke() = reminderRepository.getAllReminders()
}