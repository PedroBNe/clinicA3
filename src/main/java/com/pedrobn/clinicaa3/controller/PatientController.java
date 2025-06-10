package com.pedrobn.clinicaa3.controller;

import com.pedrobn.clinicaa3.model.Patient;
import com.pedrobn.clinicaa3.service.PatientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {
    private final PatientService service;

    public PatientController(PatientService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Patient> create(@RequestBody Patient patient) {
        return ResponseEntity.ok(service.save(patient));
    }

    @GetMapping
    public ResponseEntity<List<Patient>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Patient> findById(@PathVariable Long id) {
        Patient patient = service.findById(id);
        return patient != null ? ResponseEntity.ok(patient) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
