/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Patient {
    String name;
    int age;
    String gender;
    String house;
    String community;
    String city;
    
    static public List<Patient> patientDirectory= new ArrayList<Patient>();
   
//    private VitalSigns vitalsigns;
    
    public Patient() {
    }
    
    public Patient(String name, int age, String gender, String house, String community, String city) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.house = house;
        this.community = community;
        this.city = city;
    }

    @Override
    public String toString() {
        return name;
//        return "Patient{" + "name=" + name + ", age=" + age + ", gender=" + gender + ", house=" + house + ", city=" + city + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static List<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public static void setPatientDirectory(List<Patient> patientDirectory) {
        Patient.patientDirectory = patientDirectory;
    }
    
    
    public void  addNewPatients(String name, int age, String gender, String house, String community, String city) 
    {
        patientDirectory.add(new Patient(name, age, gender, house, community, city));
        System.out.println("Patient Added Successfully !!");
    }
    public void updatePatient(Patient patient, int patientIndex){
        patientDirectory.set(patientIndex, patient);
    }

    public void deletePatient(Patient patient) {
        patientDirectory.remove(patient);
    }
}
