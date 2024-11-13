package com.emr_system.Model;

public class GeneralMedicalRecord extends MedicalRecord implements Recordable {
    public GeneralMedicalRecord(int recordId, String patientName, String diagnosis, String treatment, String labResults) {
        super(recordId, patientName, diagnosis, treatment, labResults);
    }

    @Override
    public void viewMedicalHistory() {
        System.out.println("General Medical History for " + getPatientName() + ": " + getDiagnosis());
    }

    @Override
    public void updateDiagnosis(String diagnosis) {
        System.out.println("Updating diagnosis for " + getPatientName() + " to: " + diagnosis);
    }

    @Override
    public void generateReport() {
        System.out.println("Generating report for " + getPatientName());
    }
}

