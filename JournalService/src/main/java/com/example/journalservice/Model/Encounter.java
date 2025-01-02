package com.example.journalservice.Model;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "encounters")
public class Encounter {
   @Id 
   @GeneratedValue (strategy = GenerationType.AUTO)
   @Column(name = "id")
   private long id;
   @JoinColumn(name = "patient_id")
   private User patient;
   @JoinColumn(name = "practitioner_id")
   private User practitioner;
   @Column(name = "encounter_time")
   private LocalDateTime encounterTime;
   public Encounter() {
}

// Parameterized constructor
public Encounter(User patient, User practitioner, LocalDateTime encounterTime) {
    this.patient = patient;
    this.practitioner = practitioner;
    this.encounterTime = encounterTime;
}

// Getters and Setters
public long getId() {
    return id;
}

public void setId(long id) {
    this.id = id;
}

public User getPatient() {
    return patient;
}

public void setPatient(User patient) {
    this.patient = patient;
}
public User getPractitioner() {
    return practitioner;
}

public void setPractitioner(User practitioner) {
    this.practitioner = practitioner;
}

public LocalDateTime getEncounterTime() {
    return encounterTime;
}

public void setEncounterTime(LocalDateTime encounterTime) {
    this.encounterTime = encounterTime;
}
}
