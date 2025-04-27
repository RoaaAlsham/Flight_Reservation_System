/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservationObjects;

/**
 *
 * @author Zahera
 */
public class Airport {
    private static int baseCounter=0;
    private int airportId;
    private String airportName ;
    private String city;
    private String Country;

    public Airport() {
        airportId= ++baseCounter;
        
    }

    public Airport(String airportName, String city, String Country) {
        this.airportName = airportName;
        this.city = city;
        this.Country = Country;
        
        airportId= ++baseCounter;
    }

   

    public String getAirportName() {
        return airportName;
       
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAirportId() {
        return airportId;
    }

    public void setAirportId(int airportId) {
        this.airportId = airportId;
    }
    
    
}
