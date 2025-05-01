/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enumFiles;

/**
 *
 * @author Roaa
 */
public enum seatTypes {
    Window_Seat(0),
    Middle_Seat(1),
    Aisle_Seat(2);

    private int seatPrice = 100;
    private int seatCode;

    seatTypes(int seatCode) {
        this.seatCode = seatCode;
    }

    public int getSeatCode() {
        return seatCode;
    }

    public void setSeatCode(int seatCode) {
        this.seatCode = seatCode;
    }

    public int getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(int seatPrice) {
        this.seatPrice = seatPrice;
    }

}
