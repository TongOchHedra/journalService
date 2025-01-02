package com.example.journalservice.Model.DTO;

public class ConditionRequest {
    private long patient_Id;
    private String conditionDescription;

    // Getters and Setters
    public long getPatient_Id() {
        return patient_Id;
    }

    public void setPatient_Id(long patient_Id) {
        this.patient_Id = patient_Id;
    }

    public String getConditionDescription() {
        return conditionDescription;
    }

    public void setConditionDescription(String conditionDescription) {
        this.conditionDescription = conditionDescription;
    }
}
