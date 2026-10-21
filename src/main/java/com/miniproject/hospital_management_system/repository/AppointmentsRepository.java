package com.miniproject.hospital_management_system.repository;

import com.miniproject.hospital_management_system.models.Appointments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentsRepository extends JpaRepository<Appointments, Long> {
}