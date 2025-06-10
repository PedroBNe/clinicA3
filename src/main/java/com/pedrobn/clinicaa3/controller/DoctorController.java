package com.pedrobn.clinicaa3.controller;

import com.pedrobn.clinicaa3.model.Doctor;
import com.pedrobn.clinicaa3.service.DoctorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
    private final DoctorService service;

    public DoctorController(DoctorService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Doctor> create(@RequestBody Doctor doctor) {
        return ResponseEntity.ok(service.save(doctor));
    }

    @GetMapping
    public ResponseEntity<List<Doctor>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Doctor> findById(@PathVariable Long id) {
        Doctor doctor = service.findById(id);
        return doctor != null ? ResponseEntity.ok(doctor) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
