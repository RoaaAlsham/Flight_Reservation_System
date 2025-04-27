/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservationObjects;

import enumFiles.seatTypes;

/**
 *
 * @author Zahera
 */
public class Seat {
    private static int baseCounter=0;
    private int seatId;
    private boolean avaliable= true;
    private int seatPrice;
    //private seatTypes seatType;
    
    public Seat(int seatPrice) {
        //this.seatType = seatTypes.getSeatTypeBySeatCode(seatCode);
        this.seatPrice=seatPrice;
        this.seatId= ++baseCounter;
    }
     

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public boolean isAvaliable() {
        return avaliable;
    }

    public void setAvaliable(boolean avaliable) {
        this.avaliable = avaliable;
    }


//    public seatTypes getSeatType() {
//        return seatType;
//    }
//
//    public void setSeatType(seatTypes seatType) {
//        this.seatType = seatType;
//    }

    public int getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(int seatPrice) {
        this.seatPrice = seatPrice;
    }
    
    
}
