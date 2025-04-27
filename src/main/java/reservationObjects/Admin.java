/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservationObjects;

import java.time.LocalDate;

/**
 *
 * @author Zahera
 */
public class Admin extends Person {
    private static int baseCounter=0;
    private int AdminId;

    public int getAdminId() {
        return AdminId;
    }

    public void setAdminId(int AdminId) {
        this.AdminId = AdminId;
    }

    public Admin() {
        AdminId=++baseCounter;
    }

    public Admin(String firstName, String LastName, String email, LocalDate date, String password) {
        super(firstName, LastName, email, date, password);
        AdminId=++baseCounter;
    }

    public Admin(String firstName, String LastName, String email, String password) {
        super(firstName, LastName, email, password);
        AdminId=++baseCounter;        
    }
}
