package com.maktab.hospitalmvc.data.dto;

import com.maktab.hospitalmvc.data.model.Prescription;
import jakarta.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Set;
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PatientDto {
    String name;
    String family;
    String nationalCode;
    String username;
    @OneToMany
    Set<Prescription> prescriptionSet;
}
