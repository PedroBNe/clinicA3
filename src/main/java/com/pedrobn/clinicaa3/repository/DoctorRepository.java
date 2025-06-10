package com.pedrobn.clinicaa3.repository;

import com.pedrobn.clinicaa3.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
