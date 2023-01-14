package com.maktab.hospitalmvc.data.model;

import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@MappedSuperclass
public abstract class Person extends BaseEntity {
    String name;
    String family;
    String nationalCode;
}