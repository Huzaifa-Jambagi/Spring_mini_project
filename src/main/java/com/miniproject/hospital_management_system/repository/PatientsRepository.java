package com.miniproject.hospital_management_system.repository;

import com.miniproject.hospital_management_system.models.Patients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientsRepository extends JpaRepository<Patients, Long> {
}