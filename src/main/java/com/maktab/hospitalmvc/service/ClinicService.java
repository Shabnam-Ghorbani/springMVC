package com.maktab.hospitalmvc.service;


import com.maktab.hospitalmvc.data.model.Clinic;
import com.maktab.hospitalmvc.data.model.Doctor;
import com.maktab.hospitalmvc.data.repository.ClinicRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class ClinicService {
    private final ClinicRepository clinicRepository;

    public ClinicService(ClinicRepository clinicRepository) {
        this.clinicRepository = clinicRepository;
    }

    public List<Clinic> showClinicList() {
        return clinicRepository.findAll();
    }

    public Set<Doctor> showDoctorList(String clinicName) {
        return clinicRepository.findByName(clinicName).getDoctorSet();
    }

}