package com.miniproject.hospital_management_system.repository;

import com.miniproject.hospital_management_system.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}