/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservationObjects;

import FlightReservationExceptions.PasswordDoesntMatchEmailException;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Zahera
 */
public abstract class Person {
    public Person(){
    }
    public Person(String firstName, String LastName, String email, LocalDate birthDate,String password) {
        this.firstName = firstName;
        this.LastName = LastName;
        this.email = email;
        this.password= password;
        this.birthDate = birthDate;
      
    }
    
    private String firstName;
    private String LastName;
    private String email;
    private LocalDate birthDate;
    private String password;
    private boolean LoggedIn; 
    private boolean gender;//true for male, false for female
    

    /**
     * 
     * @return true for male, false for female 
     */
    public boolean isGender() {
        return gender;
    }
    /**
     * set true for male, false for female
     * @param gender 
     */
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

    public Person(String firstName, String LastName, String email,String password) {
        this.firstName = firstName;
        this.LastName = LastName;
        this.email = email;
        this.password= password;
    }
   

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isLoggedIn() {
        return LoggedIn;
    }

    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", LastName=" + LastName 
                + ", email=" + email + ", birthDate=" + birthDate + ", LoggedIn=" + LoggedIn + '}';
    }

    public void setLoggedIn(boolean LoggedIn) {
        this.LoggedIn = LoggedIn;
    }

   
    
    public static LocalDate fromIntToLocalDate(int year,int month,int day){
        LocalDate localDate;
        localDate=LocalDate.of(year,month, day);
                       
        return localDate;
    }
  
    
}
