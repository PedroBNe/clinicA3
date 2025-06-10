package com.pedrobn.clinicaa3.service;

import com.pedrobn.clinicaa3.model.Doctor;
import com.pedrobn.clinicaa3.repository.DoctorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    private final DoctorRepository repository;

    public DoctorService(DoctorRepository repository) {
        this.repository = repository;
    }

    public Doctor save(Doctor doctor) {
        return repository.save(doctor);
    }

    public List<Doctor> findAll() {
        return repository.findAll();
    }

    public Doctor findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
