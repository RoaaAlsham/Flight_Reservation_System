/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FlightReservationExceptions;

/**
 *
 * @author Zahera
 */
public class PersonNotFoundException extends RuntimeException{
    
    private String searchedEmail;

    public PersonNotFoundException(String searchedEmail, String message) {
        super(message);
        this.searchedEmail = searchedEmail;
    }

    public PersonNotFoundException(String searchedEmail) {
        this.searchedEmail = searchedEmail;
    }

    public String getSearchedEmail() {
        return searchedEmail;
    }
    
}
