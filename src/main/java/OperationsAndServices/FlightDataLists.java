/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OperationsAndServices;

import java.util.Vector;
import java.util.ArrayList;
import reservationObjects.*;

/**
 *
 * @author Zahera
 */
public class FlightDataLists {

    public FlightDataLists() {
        
    }
    
        private Vector <Reservation> reservations= new Vector<>();
        private Vector <Airport> airports= new Vector<>();
        private Vector <Customer> customers= new Vector<>();
        private Vector <Admin> admins= new Vector<>();
        private Vector <Flight> flights= new Vector<>();

    public void setReservations(Vector <Reservation> reservations) {
        this.reservations = reservations;
    }

    public void setAirports(Vector <Airport> airports) {
        this.airports = airports;
    }

    public void setCustomers(Vector<Customer> customers) {
        this.customers = customers;
    }

    public void setAdmins(Vector <Admin> admins) {
        this.admins = admins;
    }

    public void setFlights(Vector <Flight> flights) {
        this.flights = flights;
    }

    public Vector<Reservation> getReservations() {
        return reservations;
    }

    public Vector<Airport> getAirports() {
        return airports;
    }

    public Vector<Customer> getCustomers() {
        return customers;
    }

    public Vector<Admin> getAdmins() {
        return admins;
    }

    public Vector<Flight> getFlights() {
        return flights;
    }

 
}
