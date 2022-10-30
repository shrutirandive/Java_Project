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
    String Patientname;
    String doctorName;
    Double temperature;
    Double bloodPressure;
    
    static public List<VitalSigns> vitalSigns= new ArrayList<VitalSigns>();
    
    public VitalSigns(){
        
    }

    public VitalSigns(String Patientname, String doctorName, Double temperature, Double bloodPressure) {
        this.Patientname = Patientname;
        this.doctorName = doctorName;
        this.temperature = temperature;
        this.bloodPressure = bloodPressure;
    }

    @Override
    public String toString() {
        return doctorName;
//        return "VitalSigns{" + "Patientname=" + Patientname + ", doctorName=" + doctorName + ", temperature=" + temperature + ", bloodPressure=" + bloodPressure + '}';
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

    public static List<VitalSigns> getVitalSigns() {
        return vitalSigns;
    }

    public static void setVitalSigns(List<VitalSigns> vitalSigns) {
        VitalSigns.vitalSigns = vitalSigns;
    }

    public String getPatientname() {
        return Patientname;
    }

    public void setPatientname(String Patientname) {
        this.Patientname = Patientname;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    
    
    public void  addNewVitalSigns(String Patientname, String doctorName, Double temperature, Double bloodPressure) 
    {
        vitalSigns.add(new VitalSigns(Patientname,doctorName,temperature,bloodPressure));
        System.out.println("Vital Signs for Patient Added Successfully !!");
      }
    
    public List<VitalSigns> getList() {
       return vitalSigns;
   }
}
