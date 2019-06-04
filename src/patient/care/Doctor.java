/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient.care;

/**
 *
 * @author kdieg
 */
public class Doctor extends Person{
    private String speciality;

    /**
     *
     * @param speciality
     * @param name
     * @param rut
     * @param age
     * @param gender
     */
    public Doctor(String speciality, String name, String rut, int age, String gender) {
        super(name, rut, age, gender);
        this.speciality = speciality;
    }

    /**
     *
     * @return
     */
    public String getSpeciality() {
        return speciality;
    }

    /**
     *
     * @param speciality
     */
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Doctor " + "Especialidad: " + speciality + '|';
    }

    
}
