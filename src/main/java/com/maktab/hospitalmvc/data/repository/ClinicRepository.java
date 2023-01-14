package com.maktab.hospitalmvc.data.repository;

import com.maktab.hospitalmvc.data.model.Clinic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicRepository extends JpaRepository<Clinic, Long> {
    Clinic findByName(String clinicName);
}
