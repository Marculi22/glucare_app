package com.uade.glucare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.uade.glucare.model.Reminder;

@Repository
public interface ReminderRepository extends JpaRepository<Reminder, Long> {
}
