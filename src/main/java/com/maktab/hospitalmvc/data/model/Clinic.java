package com.maktab.hospitalmvc.data.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.HashSet;
import java.util.Set;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Clinic extends BaseEntity {
    @Column(unique = true)
    String name;
    String address;
    String phone;
    @OneToMany
    Set<Doctor> doctorSet = new HashSet<>();
}
