/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OperationsAndServices;
import FlightReservationExceptions.PersonNotFoundException;
import reservationObjects.Admin;
/**
 *
 * @author Zahera
 */
public class AdminOperations {
    FlightDataLists flightDataList;
    public AdminOperations(FlightDataLists flightDataList){
        this.flightDataList=flightDataList;
    }
    public Admin getAdminByEmail(String email) throws PersonNotFoundException{
    
        for (Admin admin : flightDataList.getAdmins()){
            if(admin.getEmail().equalsIgnoreCase(email.trim())){
                return admin;
            }
        }
        throw new PersonNotFoundException(email, "\n No admin found with this email");
    }
    
   public void addTOAdminList(Admin admin){
       flightDataList.getAdmins().add(admin);
   }
    public void     removeFromAdminList(Admin admin){
       flightDataList.getAdmins().remove(admin);
   }
    public void updateAdminInfo(Admin  admin){
        Admin oldAdmin= getAdminByEmail(admin.getEmail());
        oldAdmin.setBirthDate(admin.getBirthDate());
        oldAdmin.setFirstName(admin.getFirstName());
        oldAdmin.setLastName(admin.getLastName());
        oldAdmin.setPassword(admin.getPassword());
        
    }
}
