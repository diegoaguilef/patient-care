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
public class BoxDAO {
    private static ArrayList<Box> boxes = new ArrayList<>();
    
    /**
     *
     * @return
     */
    public static ArrayList<Box> boxList(){ return boxes; }
    
    /**
     *
     * @param box
     * @return
     */
    public static boolean create(Box box){
        for(Box b : boxes){
            if(b.getAttentionNumber() == box.getAttentionNumber() ||
                    box.getPatient().getRut().equals(b.getPatient().getRut())){
                return false;
            }
        }
        
        boxes.add(box);
        return true;
    }
    
    /**
     *
     * @param box
     * @return
     */
    public static boolean update(Box box){
        int i = 0;
        for(Box b : boxes){
            if(b.getAttentionNumber()== box.getAttentionNumber()){
                boxes.set(i, box);
                return true;
            }
            i++;
        }
        return false;
    }
    
    /**
     *
     * @param number
     * @return
     */
    public static Box search(int number){
        Box box = null;
        for(Box b : boxes){
            if(b.getAttentionNumber() == number){
                box = b;
            }
        }
        return box;
    }
    
    /**
     *
     * @param number
     * @return
     */
    public static boolean delete(int number){
        for(Box b : boxes){
            if(b.getAttentionNumber() == number){
                boxes.remove(b);
                return true;
            }
        }
        return false;
    }
    
    
    
}
