package com.maktab.hospitalmvc.service;

import com.maktab.hospitalmvc.data.dto.DoctorDto;
import com.maktab.hospitalmvc.data.model.Doctor;
import com.maktab.hospitalmvc.data.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorService {
    private final DoctorRepository doctorRepository;
    private final ModelMapper modelMapper;

    public List<DoctorDto> getAllDoctors() {
        List<Doctor> doctors = doctorRepository.findAll();
        List<DoctorDto> doctorDtoList = new ArrayList<>();
        for (Doctor doctor : doctors) {
            //DoctorDto doctorDto = modelMapper.map(doctor, DoctorDto.class);
            DoctorDto dto = new DoctorDto();
            modelMapper.map(doctor, dto);

        }
        return doctorDtoList;
    }
}