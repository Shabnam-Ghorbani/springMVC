package com.maktab.hospitalmvc.data.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Appointment extends BaseEntity {
    @OneToOne
    Patient patient;
    @OneToOne
    Doctor doctor;
    @Temporal(TemporalType.TIMESTAMP)
    Date date;
    @Column(columnDefinition = "boolean default false")
    boolean isReserved;
}
