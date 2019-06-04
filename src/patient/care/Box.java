/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient.care;

import java.util.ArrayList;

/**
 *
 * @author kdieg
 */
public class Box {
    private Patient patient;
    private Doctor doctor;
    private int number;
    private int attentionNumber;

    /**
     *
     * @param patient
     * @param doctor
     * @param number
     * @param attentionNumber
     */
    public Box(Patient patient, Doctor doctor, int number, int attentionNumber) {
        this.patient = patient;
        this.doctor = doctor;
        this.number = number;
        this.attentionNumber = attentionNumber;
    }

    /**
     *
     * @return
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     *
     * @param patient
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     *
     * @return
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     *
     * @param doctor
     */
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    /**
     *
     * @return
     */
    public int getNumber() {
        return number;
    }

    /**
     *
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }
    
    /**
     *
     * @return
     */
    public int getAttentionNumber() {
        return attentionNumber;
    }

    /**
     *
     * @param attentionNumber
     */
    public void setAttentionNumber(int attentionNumber) {
        this.attentionNumber = attentionNumber;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Box " + "Paciente: " + patient + 
                ",\n\t  Doctor: " + doctor + 
                ",\n\t Número Box: " + number + ", Número Atención: " + attentionNumber + '|';
    }
    
    

    
}
