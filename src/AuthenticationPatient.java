
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hanee
 */
public class AuthenticationPatient {
    
    private ArrayList<String> patientEmail;
    private ArrayList<String> patientPasswords;

    public AuthenticationPatient() {
        patientEmail = new ArrayList<>();
        patientPasswords = new ArrayList<>();
    }

    public void addCredentials(String email, String password) {
        patientEmail.add(email);
        patientPasswords.add(password);
    }
    
    public boolean authenticate(String email, String password) {
        int idIndex = patientEmail.indexOf(email);
        
        int passwordIndex = patientPasswords.indexOf(password);
       
        if (idIndex != -1 && passwordIndex != -1) {
            
            if (patientEmail.get(idIndex).equals(email)&& patientPasswords.get(passwordIndex).equals(password)){
                return true;
            }
         
        }
        return false;
    }
    
    public void initCred(){
        addCredentials("patient1@email.com", "123456");        
        addCredentials("patient2@email.com", "123456");

    }
    
}
