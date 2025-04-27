/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FlightReservationExceptions;

/**
 *
 * @author Zahera
 */
public class UsedEmailException extends RuntimeException{
    String askedEmail;
    public UsedEmailException(String askedEmail){
        super("the asked email \n"+askedEmail+" is already in use \n"
                + "please try another email");
        this.askedEmail= askedEmail;
    }
    public String getUsedEmail(){
        return this.askedEmail;
    }
}
