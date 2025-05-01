/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservationObjects;

import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.Vector;
/**
 *
 * @author Zahera
 */
public class Flight {
    private int flightId;
    private static int baseCounter;
    private Airport originAirport;
    private Airport destinationAirport;
    private LocalDateTime departureTime;
    private int seatPrice;
    private Vector<Reservation> reservations= new Vector<>();
    private Vector<Seat> reservedSeats= new Vector<>();
    private int flightSeatNumber;
    private Vector<Seat> seats;

   
    
    public Flight(Airport originAirport, Airport destinationAirport, 
        LocalDateTime departureTime, int flightSeatNumber,int seatPrice) {
        this.originAirport = originAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;

        this.flightId= ++baseCounter;
        
        this.seatPrice= seatPrice;
        this.flightSeatNumber = flightSeatNumber;
        seats=new Vector<>();
                                       
        for (int i = 0; i < flightSeatNumber; i++) {
            seats.add(new Seat(seatPrice));
        }
//        //initiliaze seat types
//        for (int i = 0; i < seats.size(); i++) {
//            int seatTypeCode= i%3; //0 ,1 or 2 
//            seats.add(new Seat(seatTypeCode));//its available by default
//                   
//        }    
    }
    public void unReserveSeats(Vector<Seat> reserved){
    
        for(Seat reservedSeat: reserved){
            reservedSeats.remove(reservedSeat); 
        }
        int unreservedSeat=0;
        
        for(Seat seat: seats){
        
            if(seat.isAvaliable()==false){
                seat.setAvaliable(true);                 

                unreservedSeat++;
            }
            if(unreservedSeat==reserved.size()){
                break;
            }
        
        }
    }
    public Vector<Seat> reserveSeat( int seatnum ){
        Vector<Seat> newSeats= new Vector<>();
        int reservedSeatCount=0;
        for (Seat seat : seats) {
            if(seat.isAvaliable()==true){
                seat.setAvaliable(false);                 
                reservedSeats.add(seat);
                newSeats.add(seat);
                
                reservedSeatCount++;
            }
            if(reservedSeatCount==seatnum){
                break;
            }
        }
        return newSeats;
    }
    
    public int getFlightId() {
        return flightId;
    }

    public Airport getOriginAirport() {
        return originAirport;
    }

    public void setOriginAirport(Airport originAirport) {
        this.originAirport = originAirport;
    }

    public Airport getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(Airport destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }
//
//    /**
//     * 
//     * @param seatTypeCode 
//     * 0 - aisleSeat
//     * 1 - middleSeat
//     * 2 - windowSeat
//     * @return 
//     */
//    public ArrayList<Seat> getAvalilableSeatNumberBySeatCode(int seatTypeCode ){
//        
//        ArrayList<Seat> availableSeats= new ArrayList<>();
//        for (Seat airplaneSeat : seats) {
//            if(airplaneSeat.getSeatType().getSeatCode()==seatTypeCode && airplaneSeat.isAvaliable()==true){
//                
//                availableSeats.add(airplaneSeat);
//            }
//        }
//        return availableSeats;
//    }
    public ArrayList<Seat> getAvalilableSeats( ){
        ArrayList<Seat> availableSeats= new ArrayList<>();
        for (Seat airplaneSeat : seats) {
            if(airplaneSeat.isAvaliable()==true){
                availableSeats.add(airplaneSeat);
            }
        }
        return availableSeats;
    }
    
    
//    public ArrayList<Seat> reserveMultipleSeatBySeatType(int seatTypeCode, int count ){
//            
//            ArrayList<Seat> reservedSeats= new ArrayList<>();
//            for(Seat seat: seats){
//            if(seat!=null&&seat.isAvaliable()&&seat.getSeatType().getSeatCode()==seatTypeCode){
//                seat.setAvaliable(false);
//                reservedSeats.add(seat);
//                }
//            }
//            if(reservedSeats.size()==count){
//                return reservedSeats;
//            }else{
//                for (Seat reservedSeat : reservedSeats) {
//                    reservedSeat.setAvaliable(true);
//                }
//            throw new IllegalStateException("Only " + reservedSeats.size() 
//                + " seats available out of requested " + count);
//            }
//            
//    }

    public int getFlightSeatNumber() {
        return flightSeatNumber;
    }

    public void setFlightSeatNumber(int flightSeatNumber) {
        this.flightSeatNumber = flightSeatNumber;
    }

    public Vector<Seat> getFlightSeats() {
        return seats;
    }

    public void setFlightSeats(Vector<Seat> seats) {
        this.seats = seats;
    }

    public int getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(int seatPrice) {
        this.seatPrice = seatPrice;
    }

    public Vector<Seat> getSeats() {
        return seats;
    }

    public void setSeats(Vector<Seat> seats) {
        this.seats = seats;
    }

    public Vector<Seat> getReservedSeats() {
        return reservedSeats;
    }

    public void setReservedSeats(Vector<Seat> reservedSeats) {
        this.reservedSeats = reservedSeats;
    }

    public Vector<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Vector<Reservation> reservations) {
        this.reservations = reservations;
    }
    
}
