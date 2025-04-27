/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OperationsAndServices;

import OperationsAndServices.FlightDataLists;
import java.util.Vector;
import reservationObjects.*;
/**
 *
 * @author Zahera
 */
public class ReservationOperations {
    FlightDataLists flightDataList;

    public ReservationOperations(FlightDataLists flightDataList) {
        this.flightDataList = flightDataList;
    }
    public Flight getFlightById(int flightId) throws IllegalArgumentException{
        if(flightId<0){
            throw new IllegalArgumentException("Flight Id must be positive "+ flightId);
        }
        for(Flight flight : flightDataList.getFlights()){
            if (flight.getFlightId()== flightId){
                return flight;
            }
        }
        throw new IllegalArgumentException("No flight found with ID: " + flightId);
        
    }
    
    public Vector<Flight> getFlightListAccordingToDestinationCity(String cityName){
        Vector<Flight> appropriateFlights= new Vector<>();
        for(Flight flight : flightDataList.getFlights()){
            if(flight.getDestinationAirport().getCity().equals(cityName)){
                appropriateFlights.add(flight);
            }
        }
        return appropriateFlights;
    }
    public void addResevationToList(Reservation reservation){
        flightDataList.getReservations().add(reservation);
    }
    public void addFlightToList(Flight flight){
        flightDataList.getFlights().add(flight);
    }
    public Airport returnAirportByCity(String city){
        for(Airport airport: flightDataList.getAirports()){
            if(airport.getCity().equals(city)){
                return airport;
            }
        }
        return null;
    }
}
