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
    String community;
    String city;
    static public List<HospitalAdmin> hospitalAdminDirectory= new ArrayList<HospitalAdmin>();
    static public List<String> hospitalDirectory= new ArrayList<>();
    
    public HospitalAdmin(){
    }

    public HospitalAdmin(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    
    public HospitalAdmin(String name, String gender, String hospitalName, String community, String city) {
        this.name = name;
        this.gender = gender;
        this.hospitalName = hospitalName;
        this.community = community;
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

    public static List<HospitalAdmin> getHospitalAdminDirectory() {
        return hospitalAdminDirectory;
    }

    public static void setHospitalAdminDirectory(List<HospitalAdmin> hospitalAdminDirectory) {
        HospitalAdmin.hospitalAdminDirectory = hospitalAdminDirectory;
    }

    public static List<String> getHospitalDirectory() {
        return hospitalDirectory;
    }

    public static void setHospitalDirectory(List<String> hospitalDirectory) {
        HospitalAdmin.hospitalDirectory = hospitalDirectory;
    }

    
    public void  addNewHospitalAdmin(String name, String gender, String hospitalName, String community, String city) 
    {
        
        hospitalAdminDirectory.add(new HospitalAdmin(name, gender, hospitalName, community, city));
        for(HospitalAdmin ha:hospitalAdminDirectory){
            System.out.println(ha.name+ha.hospitalName);
            System.out.println(getHospitalAdminDirectory());
            System.out.println(hospitalAdminDirectory.size()-1);
        }
        //return persondirectory;
    }
    public void updateHospitalAdmin(HospitalAdmin ha, int haIndex){
        hospitalAdminDirectory.set(haIndex, ha);
    }

    public void deleteHospitalAdmin(HospitalAdmin ha) {
        hospitalAdminDirectory.remove(ha);
    }
   
}
