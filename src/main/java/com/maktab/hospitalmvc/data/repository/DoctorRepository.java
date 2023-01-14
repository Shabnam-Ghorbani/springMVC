package com.maktab.hospitalmvc.data.repository;


import com.maktab.hospitalmvc.data.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
