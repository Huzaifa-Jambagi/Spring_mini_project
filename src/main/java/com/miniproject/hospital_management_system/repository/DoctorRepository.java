package com.miniproject.hospital_management_system.repository;

import com.miniproject.hospital_management_system.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}