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
public class PatientDAO {
    private static final ArrayList<Patient> patients = new ArrayList<>();
    
    /**
     *
     * @return
     */
    public static ArrayList<Patient> patientList(){ return patients; }
    
    /**
     *
     */
    public static void fillPatients(){
        create(new Patient("La Pintana", "ISAPRE", null, false, "Diego", "1-1", 25, "M"));
        create(new Patient("La Pintana", "FONASA", null, false, "Abel", "2-2", 30, "M"));
        create(new Patient("El Bosque", "FONASA", null, false, "Ana", "3-3", 40, "F"));
        create(new Patient("San Bernardo", "ISAPRE", null, false, "Maria", "4-4", 21, "F"));
        create(new Patient("Providencia", "FONASA", null, false, "Sebastian", "5-5", 28, "M"));
    }
    
    /**
     *
     * @param patient
     * @return
     */
    public static boolean create(Patient patient){
        if (!patients.stream().noneMatch((b) -> (b.getRut().equals(patient.getRut())))) {
            return false;
        }
        patients.add(patient);
        return true;
    }
    
    /**
     *
     * @param patient
     * @return
     */
    public static boolean update(Patient patient){
        int i = 0;
        for(Patient p : patients){
            if(p.getRut().equals(patient.getRut())){
                patients.set(i, patient);
                return true;
            }
            i++;
        }
        return false;
    }
    
    /**
     *
     * @param rut
     * @return
     */
    public static Patient search(String rut){
        Patient patient = null;
        for(Patient p : patients){
            if(p.getRut().equals(rut)){
                patient = p;
            }
        }
        return patient;
    }
    
    /**
     *
     * @param name
     * @return
     */
    public static Patient findByName(String name){
        Patient patient = null;
        for(Patient p : patients){
            if(p.getName().equals(name)){
                patient = p;
            }
        }
        return patient;
    }
    
    /**
     *
     * @param rut
     * @return
     */
    public static boolean delete(String rut){
        for(Patient p : patients){
            if(p.getRut().equals(rut)){
                patients.remove(p);
                return true;
            }
        }
        return false;
    }
}
