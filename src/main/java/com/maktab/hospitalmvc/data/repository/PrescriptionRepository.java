package com.maktab.hospitalmvc.data.repository;


import com.maktab.hospitalmvc.data.model.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {
}