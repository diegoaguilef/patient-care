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
public class Patient extends Person{
    private String commune;
    private String insurance;
    private Date lastAttention;
    private boolean inTreatment;

    /**
     *
     * @param commune
     * @param insurance
     * @param lastAttention
     * @param inTreatment
     * @param name
     * @param rut
     * @param age
     * @param gender
     */
    public Patient(String commune, String insurance, Date lastAttention, boolean inTreatment, String name, String rut, int age, String gender) {
        super(name, rut, age, gender);
        this.commune = commune;
        this.insurance = insurance;
        this.lastAttention = lastAttention;
        this.inTreatment = inTreatment;
    }

    /**
     *
     * @return
     */
    public String getCommune() {
        return commune;
    }

    /**
     *
     * @param commune
     */
    public void setCommune(String commune) {
        this.commune = commune;
    }

    /**
     *
     * @return
     */
    public String getInsurance() {
        return insurance;
    }

    /**
     *
     * @param insurance
     */
    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    /**
     *
     * @return
     */
    public Date getLastAttention() {
        return lastAttention;
    }

    /**
     *
     * @param lastAttention
     */
    public void setLastAttention(Date lastAttention) {
        this.lastAttention = lastAttention;
    }

    /**
     *
     * @return
     */
    public boolean isInTreatment() {
        return inTreatment;
    }
    
    /**
     *
     * @return
     */
    public String treatmentString(){
        return inTreatment ? "Si" : "No";
    }

    /**
     *
     * @param inTreatment
     */
    public void setInTreatment(boolean inTreatment) {
        this.inTreatment = inTreatment;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Paciente " + "Nombre: " + super.getName() + 
                ", Rut: " + super.getRut() + 
                ", Comuna: " + commune + 
                ", Prevision: " + insurance + 
                ", ültima atención: =" + lastAttention + 
                ", En Tratamiento: " + treatmentString() + '|';
    }
    
}
