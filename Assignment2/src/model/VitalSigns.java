/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import static model.Patient.patientDirectory;

/**
 *
 * @author user
 */
public class VitalSigns {
    Double temperature;
    Double bloodPressure;
    int weight;
    int height;
    static public List<VitalSigns> vitalSigns= new ArrayList<VitalSigns>();
    
    public VitalSigns(){
        
    }

    public VitalSigns(Double temperature, Double bloodPressure, int weight, int height) {
        this.temperature = temperature;
        this.bloodPressure = bloodPressure;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "VitalSigns{" + "temperature=" + temperature + ", bloodPressure=" + bloodPressure + ", weight=" + weight + ", height=" + height + '}';
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(Double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static List<VitalSigns> getVitalSigns() {
        return vitalSigns;
    }

    public static void setVitalSigns(List<VitalSigns> vitalSigns) {
        VitalSigns.vitalSigns = vitalSigns;
    }
    

    public void  addNewVitalSigns(Double temperature, Double bloodPressure, int weight, int height) 
    {
        vitalSigns.add(new VitalSigns(temperature,bloodPressure,weight, height));
        System.out.println("Vital Signs for Patient Added Successfully !!");
           }
    
    public List<VitalSigns> getList() {
       return vitalSigns;
   }
}
