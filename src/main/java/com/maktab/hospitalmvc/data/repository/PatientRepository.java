package com.maktab.hospitalmvc.data.repository;


import com.maktab.hospitalmvc.data.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    Optional<Patient> findByUsername(String username);

    @Modifying
//    @Query(value = "from Patient p where p.password =:passwords")
    @Query(value = "update ", nativeQuery = true)
    void updatePassword(@Param(value = "passwords") String password);
}
