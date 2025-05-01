/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OperationsAndServices;

import FlightReservationExceptions.EmptyFieldException;
import FlightReservationExceptions.InvalidEmailFormatException;
import reservationObjects.Customer;

import FlightReservationExceptions.PersonNotFoundException;
import FlightReservationExceptions.UsedEmailException;

/**
 *
 * @author Zahera
 */

public class CustomerOperations {
    FlightDataLists flightDataList;
    public CustomerOperations(FlightDataLists flightDataList){
        this.flightDataList=flightDataList;
    }
    public Customer getCustomerByEmail(String Email) throws PersonNotFoundException{
    
        for(Customer customer : flightDataList.getCustomers()){
            if(customer.getEmail().equalsIgnoreCase(Email)){
                return customer;
            }
        }
        throw new PersonNotFoundException(Email);
    }
    public boolean doesCustomerEmailExists(String Email){
        for(Customer customer : flightDataList.getCustomers()){
            if(customer.getEmail().equalsIgnoreCase(Email)){
                return true;
            }
        }
        return false;
    }
    public boolean doesPasswordMatchEmail(String Email, String Password){
        if(getCustomerByEmail(Email).getPassword().equals(Password)){
            return true;
        }else{
            return false;
        }    
    }
    public void addCustomerToList(Customer customer) throws UsedEmailException,InvalidEmailFormatException
    ,EmptyFieldException{
        EmailValidator.isValid(customer.getEmail());
        if(doesCustomerEmailExists(customer.getEmail())){
            throw new UsedEmailException(customer.getEmail());
        }
        
        flightDataList.getCustomers().add(customer);
    }
    public void removeCustomerFromList(Customer customer){
        flightDataList.getCustomers().remove(customer);
    }
    public void updateCustomerInfo(Customer customer){
        Customer oldCustomer= getCustomerByEmail(customer.getEmail());
        oldCustomer.setCustomerReservations(customer.getCustomerReservations());
        oldCustomer.setBirthDate(customer.getBirthDate());
        oldCustomer.setFirstName(customer.getFirstName());
        oldCustomer.setLastName(customer.getLastName());
        oldCustomer.setPassword(customer.getPassword());
        
    }
}
