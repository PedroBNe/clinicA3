package com.pedrobn.clinicaa3.service;

import com.pedrobn.clinicaa3.dto.AppointmentDTO;
import com.pedrobn.clinicaa3.model.Appointment;
import com.pedrobn.clinicaa3.model.Doctor;
import com.pedrobn.clinicaa3.model.Patient;
import com.pedrobn.clinicaa3.repository.AppointmentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AppointmentService {
    private final AppointmentRepository repository;
    private final PatientService patientService;
    private final DoctorService doctorService;

    public AppointmentService(AppointmentRepository repository, PatientService patientService, DoctorService doctorService) {
        this.repository = repository;
        this.patientService = patientService;
        this.doctorService = doctorService;
    }

    public Appointment save(AppointmentDTO dto) {
        Appointment appointment = new Appointment();

        Patient patient = patientService.findById(dto.patientId());
        Doctor doctor = doctorService.findById(dto.doctorId());

        if (patient == null || doctor == null) {
            return null;
        }

        appointment.setPatient(patient);
        appointment.setDoctor(doctor);

        appointment.setAppointmentDate(LocalDate.now().atStartOfDay());

        return repository.save(appointment);
    }

    public List<Appointment> findAll() {
        return repository.findAll();
    }

    public Appointment findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
