package com.pedrobn.clinicaa3.repository;

import com.pedrobn.clinicaa3.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
