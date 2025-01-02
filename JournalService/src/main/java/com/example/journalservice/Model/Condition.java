package com.example.journalservice.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "conditions")

public class Condition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private User patient;
    @Column(name = "id")
    private String condition;

    public Condition(long id, User patient, String condition) {
        this.id = id;
        this.patient = patient;
        this.condition = condition;
    }
    public Condition() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public User getPatient() {
        return patient;
    }

    public void setPatient(User patient) {
        this.patient = patient;
    }
}