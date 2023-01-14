package com.maktab.hospitalmvc.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Prescription extends BaseEntity {
    @OneToOne
    Patient patient;
    @OneToOne
    Doctor doctor;
    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    Date date;
    String description;
}