package com.maktab.hospitalmvc.service;

import com.maktab.hospitalmvc.data.dto.LoginRequest;
import com.maktab.hospitalmvc.data.model.Patient;
import com.maktab.hospitalmvc.data.repository.PatientRepository;
import com.maktab.hospitalmvc.exception.NoSuchUserFound;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;

    /*public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }*/


    public void register(Patient patient) {
        patientRepository.save(patient);
    }

    public Patient logIn(LoginRequest loginRequest) throws NoSuchUserFound {
        Patient patient = patientRepository.findByUsername(loginRequest.getUsername()).
                orElseThrow(() -> new NoSuchUserFound("the username dose not exist"));
        if (!patient.getPassword().equals(loginRequest.getPassword()))
            throw new NoSuchUserFound("the password is not correct");
        return patient;
    }

    public void changePassword(String newPassword, Patient patient) {
        patient.setPassword(newPassword);
        patientRepository.save(patient);
    }
}

