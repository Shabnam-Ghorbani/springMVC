package com.maktab.hospitalmvc.data.repository;


import com.maktab.hospitalmvc.data.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    @Modifying
    @Query()
    void updateAppointment();
}
