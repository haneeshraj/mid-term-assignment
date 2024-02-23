/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author hanee
 */
public final class Patient {
    
    public String name;
    public String email;
    public String password;
    public String city;
    public String community;
    public String age;
    public String vitals;

    public String getVitals() {
        return vitals;
    }

    public void setVitals(String vitals) {
        this.vitals = vitals;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

 
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }
    
    
    List<Patient> patients = new ArrayList<>();

    public List<Patient> getPatients() {
        return patients;
    }

    public Patient(String name, String email, String password,  String city, String community, String age) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.city = city;
        this.community = community;
        this.age = age;
        
        
        patients.add(this);
        
        System.out.println("New Patient Added: " + this.name);
    }  
    
    
    
}
