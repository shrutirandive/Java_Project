/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class HospitalAdmin {
    String name;
    String gender;
    String hospitalName;
    String city;
    static public List<HospitalAdmin> hospitalDirectory= new ArrayList<HospitalAdmin>();

    public HospitalAdmin(){
    }
    
    public HospitalAdmin(String name, String gender, String hospitalName, String city) {
        this.name = name;
        this.gender = gender;
        this.hospitalName = hospitalName;
        this.city = city;
    }

    @Override
    public String toString() {
//        return "HospitalAdmin{" + "name=" + name + ", gender=" + gender + ", hospitalName=" + hospitalName + ", city=" + city + '}';
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

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static List<HospitalAdmin> getHospitalDirectory() {
        return hospitalDirectory;
    }

    public static void setHospitalDirectory(List<HospitalAdmin> hospitalDirectory) {
        HospitalAdmin.hospitalDirectory = hospitalDirectory;
    }
    
    public void  addNewHospitalAdmin(String name, String gender, String hospitalName, String city) 
    {
        
        hospitalDirectory.add(new HospitalAdmin(name, gender, hospitalName, city));
        for(HospitalAdmin ha:hospitalDirectory){
            System.out.println(ha.name+ha.hospitalName);
            System.out.println(getHospitalDirectory());
            System.out.println(hospitalDirectory.size()-1);
        }
        //return persondirectory;
    }
    public void updateHospitalAdmin(HospitalAdmin ha, int haIndex){
        hospitalDirectory.set(haIndex, ha);
    }

    public void deleteHospitalAdmin(HospitalAdmin ha) {
        hospitalDirectory.remove(ha);
    }
   
}
