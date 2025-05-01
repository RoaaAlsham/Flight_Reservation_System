/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FlightReservationExceptions;

import reservationObjects.Flight;

/**
 *
 * @author Zahera
 */
public class NoAvailableSeatException extends RuntimeException{
    private Flight flight;
    private int askedSeatNumber;

    public NoAvailableSeatException(Flight flight, int askedSeatNumber) {
        super("no available seat found for this flight, \n already reserved seat count is : "+ 
                flight.getReservedSeats().size() +"\n so asked seat number "+askedSeatNumber+" cannot be reserved");
        this.flight = flight;
        this.askedSeatNumber = askedSeatNumber;
    }

    public Flight getFlight() {
        return flight;
    }

    public int getAskedSeatNumber() {
        return askedSeatNumber;
    }


    
}
