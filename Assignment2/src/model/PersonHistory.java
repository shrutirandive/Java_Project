/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class PersonHistory {
    private ArrayList<Person> personDirectory;
    
    public PersonHistory(){
        this.personDirectory = new ArrayList<Person>();
    }
    
    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    public Person addNewPerson(){
        Person newPerson = new Person();
        personDirectory.add(newPerson);
        return newPerson;
    }    
}
