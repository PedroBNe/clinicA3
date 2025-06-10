package com.pedrobn.clinicaa3.repository;

import com.pedrobn.clinicaa3.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
