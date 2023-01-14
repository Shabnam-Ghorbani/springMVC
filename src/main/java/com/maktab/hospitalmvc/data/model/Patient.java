package com.maktab.hospitalmvc.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Data
public class Patient extends Person {
    String username;
    String password;
    @OneToMany
    Set<Prescription> prescriptionSet;
}
