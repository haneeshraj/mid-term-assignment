/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;

/**
 *
 * @author hanee
 */
public class AuthenticationDoctor {
      private ArrayList<String> doctorEmail;
    private ArrayList<String> doctorPasswords;

    public AuthenticationDoctor() {
        doctorEmail = new ArrayList<>();
        doctorPasswords = new ArrayList<>();
    }

    public void addCredentials(String email, String password) {
        doctorEmail.add(email);
        doctorPasswords.add(password);
    }
    
    public boolean authenticate(String email, String password) {
        int idIndex = doctorEmail.indexOf(email);
        
        int passwordIndex = doctorPasswords.indexOf(password);
       
        if (idIndex != -1 && passwordIndex != -1) {
            
            if (doctorEmail.get(idIndex).equals(email)&& doctorPasswords.get(passwordIndex).equals(password)){
                return true;
            }
         
        }
        return false;
    }
    
    public void initCred(){
        addCredentials("doctor1@email.com", "123456");        
        addCredentials("doctor2@email.com", "123456");

    }
}
