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

public class Person {
    String id;
    String userName;
    String password;
    String userType;
    String name;
    //Patient
    int age;
    String gender;
    String house;
    String community;
    String city;
    //Doctor
    String physicianType;
    //hospitalAdmin
    String hospitalName;
   
    static public List<Person> personDirectory= new ArrayList<Person>();
    
    public Person() {
    }

    public Person(String id, String userName, String password, String userType, String name, int age, String gender, String house, String community, String city, String physicianType, String hospitalName) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.userType = userType;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.house = house;
        this.community = community;
        this.city = city;
        this.physicianType = physicianType;
        this.hospitalName = hospitalName;
        
    }

    @Override
    public String toString() {
        return userType;
//        return "Person{" + "userName=" + userName + ", password=" + password + ", userType=" + userType + ", name=" + name + ", age=" + age + ", gender=" + gender + ", house=" + house + ", city=" + city + ", physicianType=" + physicianType + ", hospitalName=" + hospitalName + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
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

    public String getPhysicianType() {
        return physicianType;
    }

    public void setPhysicianType(String physicianType) {
        this.physicianType = physicianType;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public static List<Person> getPersonDirectory() {
        return personDirectory;
    }

    public static void setPersonDirectory(List<Person> personDirectory) {
        Person.personDirectory = personDirectory;
    }
    
    public void  addNewPerson(String id, String userName, String password, String userType, String name, int age, String gender, String house, String community, String city, String physicianType, String hospitalName) 
    {  
        personDirectory.add(new Person(id, userName, password, userType, name, age, gender, house, community, city, physicianType, hospitalName));
        System.out.println(personDirectory.size()-1);
        System.out.println("Added Successfully !!");
    }
    public void updatePerson(Person per, int perIndex){
        personDirectory.set(perIndex, per);
    }

    public void deletePerson(Person per) {
        personDirectory.remove(per);
    }
           
}
