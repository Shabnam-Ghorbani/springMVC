package com.maktab.hospitalmvc.service;

import com.maktab.hospitalmvc.data.model.Appointment;
import com.maktab.hospitalmvc.data.model.Doctor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminService {
    private final AppointmentService appointmentService;


    public void saveAppointmentList(List<Appointment> appointmentList) {
        appointmentService.saveListOfAppointment(appointmentList);
    }

    public List<Appointment> generateAppointmentByAdmin(Date date, int count, Doctor doctor) {
        List<Appointment> appointmentList = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 8);
        calendar.set(Calendar.MINUTE, 0);
        for (int i = 0; i <= count; i++) {
            Appointment appointment = new Appointment();
            calendar.add(Calendar.MINUTE, 30);
            appointment.setDate(calendar.getTime());
            appointment.setDoctor(doctor);
            appointmentList.add(appointment);
        }
        return appointmentList;
    }


}