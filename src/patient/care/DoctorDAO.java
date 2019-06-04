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
public class DoctorDAO {
    private static final ArrayList<Doctor> doctors = new ArrayList<>();
    
    /**
     *
     * @return
     */
    public static ArrayList<Doctor> doctorList(){ return doctors; }
    
    /**
     *
     */
    public static void fillDoctors(){
        create(new Doctor("Cardiólogo", "Fabian", "1-2", 40, "M"));
        create(new Doctor("Dermatólogo", "Pamela", "2-3", 39, "F"));
        create(new Doctor("Neurólogo", "Carla", "3-4", 50, "F"));
        create(new Doctor("Pediatra", "Pablo", "4-5", 34, "M"));
        create(new Doctor("Nutricionista", "Constanza", "5-6", 25, "F"));
    }
    
    /**
     *
     * @param doctor
     * @return
     */
    public static boolean create(Doctor doctor){
        if (!doctors.stream().noneMatch((b) -> (b.getRut().equals(doctor.getRut())))) {
            return false;
        }
        doctors.add(doctor);
        return true;
    }
    
    /**
     *
     * @param doctor
     * @return
     */
    public static boolean update(Doctor doctor){
        int i = 0;
        for(Doctor d : doctors){
            if(d.getRut().equals(doctor.getRut())){
                doctors.set(i, doctor);
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
    public static Doctor search(String rut){
        Doctor doctor = null;
        for(Doctor d : doctors){
            if(d.getRut().equals(rut)){
                doctor = d;
            }
        }
        return doctor;
    }
    
    /**
     *
     * @param name
     * @return
     */
    public static Doctor findByName(String name){
        Doctor doctor = null;
        for(Doctor d : doctors){
            if(d.getName().equals(name)){
                doctor = d;
            }
        }
        return doctor;
    }
    
    /**
     *
     * @param rut
     * @return
     */
    public static boolean delete(String rut){
        for(Doctor d : doctors){
            if(d.getRut().equals(rut)){
                doctors.remove(d);
                return true;
            }
        }
        return false;
    }
}
