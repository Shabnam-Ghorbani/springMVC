package com.maktab.hospitalmvc.service;

import com.maktab.hospitalmvc.data.model.Appointment;
import com.maktab.hospitalmvc.data.model.Patient;
import com.maktab.hospitalmvc.data.repository.AppointmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;


    public void saveListOfAppointment(List<Appointment> appointmentList) {
        appointmentRepository.saveAll(appointmentList);
    }

    public Appointment saveAppointmentForPatient(Patient patient, Appointment appointment) {
        appointment.setPatient(patient);
        appointment.setReserved(true);
        appointmentRepository.save(appointment);
        return appointment;
    }
}
