/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author user
 */
public class Doctor {
    String name;
    String gender;
    String physicianType;
    String house;
    String city;
    //hospital name can be extracted from hospital admin profile also instaed of taking from textbox
    String hospitalName; 
    static public List<Doctor> doctorDirectory= new ArrayList<Doctor>();
//    static public List<Doctor> doctorInHospitalDirectory= new ArrayList<Doctor>();
    static public Set<Doctor> doctorInHospitalDirectory = new HashSet<Doctor>();
    static public List<Doctor> encounterHistory= new ArrayList<Doctor>();
    
    public Doctor() {
    }

    public Doctor(String name, String gender, String physicianType, String house, String city, String hospitalName) {
        this.name = name;
        this.gender = gender;
        this.physicianType = physicianType;
        this.house = house;
        this.city = city;
        this.hospitalName = hospitalName;
    }

    @Override
    public String toString() {
//        return "Doctor{" + "name=" + name + ", gender=" + gender + ", physicianType=" + physicianType + ", house=" + house + ", city=" + city + ", hospitalName=" + hospitalName + '}';
            return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhysicianType() {
        return physicianType;
    }

    public void setPhysicianType(String physicianType) {
        this.physicianType = physicianType;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public static List<Doctor> getDoctorDirectory() {
        return doctorDirectory;
    }

    public static void setDoctorDirectory(List<Doctor> doctorDirectory) {
        Doctor.doctorDirectory = doctorDirectory;
    }

    public static Set<Doctor> getDoctorInHospitalDirectory() {
        return doctorInHospitalDirectory;
    }

    public static void setDoctorInHospitalDirectory(Set<Doctor> doctorInHospitalDirectory) {
        Doctor.doctorInHospitalDirectory = doctorInHospitalDirectory;
    }

    public static List<Doctor> getEncounterHistory() {
        return encounterHistory;
    }

    public static void setEncounterHistory(List<Doctor> encounterHistory) {
        Doctor.encounterHistory = encounterHistory;
    }
    
    public void  addNewDoctors(String name, String gender, String physicianType, String house, String city, String hospitalName) 
    {
        doctorDirectory.add(new Doctor(name, gender, physicianType, house, city, hospitalName));
        System.out.println(doctorDirectory.size()-1);
        System.out.println("Doctor Added Successfully !!");
    }
    
    public void updateDoctor(Doctor doc, int docIndex){
        doctorDirectory.set(docIndex, doc);
    }

    public void deleteDoctor(Doctor doc) {
        doctorDirectory.remove(doc);
    }
    public void addDoctorInHospital(String name, String gender, String physicianType, String house, String city, String hospitalName){
//        Doctor docHosp = new Doctor();
        doctorInHospitalDirectory.add(new Doctor(name, gender, physicianType, house, city, hospitalName));
        System.out.println("Doctor Added Successfully in Hospital");
        System.out.println(doctorInHospitalDirectory.size()-1);   
    }
    public void patientAddDoctors(String name, String gender, String physicianType, String hospitalName){
        encounterHistory.add(new Doctor(name, gender, physicianType, house, city, hospitalName));
    }
}
