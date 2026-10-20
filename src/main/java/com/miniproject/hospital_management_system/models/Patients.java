package com.miniproject.hospital_management_system.models;

import com.miniproject.hospital_management_system.models.enums.BloodGroup;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

//name, gender, birth_date, email, blood_group
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Patients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private LocalDate BirthDate;

    @Column(nullable = false)
    private  String email;

    @Column(nullable = false)
    private BloodGroup bloodGroup;

    @JoinColumn(name = "Insurance_Id")
    @OneToOne
    private Insurance insurance;
}
