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
public class CommunityAdmin {
    String name;
    String gender;
    String house;
    String city;
    static public List<CommunityAdmin> communityAdminDirectory= new ArrayList<CommunityAdmin>();
    
    public CommunityAdmin(){
    }

    public CommunityAdmin(String name, String gender, String house, String city) {
        this.name = name;
        this.gender = gender;
        this.house = house;
        this.city = city;
    }

    @Override
    public String toString() {
        return name;
//        return "CommunityAdmin{" + "name=" + name + ", gender=" + gender + ", house=" + house + ", city=" + city + '}';
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

    public static List<CommunityAdmin> getCommunityAdminDirectory() {
        return communityAdminDirectory;
    }

    public static void setCommunityAdminDirectory(List<CommunityAdmin> communityAdminDirectory) {
        CommunityAdmin.communityAdminDirectory = communityAdminDirectory;
    }
    public void  addNewCommunityAdmin(String name, String gender, String house, String city) 
    {
        communityAdminDirectory.add(new CommunityAdmin(name, gender, house, city));
        for(CommunityAdmin ca:communityAdminDirectory){
            System.out.println("community name- "+ca.name+"     "+"community house- "+ca.house);
            System.out.println(getCommunityAdminDirectory());
            System.out.println(communityAdminDirectory.size()-1);
        }
    }
    public void updateCommunityAdmin(CommunityAdmin ca, int caIndex){
        communityAdminDirectory.set(caIndex, ca);
    }

    public void deleteCommunityAdmin(CommunityAdmin ca) {
        communityAdminDirectory.remove(ca);
    }
}
    
