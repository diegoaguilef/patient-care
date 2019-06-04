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
public class Person {
    private String name;
    private String rut;
    private int age;
    private String gender;

    /**
     *
     * @param name
     * @param rut
     * @param age
     * @param gender
     */
    public Person(String name, String rut, int age, String gender) {
        this.name = name;
        this.rut = rut;
        this.age = age;
        this.gender = gender;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getRut() {
        return rut;
    }

    /**
     *
     * @param rut
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     *
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return
     */
    public String getGender() {
        return gender;
    }

    /**
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Persona = " + "Nombre: " + name + ", Rut: " + rut + ", Edad: " + age + ", Género: " + gender + "| ";
    }
}
