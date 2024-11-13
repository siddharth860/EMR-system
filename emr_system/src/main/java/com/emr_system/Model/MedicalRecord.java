package com.emr_system.Model;

public abstract class MedicalRecord {
    private int recordId;
    private String patientName;
    private String diagnosis;
    private String treatment;
    private String labResults;

    public MedicalRecord(int recordId, String patientName, String diagnosis, String treatment, String labResults) {
        this.recordId = recordId;
        this.patientName = patientName;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.labResults = labResults;
    }

    public int getRecordId() {
        return recordId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public String getLabResults() {
        return labResults;
    }

    public abstract void viewMedicalHistory();
    public abstract void updateDiagnosis(String diagnosis);
    public abstract void generateReport();
}


