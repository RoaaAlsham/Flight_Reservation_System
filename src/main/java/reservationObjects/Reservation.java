/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservationObjects;

import java.util.Vector;

/**
 *
 * @author Zahera
 */
public class Reservation {
    private int reservationId;
    private static int baseCounter;
    private Customer customer;
    private Vector<Seat> reservedSeats= new Vector<>();
    private boolean reservationPaid;
    private Flight flight;
    private float TicketPrice;
    
    public Reservation(Customer customer, Vector<Seat> reservedSeats, Flight flight) {
        this.reservationId=++baseCounter;
        this.customer = customer;
        this.reservedSeats = reservedSeats;
        this.flight = flight;
        TicketPrice=this.calculateReservationPrice();
    }
    
    public int calculateReservationPrice(){
        int sum=0;
        for (Seat reservedSeat : reservedSeats) {
            sum+=reservedSeat.getSeatPrice();
        }
        return sum;
    }

    public int getReservationId() {
        return reservationId;
    }

    

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vector<Seat> getReservedSeats() {
        return reservedSeats;
    }

    public void setReservedSeats(Vector<Seat> reservedSeats) {
        this.reservedSeats = reservedSeats;
    }

    public boolean isReservationPaid() {
        return reservationPaid;
    }

    public void setReservationPaid(boolean reservationPaid) {
        this.reservationPaid = reservationPaid;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public float getTicketPrice() {
        return TicketPrice;
    }

    public void setTicketPrice(float TicketPrice) {
        this.TicketPrice = TicketPrice;
    }    
}
