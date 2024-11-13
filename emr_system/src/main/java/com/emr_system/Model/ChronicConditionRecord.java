package com.emr_system.Model;

public class ChronicConditionRecord extends MedicalRecord implements Recordable {
    public ChronicConditionRecord(int recordId, String patientName, String diagnosis, String treatment, String labResults) {
        super(recordId, patientName, diagnosis, treatment, labResults);
    }

    @Override
    public void viewMedicalHistory() {
        System.out.println("Chronic Condition History for " + getPatientName() + ": " + getDiagnosis());
    }

    @Override
    public void updateDiagnosis(String diagnosis) {
        System.out.println("Updating chronic diagnosis for " + getPatientName() + " to: " + diagnosis);
    }

    @Override
    public void generateReport() {
        System.out.println("Generating chronic condition report for " + getPatientName());
    }
}
