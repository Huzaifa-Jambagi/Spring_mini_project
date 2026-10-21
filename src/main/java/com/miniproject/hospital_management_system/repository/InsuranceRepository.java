package com.miniproject.hospital_management_system.repository;

import com.miniproject.hospital_management_system.models.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}