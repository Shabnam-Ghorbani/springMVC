package com.maktab.hospitalmvc.data.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DoctorDto {
    String name;
    String family;
    String nationalCode;
    String specialty;
    String code;
}
