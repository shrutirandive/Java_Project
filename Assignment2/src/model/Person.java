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
    String userName;
    String password;
    String userType;
    String name;
    int age;
    String gender;
    String address;
    String city;
    static public List<Person> personDirectory= new ArrayList<Person>();
       
    public Person() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static List<Person> getPersonDirectory() {
        return personDirectory;
    }

    public static void setPersonDirectory(List<Person> personDirectory) {
        Person.personDirectory = personDirectory;
    }

    @Override
    public String toString() {
        return "Person{" + "userName=" + userName + ", password=" + password + ", userType=" + userType + ", name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + ", city=" + city + '}';
    }
    //Constructor
    public Person(String userName, String password, String userType, String name, int age, String gender, String address, String city) {
        this.userName = userName;
        this.password = password;
        this.userType = userType;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.city = city;
    }
    public void  addnewperson(String userName, String password, String userType, String name, int age, String gender, String address, String city) 
    {
        
        personDirectory.add(new Person(userName, password, userType,name,age,gender,address,city));
        
        //return persondirectory;
           }
    
}
