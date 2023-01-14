package com.maktab.hospitalmvc.controller;

import com.maktab.hospitalmvc.data.dto.LoginRequest;
import com.maktab.hospitalmvc.exception.NoSuchUserFound;
import com.maktab.hospitalmvc.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
public class PatientController {
    private final PatientService patientService;

    @PostMapping("/logIn")
    public void logIn(@RequestBody LoginRequest loginRequest) {
        try {
            patientService.logIn(loginRequest);
        } catch (NoSuchUserFound e) {
            System.err.println("not found user ! ");
        }
    }
}
