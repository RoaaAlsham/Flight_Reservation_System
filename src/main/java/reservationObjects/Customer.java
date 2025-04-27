/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservationObjects;

import FlightReservationExceptions.PasswordDoesntMatchEmailException;
import java.time.LocalDate;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author Zahera
 */
public class Customer extends Person{
    private static int baseCounter=0;
    private int CustomerId;
    
    
    private Vector<Reservation> customerReservations;

    public Customer() {
        CustomerId= ++baseCounter;
        customerReservations= new Vector<>();
    }

    public Customer(String firstName, String LastName, String email,String password, LocalDate date) {
        
        super(firstName, LastName, email, date,password);
        CustomerId= ++baseCounter;
        customerReservations= new Vector<>();
    }

    public Customer(String firstName, String LastName, String email,String password) {
        super(firstName, LastName, email,password);
        CustomerId= ++baseCounter;
        customerReservations= new Vector<>();
       
    }

   
    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int CustomerId) {
        this.CustomerId = CustomerId;
    }

    public Vector<Reservation> getCustomerReservations() {
        return customerReservations;
    }

    public void setCustomerReservations(Vector<Reservation> customerReservations) {
        this.customerReservations = customerReservations;
    }
    
    public void makePayment(Reservation reservation){
        reservation.setReservationPaid(true);
        if(!customerReservations.contains(reservation))
            customerReservations.add(reservation);
    }
    public String showReservations(){
        String text="";
        for (Reservation customerReservation : customerReservations) {
            text+= customerReservation.toString()+"\n";
        }
        return text;
    }

    @Override
    public String toString() {
        
        return super.toString()+ "Customer{" + "customerReservations=" + showReservations()+ '}';
    }
 
    
   
    
}
